package org.andestech.learning.rfb19.g3;

import org.andestech.learning.rfb19.g3.Exceptions.CreditAccountException;
import org.andestech.learning.rfb19.g3.Exceptions.DebitAccountException;

public class CreditAccount extends Account {

    private static int limitSniatie;
    private static int limitOstatok;
    private static int limitIzbitok;

    Customer customer = new Customer();

    Account account = new Account() {
        @Override
        void withDrawal(int deltaBalance) throws CreditAccountException  {
            if (limitOstatok < account.balance - deltaBalance){
                if (limitSniatie > deltaBalance){
                    account.balance -= account.balance - deltaBalance;
                    System.out.println("Текущий баланс счета: " + account.balance + " руб.");
                } else throw new CreditAccountException("Операция невозможна! Лимит на снятие превышен на  " + (deltaBalance - limitSniatie) + " руб.");
            }  else System.out.println("Операция невозможна! Остаток по счёту не должен быть меньше " + limitOstatok + " руб.");
        }

        @Override
        void putMoney(int deltaBalance) throws CreditAccountException  {
            if (account.balance < account.balance + deltaBalance){
                account.balance += deltaBalance;
                System.out.println("Текущий баланс счета: " + account.balance + " руб.");
            } else throw new CreditAccountException("Операция невозможна! Текущий баланс счета превышен на " + (limitIzbitok - (account.balance + deltaBalance)) + " руб.");
        }

    };

    private CreditAccount() {
    }

    public CreditAccount createCreditAccount(boolean isGoodCreditStory) throws CreditAccountException{
        if (isGoodCreditStory && (customer.age <= 75 && customer.age >= 18)){
            return new CreditAccount();
        } else throw new CreditAccountException("Не удалось создать кредитный счёт!");
    }

    @Override
    void withDrawal(int deltaBalance) throws DebitAccountException, CreditAccountException {

    }

    @Override
    void putMoney(int deltaBalance) throws DebitAccountException, CreditAccountException {

    }
}
