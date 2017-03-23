package com.informationstorm.servicebase.service;


import com.informationstorm.mysqlwithmybatis.model.FrontUser;

/**
 * Created by JoinHan on 2017/3/17.
 */
public interface UserService {

    /**
     * Add front user boolean.
     *
     * @param frontUser the front user
     * @return the boolean
     */
/*
    * 创建前台用户
    */
    boolean addFrontUser(FrontUser frontUser);

    /**
     * Update front user boolean.
     *
     * @param frontUser the front user
     * @return the boolean
     */
/*
    * 修改前台用户
    */
    boolean updateFrontUser(FrontUser frontUser);

    boolean dealFrontUser(FrontUser frontUser);


}
