package com.it.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.it.common.utils.PageUtils;
import com.it.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author zzw
 * @email 3354353337@qq.com
 * @date 2022-07-30 10:05:47
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

