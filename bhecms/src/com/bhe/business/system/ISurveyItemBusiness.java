package com.bhe.business.system;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.bhe.dao.mybatis.model.SurveyItemEntity;
import com.bhe.util.common.BusinessData;

/**
 * @Description 调查
 * @author schoff [2015年7月23日]
 */
@Service
public interface ISurveyItemBusiness {

	
	/**
	 * @Description			插入数据
	 * @param entity		需要插入的数据
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> insertSurveyItem(SurveyItemEntity entity);
	
	/**
	 * @Description			根据主键删除数据
	 * @param primaryKey	需要删除的数据的主键
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> deleteSurveyItemByKey(long primaryKey);
	
	/**
	 * @Description			根据主键修改数据
	 * @param entity		需要修改的数据包含主键的值
	 * @return				State对象[操作结果]
	 * @author schoff [2015]
	 */
	public BusinessData<Boolean> updateSurveyItemByKey(SurveyItemEntity entity);
	
	
	/**
	 * @Description			查询数据[自定义]
	 * @param entity		需要查询的数据条件
	 * @param pageIndex		当前页数
	 * @param pageSize		每页显示数
	 * @return				State对象[需要返回的数据的]
	 * @author schoff [2015]
	 */
	public BusinessData<SurveyItemEntity> selectSurveyItemByMap(Map<String, Object> map, Integer pageIndex, Integer pageSize);
	
	/**
	 * @Description			查询数据[surveyid]
	 * @param surveyid		根据[surveyid]查询
	 * @param pageIndex		当前页数
	 * @param pageSize		每页显示数
	 * @return				State对象[需要返回的数据的]
	 * @author schoff [2015]
	 */
	public BusinessData<SurveyItemEntity> selectSurveyItemBySurveyid(Long surveyid, Integer pageIndex, Integer pageSize);
	
}
