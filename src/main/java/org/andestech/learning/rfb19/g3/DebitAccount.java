package org.andestech.learning.rfb19.g3;

import java.util.Random;

public class DebitAccount extends Account {

    private static double WITHDRAWAL_MIN = 50000;
    private static double SUMMA_MIN = 10000;
    private static double WITHDRAWAL_MAX = 400000;
    private static double SUMMA_MAX = 300000;
    private static int MAX_AGE = 65;
    private static int MIN_AGE = 18;

    public static double ballance;
    private static int accountId;
    private static String customer;
    private static int age;


    public DebitAccount(String customer, int ballance, int accountId) {
        super(customer, ballance, accountId);
        if (ballance > WITHDRAWAL_MIN && ballance < WITHDRAWAL_MAX) {
            System.out.println(customer + " Thanks you operation approved " + accountId + " your ballance: " + ballance);
        } else {
            System.out.println("Sorry operation access denided");
        }
    }


    @Override
    public double withdrawal(double summa) throws DebitAccountException {
        if (ballance - summa > SUMMA_MIN && ballance - summa < SUMMA_MAX) {
            System.out.println(customer + " Create operation approved " + " your account " + accountId );

        } else {
            throw new DebitAccountException("Sorry, limit Over!! ", ballance - summa < SUMMA_MIN);
        }
        return summa;
    }

    @Override
    public double putMoney(double money) throws DebitAccountException {
        if (ballance - money > WITHDRAWAL_MIN) {
            System.out.println(customer + "Create operation approved");
        } else {
            throw new DebitAccountException("Sorry, limit Over ", ballance - money < WITHDRAWAL_MIN);
        }
        return money;
    }

}
