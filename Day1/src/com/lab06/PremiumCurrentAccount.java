package com.lab06;

public class PremiumCurrentAccount extends CurrentAccount{
    public static final int limit = 100;
    public static final int widtdrawlAmountLimit = 100000;
    public PremiumCurrentAccount(int amount, String theName) {
        super(amount, theName);
    }
}
