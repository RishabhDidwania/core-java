package com.lab06;

public class CurrentAccount extends Account{

    private String name;

    private int limit = 10;
    private static final int widtdrawlAmountLimit = 1000000;

    public int getWithdrawlLimit(){return 10;};

    public CurrentAccount(int amount, String theName) {
        super(amount);
        this.name = theName;
        this.limit = 10;
    }

    public void withdrawAmount(long amount){
       if(amount < widtdrawlAmountLimit){
           super.withdrawAmount(amount);
       };
    }

}
