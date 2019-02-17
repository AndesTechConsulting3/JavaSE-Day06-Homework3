package org.andestech.learning.rfb19.g3;

import org.andestech.learning.rfb19.g3.Exceptions.CreditAccountException;
import org.andestech.learning.rfb19.g3.Exceptions.DebitAccountException;

public class DebitAccount extends Account {

    private static int limitSniatie;
    private static int limitOstatok;
    private static int limitIzbitok;

    public DebitAccount() {
    }

    Account account = new Account() {
        @Override
        void withDrawal(int deltaBalance) throws DebitAccountException{
            if (limitOstatok < account.balance - deltaBalance){
                if (limitSniatie > deltaBalance){
                    account.balance -= account.balance - deltaBalance;
                    System.out.println("Текущий баланс счета: " + account.balance + " руб.");
                } else throw new DebitAccountException("Операция невозможна! Лимит на снятие превышен на  " + (deltaBalance - limitSniatie) + " руб.");
            }  else throw new DebitAccountException("Операция невозможна! Остаток по счёту не должен быть меньше " + limitOstatok + " руб.");
        }


        @Override
        void putMoney(int deltaBalance) throws DebitAccountException{
            if (account.balance < account.balance + deltaBalance){
                account.balance += deltaBalance;
                System.out.println("Текущий баланс счета: " + account.balance + " руб.");
            } else throw new DebitAccountException("Операция невозможна! Текущий баланс счета превышен на " + (limitIzbitok - (account.balance + deltaBalance)) + " руб.");
        }
    };


    @Override
    void withDrawal(int deltaBalance) throws DebitAccountException, CreditAccountException {

    }

    @Override
    void putMoney(int deltaBalance) throws DebitAccountException, CreditAccountException {

    }
}
