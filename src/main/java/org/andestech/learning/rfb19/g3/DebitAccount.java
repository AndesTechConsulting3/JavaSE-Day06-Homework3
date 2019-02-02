package org.andestech.learning.rfb19.g3;

public class DebitAccount extends Account {

    private double bal = 0;
    private static final int minBal = 0, maxBal = 15000, minW = 0, maxW = 10000, minD = 0, maxD = 15000;

    @Override
    public void withdrawal(double sum) {

        if (balance >= minBal && balance <= maxBal) {
            if (sum < balance)
            {
                if (sum > minW && sum < maxW) {
                    bal = getBalance();
                    setBalance(bal - sum);
                    System.out.println(
                            "Before bal: " + bal +
                                    " Withdraw: -" + sum +
                                    " After operation bal: " + getBalance());
                } else System.out.println("Sum exceeds limits " + minW + " < " + sum + " < " + maxW);
            } else System.out.println("Withdrawal " + sum + " > than your balance " + balance);
        } else System.out.println("Incorrect balance! " + balance);
    }

    @Override
    public void putMoney(double sum) {
        //setBalance(s);
        if (balance >= minBal && balance <= maxBal) {
            if (sum > minD && sum + balance < maxD) {
                bal = getBalance();
                setBalance(bal + sum);
                System.out.println(
                        "Before bal: " + bal +
                                " Deposit: " + sum +
                                " After operation bal: " + getBalance());
            } else System.out.println("Sum exceeds limits " + minD + " < " + (sum + balance) + " < " + maxD);
        } else System.out.println("Incorrect balance! " + balance);
    }

    public DebitAccount(Customer customer, double balance, String accountId

    ) {
        super(customer, balance, accountId);

    }

    public String PrintDebitAccount() {
        return "Name: " + customer.getFirstName() + ", \nSurname: " + customer.getSecondName() +
                ", \nAddress: " + customer.getAddress() + ", \nWhat's My Age Again? " + customer.getAge() +
                ", \nAccountId: " + accountId + ", \nBalance: " + balance;
    }

}