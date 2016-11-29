package com.nilzxq;

import java.util.List;


public class RootEntity {

	private String errorCode;
	private String errorMsg;
	private List<UserEntity> date;
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public List<UserEntity> getDate() {
		return date;
	}
	public void setDate(List<UserEntity> date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "RootEntity [errorCode=" + errorCode + ", errorMsg=" + errorMsg
				+ ", date=" + date + "]";
	}
}
