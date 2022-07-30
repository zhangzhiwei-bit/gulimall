package com.it.gulimall.order.dao;

import com.it.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author zzw
 * @email 3354353337@qq.com
 * @date 2022-07-30 15:58:36
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
