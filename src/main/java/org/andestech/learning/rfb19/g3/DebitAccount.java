package org.andestech.learning.rfb19.g3;

import org.andestech.learning.rfb19.g3.Exceptions.DebitAccountException;

public class DebitAccount extends Account {

    private static int limitSniatie;
    private static int limitOstatok;
    private static int limitIzbitok;

    public DebitAccount() {
    }

    @Override
    void withDrawal(Account account, int deltaBalance) {
        if (limitOstatok < account.balance - deltaBalance){
            if (limitSniatie > deltaBalance){
                account.balance -= account.balance - deltaBalance;
                System.out.println("Текущий баланс счета: " + account.balance + " руб.");
            } else System.out.println("Операция невозможна! Лимит на снятие превышен на  " + (deltaBalance - limitSniatie) + " руб.");
        }  else System.out.println("Операция невозможна! Остаток по счёту не должен быть меньше " + limitOstatok + " руб.");
    }


    @Override
    void putMoney(Account account, int deltaBalance) {
        if (account.balance < account.balance + deltaBalance){
            account.balance += deltaBalance;
            System.out.println("Текущий баланс счета: " + account.balance + " руб.");
        } else
            System.out.println("Операция невозможна! Текущий баланс счета превышен на " + (limitIzbitok - (account.balance + deltaBalance)) + " руб.");
    }



}
