package com.it.gulimall.product.dao;

import com.it.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zzw
 * @email 3354353337@qq.com
 * @date 2022-07-30 10:05:47
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
