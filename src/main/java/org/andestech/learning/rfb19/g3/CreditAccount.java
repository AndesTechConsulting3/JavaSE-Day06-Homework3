package org.andestech.learning.rfb19.g3;

public class CreditAccount extends Account {


    private static double WITHDRAWAL_MIN = 5000;
    private static double SUMMA_MIN = 10000;
    private static double WITHDRAWAL_MAX = 100000;
    private static double SUMMA_MAX = 40000;

    public static double ballance;
    public static int accountId;
    public static String customer;


    CreditAccount(String customer, double ballance, int accountId) {
        super(customer, ballance, accountId);
    }


    @Override
    public double withdrawal(double summa) {
        if (ballance - summa > SUMMA_MIN && ballance - summa < SUMMA_MAX) {
            System.out.println(customer + "Create operation approved" + accountId);
        } else {
            System.out.println("Sorry denided");
        }
        return summa;
    }

    @Override
    public double putMoney(double money) {
        if (ballance - money > WITHDRAWAL_MIN && ballance - money < WITHDRAWAL_MAX) {
            System.out.println(customer + "Create operation approved");
        } else {
            System.out.println("Sorry denided");
        }
        return money;
    }

    class CreateAccount {
        public void CreateAccount() {
            new CreateAccount();
            if (CreditAccount.ballance > WITHDRAWAL_MIN && CreditAccount.ballance < WITHDRAWAL_MAX ) {
                System.out.println("QWERTY");
            }
            return ;
        }
    }

}
