package org.andestech.learning.rfb19.g3;

public class DebitAccount extends Account {

    private int accountId;
    private Customer customer;
    private int balance;

    private static int MAX_WITHDRAWAL_LIMIT = 500000;
    private static int MIN_WITHDRAWAL_LIMIT = 100;

    private static int MAX_PUT_LIMIT = 1000000;
    private static int MIN_PUT_LIMIT = 10;

    private static int MAX_SUMM_ON_ACCOUNT = 1000000;
    private static int MIN_SUMM_OF_ACCOUNT = 100;


    public DebitAccount(int accountId, Customer customer, int balance) {
        this.accountId = accountId;
        this.customer = customer;
        this.balance = balance;
    }

    @Override
    public void withdrawal(int summ) throws WithdrawalException {
        if (summ < MIN_WITHDRAWAL_LIMIT) {
            throw new WithdrawalException("Ошибка при выводе средств! Невозможно вывести меньше " + MIN_WITHDRAWAL_LIMIT + " рублей!!!");
        } else if (summ > MAX_WITHDRAWAL_LIMIT) {
            throw new WithdrawalException("Ошибка при выводе средств! Невозможно вывести больше " + MAX_WITHDRAWAL_LIMIT + " рублей!!!");
        } else if (checkMinLimit(balance - summ)) {
            throw new WithdrawalException("Ошибка при выводе средств! На вашем счете недостаточно средств!!!");
        } else {
            balance -= summ;
        }
    }

    @Override
    public void putMoney(int summ) throws PutMoneyException {
        if (summ < MIN_PUT_LIMIT) {
            throw new PutMoneyException("Ошибка при внесении средств! Невозможно внести меньше " + MIN_PUT_LIMIT + " рублей!!!");
        } else if (summ > MAX_PUT_LIMIT) {
            throw new PutMoneyException("Ошибка при внесении средств! Невозможно внести больше " + MAX_PUT_LIMIT + " рублей!!!");
        } else if (checkMaxLimit(balance + summ)) {
            throw new PutMoneyException("Ошибка при внесении средств! В банке невозможно хранить столько денег!!!");
        } else {
            balance += summ;
        }
    }

    public int getBalance() {
        return balance;
    }

    private boolean checkMaxLimit(int summ) {
        if (summ < MAX_SUMM_ON_ACCOUNT) {
            return false;
        } else {
            return true;
        }
    }

    private boolean checkMinLimit(int summ) {
        if (summ > MIN_SUMM_OF_ACCOUNT) {
            return false;
        } else {
            return true;
        }
    }
}
