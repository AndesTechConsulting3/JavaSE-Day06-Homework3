package org.andestech.learning.rfb19.g3;


import java.util.Random;

public class DebitAccount extends Account {

    private static double WITHDRAWAL_MIN = 50000;
    private static double SUMMA_MIN = 10000;
    private static double WITHDRAWAL_MAX = 400000;
    private static double SUMMA_MAX = 300000;
    private static int MAX_AGE = 65;
    private static int MIN_AGE = 18;


    public DebitAccount(String customer, int ballance, int accountId) {
        super(customer, ballance, accountId);
        if (ballance > WITHDRAWAL_MIN && ballance < WITHDRAWAL_MAX) {
            System.out.println(customer + "Thanks you operation approved " + accountId + " your ballance: " + ballance);
        } else {
            System.out.println("Sorry operation access denided");
        }
    }


    @Override
    public double withdrawal(double summa) throws DebitAccountException {
        int a = 1;
        int b = 999999999;
        int operation = b - a;
        Random random = new Random();
        if (summa > SUMMA_MIN && summa < SUMMA_MAX) {
            System.out.println("Create operation approved " + random.nextInt(operation) + " your account");
        } else {
            throw new DebitAccountException("Sorry, limit Over! ", summa < SUMMA_MIN && summa > SUMMA_MAX);
        }
        return summa;
    }

    @Override
    public double putMoney(double money) throws DebitAccountException {
        int a = 1;
        int b = 999999999;
        int operation = b - a;
        Random random = new Random();
        if (money > WITHDRAWAL_MIN && money < WITHDRAWAL_MAX) {
            System.out.println("Create operation approved" + random.nextInt(operation));
        } else {
            throw new DebitAccountException("Sorry, limit Over ", money < WITHDRAWAL_MIN && money > WITHDRAWAL_MAX);
        }
        return money;
    }

}
