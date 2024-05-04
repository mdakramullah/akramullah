package com.nt.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "USER_DET")
public class UserEntity {
	@Id
	
	
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="LICENSE_SEQ")
	
	@SequenceGenerator(name="LICENSE_SEQ",sequenceName="LICENSE_SEQ",allocationSize=1)

	
	private Integer userId;
	private String userName;
	private String userAddress;
	private long userMoNumber;
	
public UserEntity() {
		super();
	}
	
	
	public UserEntity(Integer userId, String userName, String userAddress, long userMoNumber) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAddress = userAddress;
		this.userMoNumber = userMoNumber;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public long getUserMoNumber() {
		return userMoNumber;
	}
	public void setUserMoNumber(long userMoNumber) {
		this.userMoNumber = userMoNumber;
	}
	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", userName=" + userName + ", userAddress=" + userAddress
				+ ", userMoNumber=" + userMoNumber + "]";
	}
	
	
}
