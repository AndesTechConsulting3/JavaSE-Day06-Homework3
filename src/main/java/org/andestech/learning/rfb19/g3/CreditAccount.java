package org.andestech.learning.rfb19.g3;

import java.util.Random;

public class CreditAccount extends Account {

    protected static final int AgeMin=22, AgeMax=98;
    @Override
    public void putMoney(int Summ) throws DebitAccountException {
        if (Summ >= PutMin && Summ <= PutMax){
            throw new DebitAccountException("Вышли за границы" + Summ);
        }
            this.ballance += Summ;
    }

    @Override
    public void withdrawal(int Summa) throws CreditAccountException {
        if (Summa >= WithdrawMin && Summa <= WithdrawMax && Summa<=this.ballance){
            throw new CreditAccountException("Вышли за границы" + Summa);
        }
            this.ballance -= Summa;
    }

    public CreditAccount(Customer customer) {
        this.accountId = new Random().nextInt();
    }

    public static Account generateAccount(Customer customer){

        if (customer.age<= AgeMin || customer.age> AgeMax) try {
            throw new Exception("Клиент не подходит");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new CreditAccount(customer);
    }
}
