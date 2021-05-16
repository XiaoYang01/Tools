package com.g9.work.mapper;

import com.g9.work.entity.Account;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

/**
 * @Author:XiaoYang01
 * @Date: 2021/5/15 19:05 @Week: 星期六
 * @Package: MavenCase
 * @Annotation
 */
@Repository
public interface AccountMapper {
    @Insert("insert into account value(#{id},#{money})")
    int add(Account account);
}
