package com.how2java.tmall.service;

import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.util.Page;

import java.util.List;

/**
 * @author tyc
 * @date 2018/11/21
 */
public interface CategoryService {

    List<Category> list(Page page);

    int total();

}
