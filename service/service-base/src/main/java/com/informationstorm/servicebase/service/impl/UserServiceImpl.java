package com.informationstorm.servicebase.service.impl;

import com.informationstorm.mysqlwithmybatis.dao.FrontUserMapper;
import com.informationstorm.mysqlwithmybatis.model.FrontUser;
import com.informationstorm.servicebase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by JoinHan on 2017/3/17.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private FrontUserMapper frontUserMapper;

    public boolean addFrontUser(FrontUser frontUser) {
        return frontUserMapper.insert(frontUser)>0;
    }

    public boolean updateFrontUser(FrontUser frontUser) {
        return frontUserMapper.updateByPrimaryKey(frontUser)>0;
    }

    public boolean dealFrontUser(FrontUser frontUser) {
        return false;
    }
}
