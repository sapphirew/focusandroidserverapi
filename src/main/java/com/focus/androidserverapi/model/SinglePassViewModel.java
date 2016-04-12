package com.focus.androidserverapi.model;

public class SinglePassViewModel {
	private String password;
	
	public SinglePassViewModel() {
	}

	public SinglePassViewModel(String password) {
		super();
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
}
