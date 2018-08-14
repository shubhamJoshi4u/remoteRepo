package spring.business.model.frames;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.transaction.SystemException;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
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
	
	@NotBlank(message = "Username field is mandatory. ")
	@NotNull(message = "Username field is mandatory. ")
	@Size(max = 40, message="This file can accomodate maximum of 40 characters. ")
	@Pattern(regexp = "[a-z-A-Z]*", message = "user name has invalid characters")
	private String userName;
	
	@NotNull(message = "user Type field is mandatory. ")
	@NotBlank(message = "user Type field is mandatory. ")
	private String userType;
	
	@NotNull(message = "email Id field is mandatory. ")
	@NotBlank(message = "email Id field is mandatory. ")
	@Email(message = "Email Adderess in not valid")
	private String emailId;
	
	@NotNull(message = "password field is mandatory. ")
	@NotBlank(message = "password field is mandatory. ")
	private String password;
	
	@NotNull(message = "city field is mandatory. ")
	@NotBlank(message = "city field is mandatory. ")
	private String city;
	
	@NotNull(message = "Mobile Number field is mandatory. ")
	@NotBlank(message = "Mobile Number field is mandatory. ")
	@Pattern(regexp="(^$|[0-9]{10})", message = "Mobile number field can only accept numbers 10 character long")
	private String mobileNo;
	
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
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
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
