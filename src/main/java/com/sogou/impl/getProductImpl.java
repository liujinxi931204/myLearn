package com.sogou.impl;

import com.sogou.mapper.getProductMapper;
import com.sogou.pojo.Product;
import com.sogou.service.getProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author liujinxi@sogou-inc.com
 * date 2020-10-27 17:47
 **/

@Service("getProduct")
public class getProductImpl implements getProductDao {


    @Autowired
    @Qualifier("productMapper")
    private getProductMapper getProductMapper;

    @Override
    public List<Product> getAllProduct() {
        return getProductMapper.findAllProduct();
    }

    @Override
    public Product getProductById(int id) {
        return getProductMapper.findProductById(id);
    }
}
