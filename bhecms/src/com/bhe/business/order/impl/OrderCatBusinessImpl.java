package com.bhe.business.order.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhe.business.order.IOrderCartBusiness;
import com.bhe.dao.mybatis.mapper.OrderCartEntityMapper;
import com.bhe.dao.mybatis.model.OrderCartEntity;
import com.bhe.dao.mybatis.model.OrderCartEntityCriteria;
import com.bhe.dao.mybatis.model.OrderCartEntityCriteria.Criteria;
import com.bhe.util.common.BusinessData;
import com.bhe.util.common.BusinessUtil;
import com.bhe.util.common.CommonUtil;
import com.bhe.util.common.ErrorCodeUtil;
import com.bhe.util.common.StringUtil;

/**
 * 创 建 人： Administrator 日 期： 2015年7月30日下午4:43:07 描 述： 购物车接口实现 <br>
 * --------------------------------------<br>
 * 修 改 人： 日 期： 描 述： 扼要说明修改原因，修改详细请注明到方法级 <br>
 * --------------------------------------<br>
 */
@Service
public class OrderCatBusinessImpl implements IOrderCartBusiness {

	@Autowired
	private OrderCartEntityMapper orderCartEntityMapper;

	@Override
	public BusinessData<Boolean> insertOrderByBeach(OrderCartEntity ose) {
		int rows = 0;
		BusinessData<Boolean> bd = null;
		try {
			rows = orderCartEntityMapper.insert(ose);
			bd = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			bd = new BusinessData<Boolean>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, rows, null);
		}
		return bd;
	}

	@Override
	public BusinessData<Boolean> deleteOrderByKey(Long id) {
		int rows = 0;
		BusinessData<Boolean> bd = null;
		try {
			rows = orderCartEntityMapper.deleteByPrimaryKey(id);
			bd = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			bd = new BusinessData<Boolean>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, rows, null);
		}
		return bd;
	}

	@Override
	public BusinessData<Boolean> updateOrderByKey(OrderCartEntity ose) {
		int rows = 0;
		BusinessData<Boolean> bd = null;
		try {
			rows = orderCartEntityMapper.updateByPrimaryKeySelective(ose);
			bd = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			bd = new BusinessData<Boolean>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, rows, null);
		}
		return bd;
	}

	@Override
	public BusinessData<OrderCartEntity> selectOrderByEntity(Integer pageIndex, Integer pageSize, String orderType, String orderFile, String userid) {
		OrderCartEntityCriteria osec = new OrderCartEntityCriteria();
		BusinessData<OrderCartEntity> bd = null;

		try {
			osec.setLimitStart(BusinessUtil.getLimitStart(pageSize, pageIndex));
			osec.setLimitEnd(BusinessUtil.getLimitEnd(pageSize, pageIndex));

			if (!CommonUtil.isEmpty(orderType, orderFile)) {
				osec.setOrderByClause("order by ${" + orderFile + "} ${" + orderType + "}");
			}

			if (!CommonUtil.isEmpty(userid)) {
				// osec.createCriteria().andu
			}

			// 分页查询
			List<OrderCartEntity> auticlelist = orderCartEntityMapper.selectByExample(osec);

			// 得到数量
			Integer count = orderCartEntityMapper.countByExample(new OrderCartEntityCriteria());
			bd = new BusinessData<OrderCartEntity>(true, pageIndex, pageSize, null, count, auticlelist);
		} catch (NullPointerException e) { // 空指针异常捕捉
			bd = new BusinessData<OrderCartEntity>(false, pageIndex, pageSize, ErrorCodeUtil.LANG_NULLPOINTEREXCEPTION, null, null);
		} catch (Exception e) {
			bd = new BusinessData<OrderCartEntity>(false, pageIndex, pageSize, ErrorCodeUtil.UNKNOWN_EXCEPTION, null, null);
		}
		return bd;
	}

	@Override
	public BusinessData<OrderCartEntity> selectOrderByUuid(String uuid, String userUuid) {
		OrderCartEntityCriteria osec = new OrderCartEntityCriteria();
		if (StringUtil.isNull(uuid) || StringUtil.isNull(userUuid)) {
			return new BusinessData<OrderCartEntity>(false, ErrorCodeUtil.LANG_NULLPOINTEREXCEPTION, null);
		} else {
			Criteria criteria = osec.createCriteria();
			criteria.andProductidEqualTo(uuid);
			criteria.andCreateuserEqualTo(userUuid);
			return new BusinessData<OrderCartEntity>(true, null, orderCartEntityMapper.selectByExampleForOne(osec));
		}

	}

	@Override
	public BusinessData<OrderCartEntity> selectAll(String userUuid) {
		OrderCartEntityCriteria osec = new OrderCartEntityCriteria();
		osec.createCriteria().andCreateuserEqualTo(userUuid);
		List<OrderCartEntity> list = orderCartEntityMapper.selectByExample(osec);
		return new BusinessData<OrderCartEntity>(true, null, null, null, list.size(), list);
	}

	@Override
	public BusinessData<Boolean> deleteOrderBySelective(String productid, String userid) {

		int rows = 0;
		BusinessData<Boolean> bd = null;
		try {
			OrderCartEntityCriteria criteria = new OrderCartEntityCriteria();
			Criteria createCriteria = criteria.createCriteria();
			createCriteria.andProductidEqualTo(productid);
			createCriteria.andCreateuserEqualTo(userid);
			rows = orderCartEntityMapper.deleteByExample(criteria);
			bd = new BusinessData<Boolean>(true, null, rows, null);
		} catch (Exception e) {
			bd = new BusinessData<Boolean>(false, ErrorCodeUtil.SQL_EXECUTE_EXCEPTION, rows, null);
		}

		return bd;

	}

}
