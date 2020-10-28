package com.sogou.controller;

import com.sogou.impl.getCategoryImpl;
import com.sogou.pojo.Category;
import com.sogou.service.getCategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author liujinxi@sogou-inc.com
 * date 2020-10-27 15:07
 **/

@Controller
@RequestMapping("/Category")
public class CategoryController {

    @Autowired
    private getCategoryDao getCategoryDao;

    @RequestMapping("/getCategory/{id}")
    public String getCategoryById(@PathVariable("id")int id,Model model){
        Category category = getCategoryDao.getCategoryById(id);
        model.addAttribute("id",category.getId());
        model.addAttribute("name",category.getName());
        return "showCategory";
    }
}
