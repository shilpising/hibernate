package com.springboot.hibernate.JPAHibernate.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;	
import org.springframework.stereotype.Repository;
import com.springboot.hibernate.JPAHibernate.entity.User;

@Repository
@Transactional
public class UserDaoService {
	
	/*User shilpi=new User("shilpi","Admin");
	User shilpi1=new User("shilpi1","Admin");
	//PersistenceContext
	 * shilpi.setRole("user");//tracked by the entityManager
	 * shilpi1.setRole("user");//not tracked by entityManager
	*/
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public long insert(User user) {
		entityManager.persist(user);
		return user.getId();
	}

}
