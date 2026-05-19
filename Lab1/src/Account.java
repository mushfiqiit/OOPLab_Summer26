/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworldproject;

/**
 *
 * @author Administrator
 */
public class Account {
    public Account() { 
        pinNumber="123"; 
        Name="Karim"; 
        balance=100.0; 
        secretKey="ABCD";
    }
    private String pinNumber, Name, contact;
    private double balance;
    private String secretKey;
    
    public double getBalance() {
        return this.balance;
    }
    
    public void setBalance(double newBalance, String secretKey) {
        if(this.secretKey==secretKey) {
            this.balance=newBalance;
        }
    }
    
}
