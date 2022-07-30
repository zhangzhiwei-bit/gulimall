package com.it.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.it.common.utils.PageUtils;
import com.it.gulimall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author zzw
 * @email 3354353337@qq.com
 * @date 2022-07-30 15:29:02
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

