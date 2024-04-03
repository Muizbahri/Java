/**
 A class for bank accounts.

 This class provides the basic functionality of accounts.
 It allows deposits and withdrawals but not overdraft
 limits or interest rates.
 @author : Stuart Reynolds, 1999
 */

 public class Account
 {
     private int accNum;  //The account number
     private double balance;  //The current balance
 
     public Account() {
         accNum = 0;
         balance = 0.0;
     }
 
     public Account(int accNum, double balance) {
         this.accNum = accNum;
         this.balance = balance;
     }
 
     public void deposit(double sum) {
         if (sum>0)
             balance+=sum;    
         else
             System.err.println("Account.deposit(...): "
                     +"cannot deposit negative amount.");    
     }
     
     public void withdraw(double sum){
         if (sum>0)
             balance-=sum;    
         else
             System.err.println("Account.withdraw(...): "
                     +"cannot withdraw negative amount.");    
     }
 
     public double getBalance() {
         return balance;
     }
 
     public double getAccNum() {
         return accNum;
     }
 
     public String toString() {
         return "Acc = " + accNum + ", " + "balance = " + balance;
     }
 
 }