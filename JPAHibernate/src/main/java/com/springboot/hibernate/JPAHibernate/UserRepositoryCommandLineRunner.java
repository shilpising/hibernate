package com.springboot.hibernate.JPAHibernate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.hibernate.JPAHibernate.entity.User;
import com.springboot.hibernate.JPAHibernate.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository; 
	
	private static final Logger logger=LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Override
	public void run(String... args) throws Exception {
		User shilpi1=new User("shilpi2","Admin");
		userRepository.save(shilpi1);
		logger.info("new user created"+shilpi1);
		logger.info("user 1 find============="+userRepository.findById(1L));
		logger.info("All user found============="+userRepository.findAll());
	}

}
