package com.focus.androidserverapi.model;

public class UserIdViewModel {
	private int userId;

	public UserIdViewModel() {
	}
	public UserIdViewModel(int userId) {
		super();
		this.userId = userId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}
