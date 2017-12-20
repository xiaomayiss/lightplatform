package com.frable.example.testunit;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.faberi.example.entity.User;
import com.faberi.example.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMybatis {
	private static Logger logger = Logger.getLogger(TestMybatis.class);
	
	@Autowired
	private IUserService userService;
	
	@Test
	public void test1() {
		User user = userService.getUserById(1);
		logger.info(JSON.toJSONString(user));
	}
}
