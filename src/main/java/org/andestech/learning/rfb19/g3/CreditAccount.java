package org.andestech.learning.rfb19.g3;

public class CreditAccount extends Account {

    private int accountId;
    private Customer customer;
    private int balance;

    private static int MIN_AGE = 18;
    private static int MAX_COUNT_OF_CREDITS = 2;

    private static int MAX_WITHDRAWAL_LIMIT = 500000;
    private static int MIN_WITHDRAWAL_LIMIT = 100;

    private static int MAX_PUT_LIMIT = 1000000;
    private static int MIN_PUT_LIMIT = 10;

    private static int MAX_SUMM_ON_ACCOUNT = 1000000;
    private static int MIN_SUMM_OF_ACCOUNT = 100;


    public static CreditAccount createCreditAccount(int accountId, Customer customer, int balance, int countOfCredits) throws CreateCreditAccountException {
        if (customer.getAge() <= MIN_AGE) {
            throw new CreateCreditAccountException("Невозможно создать счет! Клиенту меньше 18 лет!!!");
        } else if (countOfCredits >= MAX_COUNT_OF_CREDITS) {
            throw new CreateCreditAccountException("Невозможно создать счет! У Клиента уже слишком много кредитов!!!");
        } else {
            return new CreditAccount(accountId, customer, balance);
        }
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

    private CreditAccount(int accountId, Customer customer, int balance) {
        this.accountId = accountId;
        this.customer = customer;
        this.balance = balance;
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
