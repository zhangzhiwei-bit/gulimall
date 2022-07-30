package com.it.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.it.common.utils.PageUtils;
import com.it.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author zzw
 * @email 3354353337@qq.com
 * @date 2022-07-30 16:08:05
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

