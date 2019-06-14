package com.lab.country.serviceImpl;

import com.lab.country.mapper.UserMapper;
import com.lab.country.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ruin
 * @date 2019/5/25-15:04
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public boolean checkUserLogin(String account, String password) {
        String queryPassWord=userMapper.getPassWordByAccount(account);
        if (queryPassWord!=null&&queryPassWord.equals(password))
            return true;
        return false;
    }

    @Override
    public void register(String account, String password) {
        userMapper.insertUser(account,password);
    }

    @Override
    public boolean checkAccount(String account) {
        if(userMapper.getAccount(account)==null)
            return false;
        return true;
    }
}


