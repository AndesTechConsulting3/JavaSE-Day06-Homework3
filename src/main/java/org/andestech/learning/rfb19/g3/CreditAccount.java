package org.andestech.learning.rfb19.g3;

public class CreditAccount extends Account {


    private static double WITHDRAWAL_MIN = 5000;
    private static double WITHDRAWAL_MAX = 100000;
    private static double SUMM_MIN = 10000;
    private static double SUMMA_MAX = 40000;
    public static int accountId;
    public static double ballance;
    public static String customer;

    private CreditAccount(String customer, double ballance, int accountId) {
        super(customer, ballance, accountId);
    }

    @Override
    public double withdrawal(double summa) {
        if (ballance - summa > SUMM_MIN && ballance - summa < SUMMA_MAX) {
            System.out.println(customer + "Operation approved" + accountId);
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

    class CreateAccount {
        public String CreateAccount(String acc) {
            if (CreditAccount.ballance > WITHDRAWAL_MIN && CreditAccount.ballance < WITHDRAWAL_MAX ) {
                System.out.println("HomeWork");
            }
            return acc;
        }
    }

}
