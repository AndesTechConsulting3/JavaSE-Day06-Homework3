package org.andestech.learning.rfb19.g3;

import java.util.Random;

public class CreditAccount extends Account {


    private static double WITHDRAWAL_MIN = 5000;
    private static double SUMMA_MIN = 10000;
    private static double WITHDRAWAL_MAX = 100000;
    private static double SUMMA_MAX = 40000;

    public void createAccount(double money, double summa) throws CreditAccountExteption {
        int a = 1;
        int b = 999999999;
        int operation = b - a;
        Random random = new Random();
        putMoney(money);
        withdrawal(summa);
        System.out.println("Your account create " + random.nextInt(operation) + ". Thanks.");
    }


    CreditAccount(String customer, double ballance, int accountId) {
        super(customer, ballance, accountId);
    }


    @Override
    public double withdrawal(double summa) throws CreditAccountExteption {
        if (summa > SUMMA_MIN && summa < SUMMA_MAX) {
            System.out.println("Create account approved");
        } else {
            throw new CreditAccountExteption("Create account operation lock", summa < SUMMA_MIN && summa > SUMMA_MAX);
        }
        return summa;
    }

    @Override
    public double putMoney(double money) throws CreditAccountExteption {
        if (money > WITHDRAWAL_MIN && money < WITHDRAWAL_MAX) {
            System.out.println("Create operation approved");
        } else {
            throw new CreditAccountExteption("Create account operation lock", money < WITHDRAWAL_MIN &&
                    money > WITHDRAWAL_MAX);
        }
        return money;
    }

    }


