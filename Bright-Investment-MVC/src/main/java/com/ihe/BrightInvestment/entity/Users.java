package com.ihe.BrightInvestment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {

    private int userId;
    private String companyName;
    private String phoneNumber;
    private String eMail;
    private double balance;
    private String userPassword;
}
