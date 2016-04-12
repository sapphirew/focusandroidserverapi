package com.focus.androidserverapi.model;

public class UserExistsViewModel {
	private String username;
	
	public UserExistsViewModel() {
	}
	public UserExistsViewModel(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
