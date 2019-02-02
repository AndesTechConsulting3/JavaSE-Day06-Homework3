package org.andestech.learning.rfb19.g3;

public class App
{
    public static void main( String[] args )
    {

        Customer customer = new Customer("Shamil","Rakipov","Mosc",34);
        Account accaunt = new Account() {

            public void withdrawal(double sum) {
            }

            public void putMoney(double sum) {
            }
        };

        System.out.println("-------------------------------------------");

        DebitAccount debitAccountbacc = new DebitAccount(customer, 13000, "Rakipov_1");
        debitAccountbacc.withdrawal(11000);
        debitAccountbacc.putMoney(1500);
        System.out.println(debitAccountbacc.PrintDebitAccount());

        System.out.println("-------------------------------------------");

        Account cracc = CreditAccount.getCreditAccount(customer, -1000, "Rakipov");
        cracc.withdrawal(1000);
        cracc.putMoney(2500);
        System.out.println(cracc.printAccountInfoFull());

        System.out.println();

    }
}
