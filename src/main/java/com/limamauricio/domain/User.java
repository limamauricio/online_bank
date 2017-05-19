package com.limamauricio.domain;

import java.util.List;

/**
 * Created by Mauricio on 18/03/2017.
 */
public class User {

    private Long userId;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    private boolean enable = true;

    private PrimaryAccount pAccount;
    private SavingsAccount sAccount;

    private List<Appointment> appointmentList;
    private List<Recipient> recipientList;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public PrimaryAccount getpAccount() {
        return pAccount;
    }

    public void setpAccount(PrimaryAccount pAccount) {
        this.pAccount = pAccount;
    }

    public SavingsAccount getsAccount() {
        return sAccount;
    }

    public void setsAccount(SavingsAccount sAccount) {
        this.sAccount = sAccount;
    }

    public List<Appointment> getAppointmentList() {
        return appointmentList;
    }

    public void setAppointmentList(List<Appointment> appointmentList) {
        this.appointmentList = appointmentList;
    }

    public List<Recipient> getRecipientList() {
        return recipientList;
    }

    public void setRecipientList(List<Recipient> recipientList) {
        this.recipientList = recipientList;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", enable=" + enable +
                ", pAccount=" + pAccount +
                ", sAccount=" + sAccount +
                ", appointmentList=" + appointmentList +
                ", recipientList=" + recipientList +
                '}';
    }
}
