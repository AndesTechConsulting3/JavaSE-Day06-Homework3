package org.andestech.learning.rfb19.g3;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws DebitAccountException, CreditAccountExteption {
        DebitAccount debitAccount = new DebitAccount("FFFF", 200000, 316465246);
        debitAccount.withdrawal(20000.11);
        debitAccount.putMoney(60000.00);

        CreditAccount creditAccount = new CreditAccount("dsgdfgdg", 200000, 43264256);
        creditAccount.createAccount(6000, 11000);

    }
}
