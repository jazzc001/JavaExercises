package com.jasmine.account.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Accounts")
public class Account {
    @Id
    @Column(name="Account_ID")
    private int accountId;
    @Column(name="Customer_Name")
    private String customerName;
    @Column(name="Address")
    private String address;
    @Column(name="Phone_Number")
    private String phoneNo;
    @Column(name="Balance")
    private double balance;
    @Column(name="Passcode")
    private String password;
}
