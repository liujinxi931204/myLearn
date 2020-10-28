package com.sogou.impl;

import com.sogou.mapper.getCategoryMapper;
import com.sogou.pojo.Category;
import com.sogou.service.getCategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author liujinxi@sogou-inc.com
 * date 2020-10-27 15:37
 **/
@Service("getCategory")
public class getCategoryImpl implements getCategoryDao {

    @Qualifier("categoryMapper")
    @Autowired
    private getCategoryMapper getCategoryMapper;

    @Override
    public List<Category> getAllCategory() {
        return getCategoryMapper.findAllCategory();
    }

    @Override
    public Category getCategoryById(int id) {
        return getCategoryMapper.findCategoryById(id);
    }
}
