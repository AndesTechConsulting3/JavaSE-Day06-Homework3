package org.andestech.learning.rfb19.g3;

import org.andestech.learning.rfb19.g3.Exceptions.CreditAccountException;
import org.andestech.learning.rfb19.g3.Exceptions.DebitAccountException;

public class CreditAccount extends Account {

    private static int limitSniatie = 20000;
    private static int limitOstatok = 0;
    private static int limitIzbitok = 1000000;

    Customer customer = new Customer();

    public CreditAccount(int balance, String account, Customer customer) {
        super(balance, account, customer);
    }

    @Override
    void withDrawal(int deltaBalance) throws CreditAccountException {
        if (limitOstatok < balance - deltaBalance) {
            if (limitSniatie > deltaBalance) {
                balance -= balance - deltaBalance;
                System.out.println("Текущий баланс счета: " + balance + " руб.");
            } else
                throw new CreditAccountException("Операция невозможна! Лимит на снятие превышен на  " + (deltaBalance - limitSniatie) + " руб.");
        } else
            System.out.println("Операция невозможна! Остаток по счёту не должен быть меньше " + limitOstatok + " руб.");
    }

    @Override
    void putMoney(int deltaBalance) throws CreditAccountException {
        if (limitIzbitok > balance + deltaBalance) {
            balance += deltaBalance;
            System.out.println("Текущий баланс счета: " + balance + " руб.");
        } else
            throw new CreditAccountException("Операция невозможна! Максимально возможный баланс счета превышен на " + ((balance + deltaBalance) - limitIzbitok) + " руб.");
    }


    public CreditAccount createCreditAccount(boolean isGoodCreditStory) throws CreditAccountException {
        if (isGoodCreditStory && (customer.age <= 75 && customer.age >= 18)) {
            return new CreditAccount(balance, account, customer);
        } else throw new CreditAccountException("Не удалось создать кредитный счёт!");
    }

}
