package com.codewithSam;

import java.util.Scanner;

public class BankDetails {
    private String acctNo;
    private String name;
    private String acctType;
    private long balance;

    Scanner input = new Scanner(System.in);

//    Method to open new account

    public void openAccount(){
        System.out.println("Enter Account number");
        acctNo=input.next();

        System.out.println("Enter Name");
        name=input.next();

        System.out.println("Enter Account type");
        acctType=input.next();

        System.out.println("Enter Balance");
        balance=input.nextLong();
    }

//    Method to display account details

    public void showAccountDetails(){
        System.out.println("Name of account holder:" + name);
        System.out.println("Account Number:" + acctNo);
        System.out.println("Account Type:" + acctType);
        System.out.println("Balance:" + balance);
    }

//    method to deposit

    public void deposit(){
        long amount;
        System.out.println("Enter the amount you want to deposit");
        amount= input.nextLong();
        balance = balance + amount;
    }


//    Method to withdraw money
    public void withdrawal(){
        long amount;
        System.out.println("Enter the amount you want to withdraw");
        amount=input.nextLong();
        if(balance >= amount){
            balance= balance - amount;
            System.out.println("Enter the amount you want to withdraw");
        }
        else{
            System.out.println("Your balance is less than " + amount + "\tTransaction failed...!");
        }
    }

//    Method to search an account number

    public boolean searchAccount(String acct_no){
        if(acctNo.equals(acct_no)){
            showAccountDetails();
            return(true);
        }
        return(false);
    }



}
