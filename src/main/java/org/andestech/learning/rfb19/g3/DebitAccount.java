package org.andestech.learning.rfb19.g3;

import java.util.Random;

public class DebitAccount extends Account {

    private static double WITHDRAWAL_MIN = 50000;
    private static double WITHDRAWAL_MAX = 400000;
    private static double SUMM_MIN = 10000;
    private static double SUMMA_MAX = 300000;
    private static int MAX_AGE = 70;
    private static int MIN_AGE = 16;
    private static double ballance;
    private static String customer;
    private static int accountId;
    private static int age;

    public DebitAccount(String customer, int ballance, int accountId) {
        super(customer, ballance, accountId);
        if (ballance > WITHDRAWAL_MIN && ballance < WITHDRAWAL_MAX) {
            System.out.println(customer + " Operation approved " + accountId);
        } else {
            System.out.println("Operation declined");
        }
    }

    @Override
    public double withdrawal(double summa) {
        if (ballance - summa > SUMM_MIN && ballance - summa < SUMMA_MAX) {
            System.out.println(customer + " Operation approved " + " your account " + accountId );
        } else {
            System.out.println("Operation declined");
        }
        return summa;
    }

    @Override
    public double putMoney(double money) {
        if (ballance - money > WITHDRAWAL_MIN && ballance - money < WITHDRAWAL_MAX) {
            System.out.println(customer + "Operation approved");
        } else {
            System.out.println("Operation declined");
        }
        return money;
    }

}
