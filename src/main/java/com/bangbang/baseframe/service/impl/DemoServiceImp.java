package com.bangbang.baseframe.service.impl;

import com.bangbang.baseframe.dao.DemoDAO;
import com.bangbang.baseframe.model.ResponseResult;
import com.bangbang.baseframe.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

/**
 * @Author Joy
 * @Date 2018/12/23 21:20
 **/
@Component
@Transactional
public class DemoServiceImp implements DemoService {

    @Autowired
    private DemoDAO demoDAO;

    @Override
    public ResponseResult saveDemo(String name, Integer age) {
        demoDAO.saveDemo(name, age);
        return ResponseResult.success("save successed !!!");
    }
}
