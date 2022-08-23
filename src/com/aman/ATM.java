package com.aman;


public class ATM {

    private double balance;
    private double depositAmount;
    private double withdrawAmount;

    // constructor
    public ATM() {

//    public ATM (double bankAccountNumber, double depositAmount, double withdrawAmount) {
//            this.bankAccountNumber = bankAccountNumber;
//            this.depositAmount = depositAmount;
//            this.withdrawAmount = withdrawAmount;
//        }
//    }
    }

    //     getter/setter
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getwithdrawAmount() {
        return withdrawAmount;
    }

    public void setwithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
}

