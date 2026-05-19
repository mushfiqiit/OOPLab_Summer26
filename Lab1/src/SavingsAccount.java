/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworldproject;

/**
 *
 * @author Administrator
 */
public class SavingsAccount extends Account {
    public void addInterest() {
        double balance=getBalance();
        double newBalance=balance+balance*0.1;
        setBalance(newBalance, "ABCD");
    }
}
