package com.lab.country.service;

/**
 * @author ruin
 * @date 2019/5/25-15:01
 */
public interface UserService {

    boolean checkUserLogin(String account,String password);

    void register(String account,String password);

    boolean checkAccount(String account);
}
