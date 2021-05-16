package com.g9.work.service.impl;

import com.g9.work.entity.Account;
import com.g9.work.mapper.AccountMapper;
import com.g9.work.service.AccountService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author:XiaoYang01
 * @Date: 2021/5/15 19:31 @Week: 星期六
 * @Package: MavenCase
 * @Annotation
 */
@Service
public class AccountServiceImpl implements AccountService {
    //dao层引用
    @Autowired
    private SqlSessionTemplate sqlsession;

    @Override
    @Transactional
    public int addAcountService(Account account) {
        System.out.println("account = " + account);
        AccountMapper mapper = sqlsession.getMapper(AccountMapper.class);
        //获取数据
        int result = mapper.add(account);
        //if
        if(result > 0){
            return result;
        }
        return result;
    }
}
