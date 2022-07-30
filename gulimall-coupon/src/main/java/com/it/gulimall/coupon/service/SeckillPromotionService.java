package com.it.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.it.common.utils.PageUtils;
import com.it.gulimall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author zzw
 * @email 3354353337@qq.com
 * @date 2022-07-30 15:01:17
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

