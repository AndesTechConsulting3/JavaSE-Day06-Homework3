package org.andestech.learning.rfb19.g3;

import org.andestech.learning.rfb19.g3.Exceptions.CreditAccountException;
import org.andestech.learning.rfb19.g3.Exceptions.DebitAccountException;

public class DebitAccount extends Account {

    private static int limitSniatie = 20000;
    private static int limitOstatok = 0;
    private static int limitIzbitok = 1000000;

    public DebitAccount(int balance, String account, Customer customer) {
        super(balance, account, customer);
    }

    @Override
    void withDrawal(int deltaBalance) throws DebitAccountException {
        if (limitOstatok < balance - deltaBalance) {
            if (limitSniatie > deltaBalance) {
                balance -= balance - deltaBalance;
                System.out.println("Текущий баланс счета: " + balance + " руб.");
            } else
                throw new DebitAccountException("Операция невозможна! Лимит на снятие превышен на  " + (deltaBalance - limitSniatie) + " руб.");
        } else
            throw new DebitAccountException("Операция невозможна! Остаток по счёту не должен быть меньше " + limitOstatok + " руб.");
    }

    @Override
    void putMoney(int deltaBalance) throws DebitAccountException {
        if (limitIzbitok > balance + deltaBalance) {
            balance += deltaBalance;
            System.out.println("Текущий баланс счета: " + balance + " руб.");
        } else
            throw new DebitAccountException("Операция невозможна! Текущий баланс счета превышен на " + ((balance + deltaBalance) - limitIzbitok) + " руб.");
    }


}
