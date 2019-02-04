package org.andestech.learning.rfb19.g3;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws DebitAccountException {
        DebitAccount debitAccount = new DebitAccount("FFFF", 200000, 316465246);
        debitAccount.putMoney(50001);
        debitAccount.withdrawal(2000);

        CreditAccount creditAccount = new CreditAccount("AAAAA", 300000, 348757384);
        creditAccount.withdrawal(5000);
        creditAccount.putMoney(1111);

    }
}
