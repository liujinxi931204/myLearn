package com.sogou.controller;

import com.sogou.impl.getProductImpl;
import com.sogou.pojo.Product;
import com.sogou.service.getProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author liujinxi@sogou-inc.com
 * date 2020-10-27 17:50
 **/

@Controller
@RequestMapping("/Product")
public class ProductController {

    @Autowired
    private getProductDao getProductDao;

    @RequestMapping("/getProduct/{id}")
    public String getProductById(@PathVariable("id")int id, Model model){

        Product product = getProductDao.getProductById(id);
        model.addAttribute("id",product.getId());
        model.addAttribute("name",product.getName());
        model.addAttribute("price",product.getPrice());
        model.addAttribute("cid",product.getCid());
        return "showProduct";
    }




}
