package com.lab.country.mapper;

import com.lab.country.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * @author ruin
 * @date 2019/5/24-20:41
 */
@Component
public interface UserMapper {

    @Select("select * from tb_user where id=#{id}")
    public User getUserById(Integer id);

    @Select("select account from tb_user where account=#{account}")
    public String getAccount(String account);

    @Select("select password from tb_user where account=#{account}")
    public String getPassWordByAccount(String account);

    @Insert("insert into tb_user(account,password) values (#{account},#{password})")
    public int insertUser(@Param("account") String account, @Param("password") String password);
}
