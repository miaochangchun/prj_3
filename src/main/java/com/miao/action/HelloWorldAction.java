package com.miao.action;

/**
 * Created by 10048 on 2017/8/10.
 */
public class HelloWorldAction {
    private String msg;

    public String getMsg(){
        return msg;
    }

    public String excute(){
        msg = "nihao";
        return "success";
    }
}
