package com.how2java.tmall.controller;

import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.service.TeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author tyc
 * @date 2019/1/2
 */
@Controller
@RequestMapping("/test")
public class TeController {

    @Autowired
    TeService teService;

//    @RequestMapping("/find")
//    public String list(Model model){
//        List<Category> cs = teService.find();
//        model.addAttribute("cs",cs);
//        return "admin/listCategory";
//
//    }

    @RequestMapping("/find")
    public List<Category> list(){
        return teService.find();


    }
}
