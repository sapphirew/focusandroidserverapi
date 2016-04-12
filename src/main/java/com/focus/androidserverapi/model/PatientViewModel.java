package com.focus.androidserverapi.model;

public class PatientViewModel {
    private int patientId;
    private int medNo;
    private String patientName;
    private String patientAddress;
    private String phoneNumber;
    private int gender;
    private int isFinished;
    private int age;
    private int userId;

    public PatientViewModel(){}

    public PatientViewModel(int patientId, int medNo, String patientName, String patientAddress, String phoneNumber, int gender, int isFinished, int age, int userId) {
        this.patientId = patientId;
        this.medNo = medNo;
        this.patientName = patientName;
        this.patientAddress = patientAddress;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.isFinished = isFinished;
        this.age = age;
        this.userId = userId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getMedNo() {
        return medNo;
    }

    public void setMedNo(int medNo) {
        this.medNo = medNo;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getIsFinished() {
        return isFinished;
    }

    public void setIsFinished(int isFinished) {
        this.isFinished = isFinished;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
