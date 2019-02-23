package org.andestech.learning.rfb19.g3;

public class App
{
    public static void main( String[] args )
    {

        Customer customer = new Customer("Sheldon","Cooper","USA, CA, Pasadena",34);

        DebitAccount dbacc = new DebitAccount(customer, 9000, "qazwsx1234");
        try {
            dbacc.putMoney(7000);
        }
        catch (CreditException dex)
        {
            dex.printStackTrace();
        }
        try {
        dbacc.withdrawal(9900);
        }
        catch (DebitException dex)
        {
            dex.printStackTrace();
        }
        System.out.println(dbacc.PrintDebitAccount());

        System.out.println("-------------------------------------------");

        try {
            Account cracc = CreditAccount.getCreditAccount(customer, -1500, "tgbvfr3545",2);
            try {
                cracc.withdrawal(4500);
            }
            catch (DebitException crex)
            {
                crex.printStackTrace();
            }
            try {
                cracc.putMoney(24150);
            }
            catch (CreditException crex)
            {
                crex.printStackTrace();
            }
            System.out.println(cracc.printAccountInfoFull());
        }
        catch (CreditAccountException crex)
        {
            crex.printStackTrace();
        }
    }
}
