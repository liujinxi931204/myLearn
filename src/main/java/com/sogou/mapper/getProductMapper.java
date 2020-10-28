package com.sogou.mapper;

import com.sogou.pojo.Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * author liujinxi@sogou-inc.com
 * date 2020-10-27 14:10
 **/
@Repository("productMapper")
public interface getProductMapper {

    List<Product> findAllProduct();
    Product findProductById(@Param("id")int id);
}
