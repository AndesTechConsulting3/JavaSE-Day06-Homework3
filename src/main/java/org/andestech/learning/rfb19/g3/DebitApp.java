package org.andestech.learning.rfb19.g3;

public class DebitApp {

    public static void main(String[] args) {

        //Начинаем проверку

        //Создаем клиента
        Customer customer = new Customer("Semen", "Varlamov", 35, "Omsk");

        //Создаем Дебитовый счет

        DebitAccount da1 = new DebitAccount(1, customer, 20000);

        //Проверим количество денег на счете
        System.out.println("Alexey Sergeevitch balance: " + da1.getBalance());

        //Внесем 1000 и проверим количество денег
        System.out.println("balance + 1000");
        try {
            da1.putMoney(1000);
            System.out.println("Alexey Sergeevitch balance: " + da1.getBalance());
        } catch (PutMoneyException e) {
            e.printStackTrace();
        }

        //Выведем 500 и проверим количество денег
        System.out.println("balance - 500");
        try {
            da1.withdrawal(500);
            System.out.println("Alexey Sergeevitch balance: " + da1.getBalance());
        } catch (WithdrawalException e) {
            e.printStackTrace();
        }

        //Проверим лимиты на ввод и вывод
        //Ввнесем 2000000 и проверим количество денег
        System.out.println("balance + 2000000");
        try {
            da1.putMoney(2000000);
            System.out.println("Alexey Sergeevitch balance: " + da1.getBalance());
        } catch (PutMoneyException e) {
            e.printStackTrace();
        }

        //Ввнесем 5 и проверим количество денег
        System.out.println("balance + 5");
        try {
            da1.putMoney(5);
            System.out.println("Alexey Sergeevitch balance: " + da1.getBalance());
        } catch (PutMoneyException e) {
            e.printStackTrace();
        }

        //Выведем 600000 и проверим количество денег
        System.out.println("balance - 600000");
        try {
            da1.withdrawal(600000);
            System.out.println("Alexey Sergeevitch balance: " + da1.getBalance());
        } catch (WithdrawalException e) {
            e.printStackTrace();
        }

        //Выведем 50 и проверим количество денег
        System.out.println("balance - 50");
        try {
            da1.withdrawal(50);
            System.out.println("Alexey Sergeevitch balance: " + da1.getBalance());
        } catch (WithdrawalException e) {
            e.printStackTrace();
        }

        //Сейчас у нас 20500 на счете, попробуем вывести 20400
        System.out.println("balance - 20400");
        try {
            da1.withdrawal(20500);
            System.out.println("Alexey Sergeevitch balance: " + da1.getBalance());
        } catch (WithdrawalException e) {
            e.printStackTrace();
        }

        //Сейчас у нас 20500 на счете, попробуем ввести 990000
        System.out.println("balance + 990000");
        try {
            da1.putMoney(990000);
            System.out.println("Alexey Sergeevitch balance: " + da1.getBalance());
        } catch (PutMoneyException e) {
            e.printStackTrace();
        }

    }
}
