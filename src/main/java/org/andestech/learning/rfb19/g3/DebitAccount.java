package org.andestech.learning.rfb19.g3;

public class DebitAccount extends Account {


    protected static final int AgeMin = 18, AgeMax = 91;

    private DebitAccount(Integer accountId, Customer customer, double balance) {
        super(accountId, customer, balance);
        if (customer.age <= AgeMin || customer.age > AgeMax) {
            this.balance = balance;
            this.accountId = accountId;
            this.customer = customer;
        } else System.out.println("Клиент не подходит!");
    }

    @Override
    public void putMoney(double Summ) {
        if (balance + Summ >= MinPut && balance + Summ <= MaxPutMax) this.balance += Summ;
        else System.out.println("Укажите другую сумму!");
    }

    @Override
    public void withdrawal(double Summ) {
        if (balance - Summ >= MinWithdraw && balance - Summ <= MaxWithdraw && Summ <= this.balance)
            this.balance -= Summ;
        else System.out.println("Укажите другую сумму!");
    }
}