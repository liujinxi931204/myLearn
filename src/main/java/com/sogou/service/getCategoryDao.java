package com.sogou.service;

import com.sogou.pojo.Category;


import java.util.List;

/**
 * author liujinxi@sogou-inc.com
 * date 2020-10-27 15:36
 **/
public interface getCategoryDao {

    public List<Category> getAllCategory();
    public Category getCategoryById(int id);


}
