package com.it.gulimall.order.dao;

import com.it.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zzw
 * @email 3354353337@qq.com
 * @date 2022-07-30 15:58:36
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
