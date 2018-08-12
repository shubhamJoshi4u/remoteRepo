package data.access.obj.models;

import java.util.List;

import javax.transaction.SystemException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import data.acess.obj.interfaces.UserCRUD;
import spring.business.model.frames.User;
import spring.business.model.interfaces.UserServiceInterface;

@Repository("UserDaoImplBean")
public class UserDAO implements UserCRUD {

	private SessionFactory sessionFactory;

	@Override
	public boolean createUser(UserServiceInterface obj) throws IllegalStateException, SystemException {
		System.out.println("inside Dao create");
		System.out.println("sessionFac :: "+sessionFactory);
		Session	session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.save((User) obj);
			session.getTransaction().commit();
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			session.getTransaction().rollback();	
			return false;
		}
	}

	@Override
	public boolean removeUser() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(String primaryKey) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object fetchByKey(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> fetchAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	
	@Autowired
	@Qualifier("sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		System.out.println("set sessionFactory");
		this.sessionFactory = sessionFactory;
	}

}
