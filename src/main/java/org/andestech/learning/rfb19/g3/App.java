package org.andestech.learning.rfb19.g3;

import java.util.concurrent.Callable;

public class App
{
    public static void main( String[] args ) {
        Customer customer = new Customer("Anna", "Lukicheva", 56, "Москва, Рогова, 7 к2");

        Account creditAccount = new Account(543, customer, 9000) {
            public void withdrawal(double sum) {
            }
            public void putMoney(double sum) {
            }
        };

        System.out.println("Account ID:" + creditAccount.accountId);
        customer.printCustomerinfo();
        System.out.println("Balance: " + creditAccount.balance);

        try {
            Account credit01 = CreditAccount.getCreditAccount(543, customer, 9000);
            try {
                credit01.withdrawal(4500);
            } catch (CreditException ex) {
                System.out.println(ex.toString());
                ex.printStackTrace();
            }
            try {
                credit01.putMoney(150000);
            } catch (CreditException ex) {
                System.out.println(ex.toString());
                ex.printStackTrace();
            }
            credit01.printAccountinfo();
        } catch (CreditAccountException ex) {
            ex.printStackTrace();
        }


//        Account creditAccount = CreditAccount.generateCreditAccount(445556,customer,9000);
//
//        creditAccount.putMoney(5000);
//        System.out.println("Put money: " + creditAccount.balance);
//        creditAccount.withdrawal(6000);
//        System.out.println("Withdrawal:" + creditAccount.balance);
    }
}
