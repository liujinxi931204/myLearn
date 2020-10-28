package com.sogou.service;

import com.sogou.pojo.Product;

import java.util.List;

/**
 * author liujinxi@sogou-inc.com
 * date 2020-10-27 17:46
 **/
public interface getProductDao {

    public List<Product> getAllProduct();
    public Product getProductById(int id);

}
