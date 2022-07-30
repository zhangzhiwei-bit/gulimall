package com.it.gulimall.product;

import com.it.gulimall.product.entity.BrandEntity;
import com.it.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {


    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {

        BrandEntity brandEntity=new BrandEntity();
        brandEntity.setName("华为");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }

}
