package com.how2java.tmall.service.Impl;

import com.how2java.tmall.mapper.TeMapper;
import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.service.TeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tyc
 * @date 2019/1/2
 */
@Service
public class TeServiceImpl implements TeService {
    @Autowired
    TeMapper teMapper;

    @Override
    public List<Category> find() {
        return teMapper.find();
    }
}
