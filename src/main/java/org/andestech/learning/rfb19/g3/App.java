package org.andestech.learning.rfb19.g3;

public class App
{
    public static void main( String[] args ) throws DebitAccountException, CreditAccountException {
        Customer customer = new Customer("MASHA", "IVANOVA", "MOSCOW", 31);
        customer.printinfo();

        Account crediitAccount = CreditAccount.generateAccount(customer);
        System.out.println(crediitAccount.accountId);

        System.out.println(crediitAccount.ballance);
        crediitAccount.putMoney(50000);
        System.out.println(crediitAccount.ballance);
        crediitAccount.withdrawal(50000);
        System.out.println(crediitAccount.ballance);
    }
}
