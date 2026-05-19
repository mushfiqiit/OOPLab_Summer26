/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.helloworldproject;

/**
 *
 * @author Administrator
 */
public class HelloWorldProject {

    public static void main(String[] args) {
        SavingsAccount Karim= new SavingsAccount();
        
        System.out.print("Account balance before interest is ");
        System.out.println(Karim.balance);
        
        Karim.addInterest();
        
        System.out.print("Account balance after interest is ");
        System.out.println(Karim.balance);
    }
}
