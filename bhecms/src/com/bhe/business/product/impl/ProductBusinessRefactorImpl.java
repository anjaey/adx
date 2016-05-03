package com.bhe.business.product.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.bhe.business.BaseBusiness;
import com.bhe.business.product.refactor.IProductBusiness;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ConstantUtil;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.ImageUtils;

@Service
public class ProductBusinessRefactorImpl extends BaseBusiness implements IProductBusiness {

	@Override
	public Map<String, Object> insertProduct(Map<String, Object> dataMap) {
		// 状态码: 1正确 2插入失败 3没有必须的参数
		Map<String, Object> resutlMap = new HashMap<String, Object>();
		try {
			Integer insertOne = commonDao.insertOne(dataMap, tablename.get("product"));
			
			if (insertOne > 0) {
				resutlMap.put(KEY_STATE, 1);
			} else {
				resutlMap.put(KEY_STATE, 2);
			}
		} catch (Exception e) {
			resutlMap.put(KEY_STATE, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION.toString());
			log.error("添加商品数据失败",e);
		}
		return resutlMap;
	}

	@Override
	public Map<String, Object> deleteProductByUuid(String uuid) {
		Map<String, Object> resutlMap = new HashMap<>();
		if(CommonUtil.isEmpty(uuid)){
			return new HashMap<>();
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("uuid", uuid);
		try {
			rows = commonDao.deleteOne(map, tablename.get("product"));
			resutlMap.put(ConstantUtil.RESULT_ROWS, rows);
		} catch (Exception e) {
			resutlMap.put(ConstantUtil.RESULT_ERRORCODE,ErrorCodeUtil.SQL_EXECUTE_EXCEPTION.toString());
			log.error("数据删除错误",e);
		}
		return resutlMap;
	}

	@Override
	public Map<String, Object> deleteProductByUuidList(List<String> uuids) {
		if(CommonUtil.isEmpty(uuids)){
			return new HashMap<>();
		}
		Map<String, Object> map = new HashMap<>();
		try {
			rows = commonDao.deleteBatch(uuids, "uuid", tablename.get("product"));
			map.put(ConstantUtil.RESULT_ROWS, rows);
		} catch (Exception e) {
			map.put(ConstantUtil.RESULT_ERRORCODE, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION.toString());
			log.error("批量删除错误",e);
		}
		return map;
	}

	@Override
	public Map<String, Object> updateProductForStatus(String uuids, int status) {
		Map<String, Object> resultMap = new HashMap<>();
		
		if(CommonUtil.isEmpty(uuids)){
			return new HashMap<>();
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pk", "uuid");
		map.put("uuid", uuids);
		map.put("status", status);
		try {
			if(uuids.contains(",")){
				int[] updateBatch = commonDao.updateBatch(getBatchParam(uuids, status));
				resultMap.put(ConstantUtil.RESULT_ROWS, updateBatch.length);
			}else {
				rows = commonDao.updateOne(map, tablename.get("product"));
				resultMap.put(ConstantUtil.RESULT_ROWS, rows);
			}
		} catch (Exception e) {
			resultMap.put(ConstantUtil.RESULT_ERRORCODE, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION.toString());
			log.error("修改数据",e);
		}
		return resultMap;
	}
	
	/**
	 * @author: 林
	 * @date: 2015年9月2日下午2:26:06
	 * @description: 获取批量修改的参数形式
	 * @param uuids 需要修改的数据uuid
	 * @param status 修改的数据
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	private List<Map<String, Object>> getBatchParam(String uuids, int status) {
		List<Map<String, Object>> maps = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		if(!CommonUtil.isEmpty(uuids)){
			for (String uuid : uuids.split(",")) {
				map.put("uuid", uuid);
				map.put("status", status);
				map.put("pk", "uuid");
				map.put("tableName", tablename.get("product"));
				maps.add(map);
			}
		}
		return maps;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Map<String, Object> selectProductForManage(Map<String, Object> map) {
		Map<String, Object> resultMap = new HashMap<>();
		resultMap.putAll(map);
		map.put(ConstantUtil.RESULT_FUZZY, "namecn");
		try {
			super.init(map);
		} catch (ClassCastException e) {
			resultMap.put(ConstantUtil.RESULT_ERRORCODE, ErrorCodeUtil.LANG_ILLEGALARGUMENTEXCEPTION.toString());
			log.error("参数格式错误",e);
		}
		
		String sql = getSql(map,"product");
		List<Object> params = getParam(map);
		try {
			list = commonDao.selectList(sql, params);
			Long total = commonDao.selectTotalCount(sql, params);
			resultMap.put(ConstantUtil.RESULT_COUNTPAGE, (total + pageSize - 1) / pageSize);
			resultMap.put(ConstantUtil.RESULT_DATA, list);
		} catch (Exception e) {
			resultMap.put(ConstantUtil.RESULT_ERRORCODE, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION.toString());
			log.error("查询数据失败",e);
		}
		setProductRelateInfo((List<Map<String, Object>>)resultMap.get(ConstantUtil.RESULT_DATA));
		return resultMap;
	}
	
	public Map<String, Object> selectProductList(Map<String, Object> dataMap) {
		// 状态码: 1正确 2没有数据
		Map<String, Object> reMap = new HashMap<String, Object>();
		List<Object> paramsList = new ArrayList<Object>();
		
		StringBuffer sql = new StringBuffer(" SELECT `id`, `uuid`, `productNo`, `nameCn`, `modelName`, `type`, `count`, "
				+ " `price`, `status`, `hits`, `keywords`, `description`, `warnNum`, `createTime`, `updateTime`, `remark`, `articleId`, "
				+ " `showType`, `clazzid`, `brandid`, `providerid`, `unit`, `validity`, `canSale`, `hasFreight`, `weight`, "
				+ "`bulk`, `level`, `saleType`, `color`, `size`, `sayCount`, `commonSort`, `productivity`, `isrent`, "
				+ "`appliesField`, `power`, `pressure`, `rotatingSpeed`, `capacity`, `dryingTime`, `workWidth`, `noise`, `motivation`, "
				+ "`toShowProduct`, `toPopular` ").append(tablename.get("product"));
		String userSql = "select userName from t_user where uuid = ?";
		
		try {
			// 参数处理
			handleSql(dataMap, sql, paramsList, "namecn");
			
			// 查询
			List<Map<String, Object>> reList = commonDao.selectList(sql.toString(), paramsList);
			Long total = commonDao.selectTotalCount(sql.toString(), paramsList);
			
			// 值处理
			if (reList != null && reList.size() > 0) {
				int reListLen = reList.size();
				Map<String, Object> productMap = null;
				for (int i = 0; i < reListLen; i++) {
					productMap = reList.get(i);
					Object userKey = productMap.get("userkey");
//					Object uuid = productMap.get("uuid");
//					Object clazzid = productMap.get("clazzid");
					
					// 处理作者
					String userName = commonDao.selectForObject(userSql, new Object[]{userKey}, String.class);
					productMap.put("userName", userName);
					
					// 处理附件
					productMap.put("attachmentList", "");
					
					// 处理分类
					
					// 处理状态
				}
			
				reMap.put(KEY_STATE, 1);
				reMap.put("data", reList);
				reMap.put("pageIndex", dataMap.get("pageIndex"));
				reMap.put("pageSize", dataMap.get("pageSize"));
				reMap.put("count", total);
			} else {
				reMap.put(KEY_STATE, 2);
			}
		} catch (Exception e) {
			reMap.put(KEY_STATE, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION);
			log.error("产品列表查询错误");
		}
		return reMap;
	}
	
	/**
	 * @author: 林
	 * @date: 2015年9月2日下午2:12:42
	 * @description: 获取跟产品相关信息
	 * @param list 需要获取的产品信息的产品集合
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	@SuppressWarnings("unchecked")
	private void setProductRelateInfo(List<Map<String, Object>> list) {
		if(CommonUtil.isEmpty(list)){
			return ;
		}
		//行号
		int rowno = (pageIndex-1)*pageSize;
		for (Map<String, Object> map : list) {
			rowno ++;
			map.put("rowno", rowno);

			// 作者
			Map<String, Object> selectUserDetailByuuid = selectUserDetailByuuid((String)map.get("userkey"));
			list = (List<Map<String, Object>>) selectUserDetailByuuid.get(ConstantUtil.RESULT_DATA);
			map.put("user", list);
			// 产品附件
			Map<String, Object> productAttachmentByUuid = selectProductAttachmentByUuid(true, (String) map.get("uuid"), ConstantUtil.PRO_FILE_PROINFO);
			list = (List<Map<String, Object>>) productAttachmentByUuid.get(ConstantUtil.RESULT_DATA);
			if(list.size() != 0 && list.get(0) != null){
				map.put("imgurl",ImageUtils.getImageUrl(list.get(0).get("url"))); // 重新设置图片访问地址
			}
			map.put("productattachment", productAttachmentByUuid);
			// 产品分类
			if(map.get("clazzid") != null){
				long clazzid = (Long) map.get("clazzid");
				Map<String, Object> productCategoryById = selectProductCategoryById(clazzid);
				list = (List<Map<String, Object>>) productCategoryById.get(ConstantUtil.RESULT_DATA);
				if(list.size() != 0 && list.get(0) != null){
					map.put("clazzname", list.get(0).get("namecn"));
				}
			}
			// 产品上架处理状态
			Object object= map.get("status");
			if (!CommonUtil.isEmpty(object)) {
				String status = object.toString();
				if ("1".equals(status)) { //上架
					map.put("status", "上架");
				} else{ //下架
					map.put("status", "下架");
				}
			}
		}
	}
	
	/**
	 * @author: 林
	 * @date: 2015年9月2日下午1:42:02
	 * @description: 查询用户详情
	 * @param uuid 查询的id
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	private Map<String, Object> selectUserDetailByuuid(String uuid) {
		Map<String, Object> resultMap = new HashMap<>();
		if(CommonUtil.isEmpty(uuid)){
			return new HashMap<>();
		}
		Map<String, Object> map = new HashMap<>();
		map.put("uuid", uuid);
		try {
			super.init(map);
		} catch (ClassCastException e) {
			resultMap.put(ConstantUtil.RESULT_ERRORCODE, ErrorCodeUtil.LANG_ILLEGALARGUMENTEXCEPTION.toString());
			log.error("参数格式错误",e);
		}
		String sql = getSql(map,"userdetail");
		List<Object> params = getParam(map);
		try {
			list = commonDao.selectList(sql, params);
			resultMap.put(ConstantUtil.RESULT_DATA, list);
		} catch (Exception e) {
			resultMap.put(ConstantUtil.RESULT_ERRORCODE, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION.toString());
			log.error("查询数据失败",e);
		}
		return resultMap;
	}
	
	/**
	 * @author: 查询产品附件信息
	 * @date: 2015年9月2日下午1:42:23
	 * @description:
	 * @param isMain 是否主要的
	 * @param keyid 对应产品uuid
	 * @param filemodule 所属模块
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	private Map<String, Object> selectProductAttachmentByUuid(boolean isMain, String keyid,String filemodule) {
		Map<String, Object> resultMap = new HashMap<>();
		Map<String, Object> map = new HashMap<>();
		if(CommonUtil.isEmpty(keyid) || CommonUtil.isEmpty(filemodule)){
			return new HashMap<>();
		}
		map.put("keyid", keyid);
		map.put("filemodule", filemodule);
		map.put("ismain", isMain);
		try {
			super.init(map);
		} catch (ClassCastException e) {
			resultMap.put(ConstantUtil.RESULT_ERRORCODE, ErrorCodeUtil.LANG_ILLEGALARGUMENTEXCEPTION.toString());
			log.error("参数格式错误",e);
		}
		String sql = getSql(map,"productattachment");
		List<Object> params = getParam(map);
		try {
			list = commonDao.selectList(sql, params);
			resultMap.put(ConstantUtil.RESULT_DATA, list);
		} catch (Exception e) {
			resultMap.put(ConstantUtil.RESULT_ERRORCODE, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION.toString());
			log.error("查询数据失败",e);
		}
		return resultMap;
	}
	
	/**
	 * @author: 林
	 * @date: 2015年9月2日下午1:45:06
	 * @description: 查询产品分类信息
	 * @param id 需要查询的数据的id
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	private Map<String, Object> selectProductCategoryById(long id) {
		Map<String, Object> resultMap = new HashMap<>();
		Map<String, Object> map = new HashMap<>();
		map.put("id",id);
		try {
			super.init(map);
		} catch (ClassCastException e) {
			resultMap.put(ConstantUtil.RESULT_ERRORCODE, ErrorCodeUtil.LANG_ILLEGALARGUMENTEXCEPTION.toString());
			log.error("参数格式错误",e);
		}
		
		String sql = getSql(map, "productcategory");
		List<Object> params = getParam(map);
		try {
			list = commonDao.selectList(sql, params);
			resultMap.put(ConstantUtil.RESULT_DATA, list);
		} catch (Exception e) {
			resultMap.put(ConstantUtil.RESULT_ERRORCODE, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION.toString());
			log.error("查询数据失败",e);
		}
		return resultMap;
	}
	

}
