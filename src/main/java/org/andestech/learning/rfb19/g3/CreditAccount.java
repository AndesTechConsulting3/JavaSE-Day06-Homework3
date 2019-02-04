package org.andestech.learning.rfb19.g3;


public class CreditAccount extends Account {

    protected static final int AgeMin = 18, AgeMax = 91;

    private CreditAccount(Integer accountId, Customer customer, double balance) {
        super(accountId, customer, balance);
//        if (customer.age >= AgeMin && customer.age < AgeMax){
            this.balance = balance;
            this.accountId = accountId;
            this.customer = customer;}
//        else System.out.println("Клиент не подходит!");
//    }

    public static Account getCreditAccount(Integer accountId, Customer customer, double balance) throws CreditAccountException
    {
        if (customer.getAge() < AgeMin) {
            throw new CreditAccountException("Клиент не подходит!");
        }
        else if (customer.getAge() > AgeMax) {
            throw new CreditAccountException("Клиент не подходит!");
        }
        else {
            return new CreditAccount(accountId,customer, balance);
        }
    }


    @Override
    public void putMoney(double Summ) throws CreditException {
        if (balance + Summ >= MinPut && balance + Summ <= MaxPutMax)this.balance += Summ;
        else throw new CreditException("Укажите другую сумму!");
    }

    @Override
    public void withdrawal(double Summ) throws CreditException {
        if (balance - Summ >= MinWithdraw && balance - Summ <= MaxWithdraw && Summ<=this.balance)this.balance -= Summ;
        else throw new CreditException("Укажите другую сумму!");
    }


    public static Account generateCreditAccount(Integer accountId, Customer customer, double balance){
        return new CreditAccount(accountId,customer,balance);
    }
}
