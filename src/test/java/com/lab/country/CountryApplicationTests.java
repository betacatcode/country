package com.lab.country;

import com.lab.country.mapper.UserMapper;
import com.lab.country.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CountryApplicationTests {
	@Autowired
	UserMapper userMapper;

	@Autowired
	UserService userService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void getPassWordTest(){
		System.out.println(userMapper.getPassWordByAccount("aa"));
	}

	@Test
	public void insertUserTest(){
		userMapper.insertUser("bb","456");
	}

	@Test
	public void checkAccount(){
		System.out.println("aa："+userService.checkAccount("aa"));
		System.out.println("ab："+userService.checkAccount("ab"));
		System.out.println("xx："+userService.checkAccount("xx"));
	}
}
