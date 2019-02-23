package org.andestech.learning.rfb19.g3;

public class CreditAccount extends Account {

    private double bb = 0;
    private static final int minBal=-5000, maxBal=15000, minW=0, maxW=10000, minD=0, maxD=15000, minAge=18, maxAge=70, maxCH = 2;

    private CreditAccount(Customer customer, double balance, String accountId){
            this.balance = balance;
            this.accountId = accountId;
            this.customer = customer;
    }

    public static Account getCreditAccount(Customer customer, double balance, String accountId, int CreditHistory) throws CreditAccountException
    {
        if (customer.getAge() < minAge) {
            throw new CreditAccountException("You are getting too young for this sh.t");
        }
        else if (customer.getAge() > maxAge) {
            throw new CreditAccountException("You are getting too old for this sh.t");
        }
        else if (CreditHistory > maxCH) {
            throw new CreditAccountException("You are having too much credit packs, bro");
        }
        else
            {
            return new CreditAccount(customer, balance, accountId);
        }
    }

    @Override
    public void withdrawal(double sum) throws DebitException {
        if(balance >= minBal && balance <= maxBal )
        {
            if ((balance - sum) >= minBal)
            {
            if (sum > minW && sum < maxW)
            {
            bb = getBalance();
            setBalance(bb - sum);
            System.out.println(
                    "Before bal: " + bb +
                            " Withdraw: -" + sum +
                            " After operation bal: " + getBalance());
        }
        else throw new DebitException ("Sum exceeds limits " + minW + " < " + sum + " < " + maxW);}
        else throw new DebitException ("Withdrawal " + sum + " > your balance " + balance);}
        else throw new DebitException ("Incorrect balance! " + balance);
    }

    @Override
    public void putMoney(double sum) throws CreditException {
        if(balance >= minBal && balance <= maxBal )
        {
            if (sum > minD && sum + balance < maxD)
            {
            bb = getBalance();
            setBalance(bb + sum);
            System.out.println(
                    "Before bal: " + bb +
                            " Deposit: " + sum +
                            " After operation bal: " + getBalance());
            }
        else throw new CreditException ("Sum exceeds limits " + minD + " < " + (sum+balance) + " < " + maxD);}
        else throw new CreditException ("Incorrect balance! " + balance);
    }

}
