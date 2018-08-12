package spring.business.model.frames;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.transaction.SystemException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import data.acess.obj.interfaces.UserCRUD;
import spring.business.model.interfaces.UserServiceInterface;

@Service("UserBean")
@Scope("prototype")
@Entity 
@Table(name = "Users")
public class User implements UserServiceInterface{
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String userName;
	private String userType;
	private String emailId;
	private String password;
	private String city;
	private long mobileNo;
	
	@Autowired
	@Qualifier("UserDaoImplBean")
	@Transient
	private UserCRUD userDao;
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public UserCRUD getUserDao() {
		return userDao;
	}

	public void setUserDao(UserCRUD userDao) {
		System.out.println("setUserDao called");
		this.userDao = userDao;
	}

	@Override
	public boolean createUser() throws IllegalStateException, SystemException {
	try {
		userDao.createUser(this);
		return true;
	} catch (Exception ex) {
		ex.printStackTrace();
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
	
}
