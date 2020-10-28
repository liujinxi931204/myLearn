package com.sogou.mapper;

import com.sogou.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * author liujinxi@sogou-inc.com
 * date 2020-10-27 11:44
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class testGetCategory {

    @Autowired
    private getCategoryMapper getCategoryMapper;

    @Test
    public void testFindAllCategory(){
        List<Category> allCategory = getCategoryMapper.findAllCategory();
        for (Category category : allCategory) {
            System.out.println(category);
        }
    }
}
