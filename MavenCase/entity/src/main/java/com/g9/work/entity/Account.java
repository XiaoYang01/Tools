package com.g9.work.entity;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @Author:XiaoYang01
 * @Date: 2021/5/15 18:49 @Week: 星期六
 * @Package: MavenCase
 * @Annotation
 */
@Component
public class Account {
    private int id;
    private BigDecimal money;

    //构造器
    public Account() {
    }

    public Account(int id, BigDecimal money) {
        this.id = id;
        this.money = money;
    }

    //set,get
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", money=" + money +
                '}';
    }
}
