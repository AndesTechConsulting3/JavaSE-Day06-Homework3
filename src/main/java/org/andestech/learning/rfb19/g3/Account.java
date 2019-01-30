package org.andestech.learning.rfb19.g3;

public abstract class Account {

    private int accountId;
    private Customer customer;
    private int balance;

    public abstract void withdrawal(int summa) throws WithdrawalException;

    public abstract void putMoney(int summa) throws PutMoneyException;
}
