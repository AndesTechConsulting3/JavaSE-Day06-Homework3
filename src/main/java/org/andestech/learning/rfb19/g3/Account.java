package org.andestech.learning.rfb19.g3;

public abstract class Account {

    private static double WITHDRAWAL_MIN = 10000;
    private static double SUMM_MIN = 15000;
    public String getCustomer() {
        return customer;
    }
    public void setCustomer(String customer) {
        this.customer = customer;
    }
    public double getBallance() {
        return ballance;
    }
    public void setBallance(int ballance) {
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public Account(String customer, double ballance, int accountId) {
        this.customer = customer;
        this.ballance = ballance;
        this.accountId = accountId;
    }

    private String customer;
    private double ballance;
    private int accountId;
    public abstract double withdrawal(double summ);
    public abstract double putMoney(double money);

}