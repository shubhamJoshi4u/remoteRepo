package data.acess.obj.interfaces;

import java.util.List;

import javax.transaction.SystemException;

import spring.business.model.interfaces.UserServiceInterface;

public interface UserCRUD {
	
	public boolean createUser(UserServiceInterface obj) throws IllegalStateException, SystemException;
	public boolean removeUser();
	public boolean updateUser(String primaryKey);
	public Object fetchByKey(String key);
	public List<Object> fetchAll();

}
