package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.User;

public class UserDao
{
EntityManagerFactory factory=Persistence.createEntityManagerFactory(null);
EntityManager manager=factory.createEntityManager();
EntityTransaction transcation=manager.getTransaction();




public void save(User user) {
	// TODO Auto-generated method stub
	
	transcation.begin();
	manager.persist(user);
	transcation.commit();
}




public User find(int userid) {
	// TODO Auto-generated method stub
	return manager.find(User.class, userid);
}

}
