package com.lab06;

public class AccountUser {
    public static void main(String[] args) {
        Account sam;
        sam = new Account(20000);
        sam.deposit(2000);
        sam.deposit(4000);
        sam.withdrawAmount(5000);
        sam.withdrawAmount(5000);
        sam.withdrawAmount(5000);
        sam.withdrawAmount(5000);
        sam.printStatement();
    }
}
