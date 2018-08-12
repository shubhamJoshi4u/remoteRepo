package spring.business.model.interfaces;

import java.util.List;

import javax.transaction.SystemException;

public interface UserServiceInterface {
	
	
	public boolean createUser() throws IllegalStateException, SystemException;
	public boolean removeUser();
	public boolean updateUser(String primaryKey);
	public Object fetchByKey(String key);
	public List<Object> fetchAll();


}
