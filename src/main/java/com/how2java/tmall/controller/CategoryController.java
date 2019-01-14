package com.how2java.tmall.controller;

import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.pojo.UploadedImageFile;
import com.how2java.tmall.service.CategoryService;
import com.how2java.tmall.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.List;

/**
 * @author tyc
 * @date 2018/11/21
 */
@Controller
@RequestMapping("/admin")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping("/category_list")
    public String list(Model model,Page page){
        int total = categoryService.total();
        page.setTotal(total);
        List<Category> cs = categoryService.list(page);
        model.addAttribute("cs",cs);
        model.addAttribute("page",page);
        return "admin/listCategory";
    }

    @RequestMapping(value = "/addCategory",method = RequestMethod.POST)
    public void addCategory(Category c, HttpSession session, UploadedImageFile uploadedImageFile){
        categoryService.addCategory(c);
        File imageFile = new File(session.getServletContext().getRealPath("img/category"));
        File file = new File(imageFile,c.getName()+".jpg");
        if (!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
            //// TODO: 2019/1/15
        }

    }




}
