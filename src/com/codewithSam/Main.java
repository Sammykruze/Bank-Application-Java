package com.codewithSam;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        //Create initial account
        System.out.println("How many numbers of customers do you want to input");
        int n = 3;
        BankDetails C[] = new BankDetails[n];
        for(int i = 0; i < C.length; i++){
            C[i] = new BankDetails();
            C[i].openAccount();
        }

        //loop runs until number 5 is not pressed to exist
        int ch;
        do{
            System.out.println("\n ***Banking System Application");
            System.out.println("1. Display all account details \n 2. Search by Account number" +
                    "\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit  ");
            System.out.println("Enter your choice");

            ch = input.nextInt();
            switch(ch){
                case 1:
                    for(int i = 0; i < C.length; i++){
                        C[i].showAccountDetails();
                    }
                    break;

                case 2:
                    System.out.println("Enter Account number you want to search");
                    String acct_no = input.next();
                    boolean found = false;
                    for(int i = 0; i < C.length; i++){
                        found = C[i].searchAccount(acct_no);
                        if (found) {
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Search failed Account doesn't exist..!");
                    }
                    break;

                case 3:
                    System.out.println("Enter Account number");
                    acct_no =input.next();
                    found = false;
                    for(int i = 0; i < C.length; i++){
                        found = C[i].searchAccount(acct_no);
                        if(found){
                            C[i].deposit();
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Search failed! Account doesn't exist..!");
                    }
                    break;

                case 4:
                    System.out.println("Enter Account number");
                    acct_no = input.next();
                    found = false;
                    for(int i = 0; i < C.length; i++){
                        found = C[i].searchAccount(acct_no);
                        if(found){
                            C[i].withdrawal();
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Search failed! Account doesn't exist..!");
                    }
                    break;

                case 5:
                    System.out.println("Exist");
                    break;
            }
        }
        while (ch !=5);
    }
}
