package com.nilzxq;

public class UserEntity {

	private String position;
	private String userName;
	private String webAddress;
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getWebAddress() {
		return webAddress;
	}
	public void setWebAddress(String webAddress) {
		this.webAddress = webAddress;
	}
	@Override
	public String toString() {
		return "UserEntity [position=" + position + ", userName=" + userName
				+ ", webAddress=" + webAddress + "]";
	}
}
