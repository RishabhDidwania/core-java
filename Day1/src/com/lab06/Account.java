package com.lab06;

import java.time.LocalDate;
import java.util.ArrayList;

public class Account {
    private long balance;
    private int count = 0;
    private ArrayList<Transaction> transactions;

    public void deposit(long amount) {
        this.balance += amount;
        addTransaction("Deposit", amount);
        System.out.println("Balance updated " + balance);
    }
    public  Account(int amount){
        this.balance = amount;
        transactions = new ArrayList<>();
        System.out.println("Account opened with " + balance);
    }
    private void addTransaction(String type, double amount) {
        Transaction txn = new Transaction(type, amount);
        transactions.add(txn);
    }

    public void withdrawAmount(long amount){
        double fee;
        if(amount > this.balance){
            System.out.println("Insufficient Balance " + balance);
            throw new RuntimeException("Insufficient Balance");
        }else if(this.count <= 3){
            this.balance -= amount;
            addTransaction("Withdraw", amount);
            System.out.println("Amount " + amount + " is withdrawn from the account" + " and current balance is " +this.balance);

            this.count += 1;
        }else{
            this.balance -= amount;
            addTransaction("Withdraw", amount);
            fee = 0.005*amount;
            this.balance -= fee;
            addTransaction("Withdraw fee", fee);
            System.out.println("Amount " + amount + " is withdrawn from the account" + " and current balance is " +this.balance +"additional fee of " + fee + "was charged");
            this.count += 1;
        }
    }
    public void printStatement() {
        for (Transaction txn : transactions) {
            System.out.println(txn.getType() + ", " + "Rs." + txn.getAmount() + " on " + txn.getDate().toString());
        }
    }
}
