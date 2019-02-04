package org.andestech.learning.rfb19.g3;


public class App
{
    public static void main( String[] args )
    {
        DebitAccount debitAccount = new DebitAccount("A", 100000, 265478412);
        debitAccount.putMoney(100001);
        debitAccount.withdrawal(66666);
    }
}
