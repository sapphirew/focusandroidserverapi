package com.focus.androidserverapi.model;

public class PatientIdsViewModel {
	private int patientId;
	private int age;

	public PatientIdsViewModel(int patientId, int age) {
		super();
		this.patientId = patientId;
		this.age = age;
	}
	public PatientIdsViewModel() {
		
	}
	public PatientIdsViewModel(int patientId) {
		super();
		this.patientId = patientId;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
