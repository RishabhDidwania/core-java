package com.lab06;

public class AccountUser {
    public static void main(String[] args) {
//        Account sam = new Account(20000);
//        sam.deposit(2000);
//        sam.deposit(4000);
//        sam.withdrawAmount(5000);
//        sam.withdrawAmount(5000);
//        sam.withdrawAmount(5000);
//        sam.withdrawAmount(5000);
//        sam.printStatement();

        Account currentSam = new CurrentAccount(2000, "sam");
        currentSam.deposit(2000000);
        currentSam.deposit(400);

        for(int i=0; i<=102; i++)
        currentSam.withdrawAmount(50);



        currentSam.printStatement();
    }
}
