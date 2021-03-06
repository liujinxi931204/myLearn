package com.sogou.mapper;

import com.sogou.pojo.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * author liujinxi@sogou-inc.com
 * date 2020-10-27 14:11
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class testGetProduct {

    @Autowired
    private getProductMapper getProductMapper;

    @Test
    public void testFindAllProduct(){
        List<Product> allProduct = getProductMapper.findAllProduct();
        for (Product product : allProduct) {
            System.out.println(product);
        }

    }
}
