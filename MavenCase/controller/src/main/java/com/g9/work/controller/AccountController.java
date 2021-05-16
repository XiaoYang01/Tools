package com.g9.work.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.g9.work.entity.Account;
import com.g9.work.entity.ReturnJson;
import com.g9.work.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author:XiaoYang01
 * @Date: 2021/5/15 18:13 @Week: 星期六
 * @Package: MavenCase
 * @Annotation
 */
@Controller
@RequestMapping("/aco")
public class AccountController {
    //service依赖
    @Autowired
    @Qualifier(value = "accountServiceImpl")
    private AccountService accountService;
    //json依赖
    @Autowired(required = false)
    @Qualifier(value = "obj")
    private ObjectMapper obj;

    //增加
    @PostMapping("/add")
    @ResponseBody
    public String addAcount(@RequestBody Account account) throws JsonProcessingException {
        //调用method
        int result = accountService.addAcountService(account);
        //if
        if(result > 0){
           return obj.writeValueAsString(new ReturnJson(true,"添加成功",""));
        }
        return obj.writeValueAsString(new ReturnJson(false,"添加失败",""));
    }
}
