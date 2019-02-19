package org.andestech.learning.rfb19.g3;

public abstract class Account {

    Customer customer;
    public int accountId;
    public double ballance = 0;

    public abstract void withdrawal(int Summa) throws CreditAccountException;
    public abstract void putMoney(int Summ) throws DebitAccountException;

    protected static final int WithdrawMin=111, WithdrawMax=1021555;
    protected static final int PutMin=222, PutMax=2021555;
}
