package com.springboot.hibernate.JPAHibernate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.hibernate.JPAHibernate.entity.User;
import com.springboot.hibernate.JPAHibernate.service.UserDaoService;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner{

	@Autowired
	private UserDaoService userDaoService; 
	
	private static final Logger logger=LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	
	@Override
	public void run(String... args) throws Exception {
		User shilpi1=new User("shilpi1","Admin");
		long userId=userDaoService.insert(shilpi1);
		logger.info("new user created"+shilpi1+"--"+userId);
		//new user createdUser [id=1, name=shilpi1, role=Admin]--1
	}

}
