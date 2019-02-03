package org.andestech.learning.rfb19.g3;

public abstract class Account {

    public Account(Customer customer, double balance, String accountId) {
        this();
        this.customer = customer;
        this.balance = balance;
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double balance;
    public String accountId;
    Customer customer;

    private String getAccountinfo(){
        return "AccountId: " + accountId +
                ", Balance: " + balance +
                ", Customer: " + customer;}

    public void printAccountInfo(){
        System.out.println(getAccountinfo());
    }

    public String printAccountInfoFull() {
        return "Name: " + customer.getFirstName() + ", \nSurname: " + customer.getSecondName() +
                ", \nAddress: " + customer.getAddress() + ", \nWhat's My Age Again? " + customer.getAge() +
                ", \nAccountId: " + accountId + ", \nBalance: " + balance;
    }

    public Account(){
        System.out.println("++ ctor, Account: " + this);
    }

    public abstract void withdrawal(double sum) throws DebitException;
    public abstract void putMoney(double sum) throws CreditException;

    }
