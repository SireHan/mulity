package com.informationstorm.controller;

import com.informationstorm.mysqlwithmybatis.model.SysUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by JoinHan on 2017/3/20.
 */
@Controller
public class UserController {
    /*
        后台系统用户登录
     */
    @RequestMapping(value = {"/sysUser/login"})
    @ResponseBody
    public String sysLogin(SysUser sysuser) {
        //验证账户名 密码
        //根据用户名查询账户信息
        if (sysuser != null) {
            System.out.println("nihao");
        }


        return "nihao";
    }
}
