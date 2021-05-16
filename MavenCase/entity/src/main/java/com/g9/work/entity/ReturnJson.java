package com.g9.work.entity;

/**
 * @Author:XiaoYang01
 * @Date: 2021/5/15 19:51 @Week: 星期六
 * @Package: MavenCase
 * @Annotation
 */
public class ReturnJson {
    private boolean flag;
    private String message;
    private Object obj;

    //构造器
    public ReturnJson() {

    }

    public ReturnJson(boolean flag, String message, Object obj) {
        this.flag = flag;
        this.message = message;
        this.obj = obj;
    }

    //set,get
    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage() {
        this.message = message;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    @Override
    public String toString() {
        return "ReturnJson{" +
                "flag=" + flag +
                ", message='" + message + '\'' +
                ", obj=" + obj +
                '}';
    }
}
