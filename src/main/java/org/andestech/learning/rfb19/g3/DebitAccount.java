package org.andestech.learning.rfb19.g3;

public class DebitAccount extends Account {

    private double bb = 0;
    private static final int minBal=0, maxBal=15000, minW=0, maxW=10000, minD=0, maxD=15000;

    @Override
    public void withdrawal(double sum) throws DebitException {
        if(balance >= minBal && balance <= maxBal)
        {
            if (sum < balance)
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
        else throw new DebitException("Sum exceeds limits " + minW + " < " + sum + " < " + maxW);}
        else throw new DebitException("Withdrawal " + sum + " > than your balance " + balance);}
        else throw new DebitException("Incorrect balance! " + balance);
        }

    @Override
    public void putMoney(double sum) throws CreditException
    {
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
        else throw new CreditException("Sum exceeds limits " + minD + " < " + (sum+balance) + " < " + maxD);}
        else throw new CreditException("Incorrect balance! " + balance);
    }

    public DebitAccount(Customer customer, double balance, String accountId) {
        this.balance = balance;
        this.accountId = accountId;
        this.customer = customer;
    }

    public String PrintDebitAccount(){return "Name: " + customer.getFirstName() + ", \nSurname: " + customer.getSecondName() +
            ", \nAddress: " + customer.getAddress() + ", \nWhat's My Age Again? " + customer.getAge() +
            ", \nAccountId: " + accountId + ", \nBalance: " + balance;}

}