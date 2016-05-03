package com.bhe.business.system.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.LinkedMap;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhe.business.BaseBusiness;
import com.bhe.business.system.ISysDictBusiness;
import com.bhe.dao.mybatis.mapper.SysDictEntityMapper;
import com.bhe.dao.mybatis.model.SysDictEntity;
import com.bhe.dao.mybatis.model.SysDictEntityCriteria;
import com.bhe.develop.web.DictUtil;
import com.bhe.util.CacheTemp;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.ListMapUtil;
import com.bhe.util.common.StringUtil;
import com.bhe.util.common.UuidUtil;

/**
 * 字典工具业务实现类
 * @author sslf
 * @datetime 2015年7月7日上午10:16:13
 */
@Service
public class SysDictBusinessImpl extends BaseBusiness implements ISysDictBusiness{

	@Autowired
	private SysDictEntityMapper sysDictEntityMapper;

	private BusinessData<Boolean> date = null;
	private BusinessData<SysDictEntity> dateEntity = null;

	private SysDictEntity entity;

	/* 查询字典表 并存放到缓存
	 * @see com.bhe.business.ISysDictBusiness#selectAll()
	 */
	@Override
	public void selectAll() throws Exception {
		SysDictEntityCriteria criteria = new SysDictEntityCriteria();
		
		List<SysDictEntity> data = sysDictEntityMapper.selectByExample(criteria);
//		String sql = "select uuid,nameCn,nameEn,parentId,createUser,orgId,createTime,status from t_sys_dict";
//		List<SysDictEntity> data = (List<SysDictEntity>) this.commonDao.selectObject(sql, null,SysDictEntity.class);
		
		//TODO 字典初始化 nameMap 待分组
		// key 为nameEn，value 为parentId
		Map<String, String> nameParentIdMap = new LinkedMap<String, String>();
		// key为nameEn，uuid为value
		Map<String, String> nameMap = new HashMap<String, String>();
		// key为parentId，value 为该节点的直接子类
		Map<String, List<SysDictEntity>> valuesMap = new HashMap<String, List<SysDictEntity>>();
		
		// 数据库原始数据，英文名称为key 值为该行数据
		Map<String, SysDictEntity> dataMap = new HashMap<String, SysDictEntity>();
		
		// 解析封装nameMap 和 valuesMap
		for (SysDictEntity dataEntity : data) {
			
			String uuid = dataEntity.getUuid();
			// nameMap 的key nameEn 是不会出现重复的，所以直接存放
			nameMap.put(dataEntity.getNameen(),uuid);
			
			// 添加nameParentIdMap
			String parentId = dataEntity.getParentid();
			// 是顶级节点 替换parentId 为 0dingjijiedian0
			if (StringUtils.isEmpty(parentId)){
				parentId = CacheTemp.superParentId;
			}
			nameParentIdMap.put(dataEntity.getNameen(), parentId);
			
			// 添加valuesMap
			List<SysDictEntity> tempList = valuesMap.get(parentId);
			
			if (tempList == null){
				tempList = new ArrayList<SysDictEntity>();
				tempList.add(dataEntity);
				valuesMap.put(parentId, tempList);
			}else {
				tempList.add(dataEntity);
			}
			
			// 填充原始数据map
			dataMap.put(dataEntity.getNameen(), dataEntity);
			
		}
		
		// 放入缓存
		CacheTemp.nameMap = nameMap;
		CacheTemp.valuesMap = valuesMap;
		CacheTemp.nameParentIdMap = nameParentIdMap;
		CacheTemp.dataMap = dataMap;
	}

	/**
	 * @Description 添加方法的通用方法，根据需求添加具体的字典数据时，自定义好nameen后调用该方法【暂时不提供】
	 * @author schoff [2015年7月22日]
	 * @return State
	 */
	public BusinessData<Boolean> insert(SysDictEntity entity) {
		
		try {
			entity.setUuid(UuidUtil.generateUUID());
			entity.setCreatetime(new Date());
			entity.setStatus(0);
			
			int rows = sysDictEntityMapper.insertSelective(entity);
			
			/*数据库更新后需要更新缓存中的数据*/
			new DictUtil().addDictCache(entity);
			
			date = new BusinessData<Boolean>(true, null, rows, null);
			
		} catch (Exception ee) {
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return date;
	}
	
	@Override
	public BusinessData<Boolean> updateByKey(Map<String, Object> map) {
		try {
			entity = (SysDictEntity) ListMapUtil.setEntityValue(map, SysDictEntity.class);
			rows = sysDictEntityMapper.updateByPrimaryKeySelective(entity);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception ee) {
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		
		
		/*缓存数据更新*/
		if (!StringUtil.isNull(entity.getDescription())) {
			new DictUtil().refreshDictCache();
		}else {
			new DictUtil().updateDictCache(entity.getNameen(), entity.getContent(), entity.getStatus());
		}
		return date;
	}
	
	@Override
	public BusinessData<Boolean> updateByNameen(Map<String, Object> map) {
		try {
			entity = (SysDictEntity) ListMapUtil.setEntityValue(map, SysDictEntity.class);
			
			SysDictEntityCriteria criteria = new SysDictEntityCriteria();
			criteria.createCriteria().andNameenEqualTo(entity.getNameen());
			
			rows = sysDictEntityMapper.updateByExampleSelective(entity, criteria);
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception ee) {
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		
		
		
		/*缓存数据更新*/
		if (!StringUtil.isNull(entity.getDescription())) {
			new DictUtil().refreshDictCache();
		}else {
			new DictUtil().updateDictCache(entity.getNameen(), entity.getContent(), entity.getStatus());
		}
		return date;
	}

	@Override
	public BusinessData<Boolean> deleteByKey(Map<String, Object> map) {
		
		try {
			entity = (SysDictEntity) ListMapUtil.setEntityValue(map, SysDictEntity.class);
			rows = sysDictEntityMapper.deleteByPrimaryKey(entity.getUuid());
			date = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception ee) {
			date = new BusinessData<Boolean>(false, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		
		
		if (!StringUtil.isNull((entity.getNameen()))) {
			new DictUtil().deleteDictCache(entity.getNameen());
		}else {
			new DictUtil().refreshDictCache();
		}
		
		return date;
	}
	
	@Override
	public BusinessData<SysDictEntity> selectChilds(String nameEn) {
		dateEntity = new BusinessData<SysDictEntity>(true ,null, null, null, null, DictUtil.getChilds(nameEn));
		return dateEntity;
	}

	@Override
	public Map<String, List<SysDictEntity>> selectAllChilds(String nameEn) {
		return new DictUtil().getAllChilds(nameEn);
	}

	@Override
	public BusinessData<SysDictEntity> selectTopNode() {
		dateEntity = new BusinessData<SysDictEntity>(true, null, null, null, null, new DictUtil().getSuperNode());
		return dateEntity;
	}

	@Override
	public Map<String, SysDictEntity> selectChildsMap(String nameEn) {
		return DictUtil.getMapChilds(nameEn);
	}

	@Override
	public SysDictEntity selectDictBynameEn(String nameEn) {
		return DictUtil.getSelf(nameEn);
	}

	




}
