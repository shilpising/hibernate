package com.springboot.hibernate.JPAHibernate.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.hibernate.JPAHibernate.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
