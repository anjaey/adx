package com.bhe.business.system;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bhe.dao.mybatis.model.SysResourceEntity;
import com.bhe.util.common.BusinessData;

/**
 * 创 建 人：  Administrator
 * 日     期：  2015年7月31日上午10:19:01
 * 描     述：  栏目管理业务层接口
 * <br>--------------------------------------<br>
 * 修 改 人： 
 * 日     期： 
 * 描     述：  扼要说明修改原因，修改详细请注明到方法级
 * <br>--------------------------------------<br>
 */
@Service
public interface ISysResourceBusiness {
	/**
	 * 栏目的添加
	 * zhangyu [2015年7月25日 上午9:57:25]
	 * 
	 * @param art
	 * @return
	 * @throws Exception
	 */
	public BusinessData<Boolean> insertSysRes(SysResourceEntity sysRes) ;
	
	/**
	 * 根据uuid删除栏目信息
	 * 可以批量删除
	 * zhangyu [2015年7月25日 上午10:01:50]
	 * 
	 * @param uuids
	 * @return
	 * @throws Exception
	 */
	public BusinessData<Boolean> deleteSysRes(int id) ;
	
	/**
	 * 修改栏目
	 * zhangyu [2015年7月25日 上午10:02:56]
	 * 
	 * @param art
	 * @return
	 * @throws Exception
	 */
	public BusinessData<Boolean> updateSysRes(SysResourceEntity sysRes);
	
	/**
	 * 根据主键查询栏目信息 
	 * zhangyu [2015年7月25日 上午10:09:41]
	 * 
	 * @param uuid
	 * @return
	 * @throws Exception
	 */
	public BusinessData<SysResourceEntity> selectSysResid(int id);

	/**
	 * 创 建 人：  Administrator
	 * 日     期：  2015年7月31日上午10:23:38
	 * 描     述： 根据父级栏目编号查询所有子级栏目
	 * <br>-----------------------------<br>
	 * 修 改 人： 林
	 * 日     期： 2015年8月20日 15:31:04
	 * 描     述： 添加字段status状态,orderParam排序参数,orderRank排序方式
	 * <br>-----------------------------<br>
	 */
	public BusinessData<List<SysResourceEntity>> selectSysResByparid(int parentid,Integer status,String orderParam,String orderRank);
	
	/**
	 * 创 建 人：  林
	 * 日     期：  2015年8月12日下午2:47:38
	 * 描     述：根据nameen查询数据
	 * @param nameen				英文名称
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<SysResourceEntity> selectSysResByNameEn(String nameen, Integer pageIndex, Integer pageSize);
	
	/**
	 * 创 建 人：  林
	 * 日     期：  2015年8月12日下午4:02:20
	 * 描     述：					查询所有栏目
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<SysResourceEntity> selectSysResByAll(Integer pageIndex, Integer pageSize);
	
	/**
	 * @author: Dengpeng 
	 * @date: 2015年8月20日上午9:56:53
	 * @description:根据code 查询
	 * @param nameen
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 * <br>-----------------------------<br>
	 * @update:
	 * @date: 
	 * @description:	(注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<SysResourceEntity> selectSysResByCode(String code);
	
	
}
