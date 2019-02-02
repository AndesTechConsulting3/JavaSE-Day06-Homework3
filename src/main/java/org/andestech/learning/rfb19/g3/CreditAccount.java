package org.andestech.learning.rfb19.g3;

public class CreditAccount extends Account {
//public class CreditAccount implements CrAcc{

    private double bal = 0;
    private static final int minBal=-5000, maxBal=15000, minW=0, maxW=10000, minD=0, maxD=15000, minAge=18, maxAge=70;

    private CreditAccount(Customer customer, double balance, String accountId) {
        super(customer, balance, accountId);
        if((balance >= minBal && balance <= maxBal ) && (customer.age >= minAge && customer.age <= maxAge)){
            this.balance = balance;
            this.accountId = accountId;
            this.customer = customer;}
        else System.out.println("Account opening failed!");
    }

    public static Account getCreditAccount(Customer customer, double balance, String accountId){
        if (customer.age >= minAge && customer.age <= maxAge){
            return new CreditAccount(customer,balance,accountId);}
        else throw new IndexOutOfBoundsException("Некорректный возраст");
    }

    //double s = 100;

    @Override
    public void withdrawal(double sum) {
        //setBalance(s);
        if(balance >= minBal && balance <= maxBal )
        {   if ((balance - sum) >= minBal)
        { if (sum > minW && sum < maxW) {
            bal = getBalance();
            setBalance(bal - sum);
            System.out.println(
                    "Before bal: " + bal +
                            " Withdraw: -" + sum +
                            " After operation bal: " + getBalance());
        }
        else System.out.println("Sum exceeds limits " + minW + " < " + sum + " < " + maxW);}
        else System.out.println("Withdrawal " + sum + " > your balance " + balance);}
        else System.out.println("Incorrect balance! " + balance);
    }

    @Override
    public void putMoney(double sum) {
        if(balance >= minBal && balance <= maxBal )
        { if (sum > minD && sum + balance < maxD) {
            bal = getBalance();
            setBalance(bal + sum);
            System.out.println(
                    "Before bal: " + bal +
                            " deposit: " + sum +
                            " After operation balance: " + getBalance());
        }
        else System.out.println("Sum exceeds limits " + minD + " < " + (sum + balance) + " < " + maxD);}
        else System.out.println("Incorrect balance! " + balance);
    }

}
