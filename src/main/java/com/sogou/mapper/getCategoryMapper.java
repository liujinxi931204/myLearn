package com.sogou.mapper;

import com.sogou.pojo.Category;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * author liujinxi@sogou-inc.com
 * date 2020-10-27 11:37
 **/
@Repository("categoryMapper")
public interface getCategoryMapper {

    List<Category> findAllCategory();
    Category findCategoryById(@Param("id")int id);
}
