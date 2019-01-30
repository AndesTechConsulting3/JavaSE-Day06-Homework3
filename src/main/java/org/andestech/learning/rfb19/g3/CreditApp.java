package org.andestech.learning.rfb19.g3;

/**
 * Hello world!
 */
public class CreditApp {
    public static void main(String[] args) {
        //Начинаем проверку

        //Создаем клиента
        Customer customer20Years = new Customer("Alexey", "Sergeev", 20, "Moscow");

        //Создаем Кредитный счет
        CreditAccount ca1;
        try {
            ca1 = CreditAccount.createCreditAccount(1, customer20Years, 10000, 1);

            //Проверим количество денег на счете
            System.out.println("Alexey Sergeevitch balance: " + ca1.getBalance());

            //Внесем 1000 и проверим количество денег
            System.out.println("balance + 1000");
            try {
                ca1.putMoney(1000);
                System.out.println("Alexey Sergeevitch balance: " + ca1.getBalance());
            } catch (PutMoneyException e) {
                e.printStackTrace();
            }

            //Выведем 500 и проверим количество денег
            System.out.println("balance - 500");
            try {
                ca1.withdrawal(500);
                System.out.println("Alexey Sergeevitch balance: " + ca1.getBalance());
            } catch (WithdrawalException e) {
                e.printStackTrace();
            }

            //Проверим лимиты на ввод и вывод
            //Ввнесем 2000000 и проверим количество денег
            System.out.println("balance + 2000000");
            try {
                ca1.putMoney(2000000);
                System.out.println("Alexey Sergeevitch balance: " + ca1.getBalance());
            } catch (PutMoneyException e) {
                e.printStackTrace();
            }

            //Ввнесем 5 и проверим количество денег
            System.out.println("balance + 5");
            try {
                ca1.putMoney(5);
                System.out.println("Alexey Sergeevitch balance: " + ca1.getBalance());
            } catch (PutMoneyException e) {
                e.printStackTrace();
            }

            //Выведем 600000 и проверим количество денег
            System.out.println("balance - 600000");
            try {
                ca1.withdrawal(600000);
                System.out.println("Alexey Sergeevitch balance: " + ca1.getBalance());
            } catch (WithdrawalException e) {
                e.printStackTrace();
            }

            //Выведем 50 и проверим количество денег
            System.out.println("balance - 50");
            try {
                ca1.withdrawal(50);
                System.out.println("Alexey Sergeevitch balance: " + ca1.getBalance());
            } catch (WithdrawalException e) {
                e.printStackTrace();
            }

            //Сейчас у нас 10500 на счете, попробуем вывести 10400
            System.out.println("balance - 10400");
            try {
                ca1.withdrawal(10500);
                System.out.println("Alexey Sergeevitch balance: " + ca1.getBalance());
            } catch (WithdrawalException e) {
                e.printStackTrace();
            }

            //Сейчас у нас 10500 на счете, попробуем ввести 990000
            System.out.println("balance + 990000");
            try {
                ca1.putMoney(990000);
                System.out.println("Alexey Sergeevitch balance: " + ca1.getBalance());
            } catch (PutMoneyException e) {
                e.printStackTrace();
            }

        } catch (CreateCreditAccountException e) {
            e.printStackTrace();
        }


        //Проверим ограничения при создании кредитного счета
        CreditAccount ca2;
        System.out.println("У клиента уже есть 3 счета");

        try {
            ca2 = CreditAccount.createCreditAccount(2, customer20Years, 10000, 3);

            //Проверим количество денег на счете
            try {
                System.out.println("Alexey Sergeevitch second balance: " + ca2.getBalance());
            } catch (NullPointerException e) {
                System.out.println("Alexey Sergeevitch doesn't have second Credit account");
            }
        } catch (CreateCreditAccountException e) {
            e.printStackTrace();
        }

        Customer customer14Years = new Customer("Vladimir", "Semenov", 14, "Moscow");
        CreditAccount ca3;
        System.out.println("Клиенту 14 лет");

        try {
            ca3 = CreditAccount.createCreditAccount(2, customer14Years, 10000, 1);

            //Проверим количество денег на счете
            try {
                System.out.println("Vladimir Semenov balance: " + ca3.getBalance());
            } catch (NullPointerException e) {
                System.out.println("Vladimir Semenov doesn't have Credit account");
            }
        } catch (CreateCreditAccountException e) {
            e.printStackTrace();
        }
    }
}
