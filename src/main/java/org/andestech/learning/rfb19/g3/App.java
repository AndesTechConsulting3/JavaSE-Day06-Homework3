package org.andestech.learning.rfb19.g3;

import org.andestech.learning.rfb19.g3.Exceptions.CreditAccountException;
import org.andestech.learning.rfb19.g3.Exceptions.DebitAccountException;

/**
 * Home Work 3
 *
 */
public class App 
{
    public static void main( String[] args ) throws DebitAccountException, CreditAccountException {

        //1 positive
        Customer customer = new Customer("Ivanov", "Ivan", "Moscow City");
        DebitAccount debitAccount1 = new DebitAccount(1000, "debit", customer);
        debitAccount1.putMoney(1000);

        //1 exception
        DebitAccount debitAccount2 = new DebitAccount(1000, "debit", customer);
        debitAccount2.putMoney(2000000);

        // debit with drawal
        DebitAccount debitAccount3 = new DebitAccount(1000, "debit", customer);
        debitAccount3.withDrawal(500);

        // debit with drawal 1 exception
        DebitAccount debitAccount4 = new DebitAccount(1000, "debit", customer);
        debitAccount4.withDrawal(1100);

        // debit with drawal 1 exception
        DebitAccount debitAccount5 = new DebitAccount(70000, "debit", customer);
        debitAccount5.withDrawal(25000);

        Customer customer1 = new Customer("Petrov", "Petr", "Peterburg", 25);
        CreditAccount creditAccount = new CreditAccount(500, "credit", customer1);
        CreditAccount creditAccount1 = creditAccount.createCreditAccount(true);
        System.out.println(creditAccount1);

        CreditAccount creditAccount2 = creditAccount.createCreditAccount(false);
        System.out.println(creditAccount2);

    }
}
