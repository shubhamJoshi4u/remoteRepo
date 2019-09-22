package com.odd.jobs.oddjobs.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class UserModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "USER_ID")
	private int userId;
	
	@Column(name = "USER_EMAIL", length = 100, nullable = false)
	private String email;
	
	@Column(name = "USER_NAME",length = 40, nullable = false)
	private String userName;
	
	@Column(name = "PASSWORD",length = 150, nullable = false)
	private String password;

	@Column(name = "FIRST_NAME",length = 20, nullable = false)
	private String firstName;
	
	@Column(name = "LAST_NAME",length = 20, nullable = false)
	private String lastName;
	
	@Column(name = "CONTACT_NO",length = 20, nullable = false)
	private String contactNumber;
	
	@Column(name = "RATING",length = 5, nullable = false)
	private float rating = 0f;
	
	@Column(name = "INFO",length = 1000, nullable = false)
	private String profileInfo;
	
	@Column(name = "USER_STATE",length = 15, nullable = false)
	private String userState;
	
	@Column(name = "ACCOUNT_STATUS",length = 15, nullable = false)
	private String accountStatus;
	
	@Column(name = "ROLES",length = 20, nullable = false)
	private List<String> role = new ArrayList<>();

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getProfileInfo() {
		return profileInfo;
	}

	public void setProfileInfo(String profileInfo) {
		this.profileInfo = profileInfo;
	}

	public List<String> getRole() {
		return role;
	}

	public void setRole(List<String> role) {
		this.role = role;
	}

	public String getUserState() {
		return userState;
	}

	public void setUserState(String userState) {
		this.userState = userState;
	}
	
	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}


}
