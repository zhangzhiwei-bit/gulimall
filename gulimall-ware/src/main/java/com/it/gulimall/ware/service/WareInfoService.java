package com.it.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.it.common.utils.PageUtils;
import com.it.gulimall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author zzw
 * @email 3354353337@qq.com
 * @date 2022-07-30 16:08:05
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

