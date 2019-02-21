package org.andestech.learning.rfb19.g3;


public class Customer {

    private String firstName, secondName, adress;
    int age;

    public Customer() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCustomerInfo(){
        String customerInfo = "First name: " + firstName +
                "\nSecond name: " + secondName +
                "\nAdress: " + adress;

        return customerInfo;
    }

    public void printCustomersInfo(){
        System.out.println(getCustomerInfo());
    }

    public Customer(String firstName, String secondName, String adress, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.adress = adress;
        if (age <= 75 && age >= 18){
            this.age = age;
        } else {
            System.out.println("Возраст клиента не удовлетворяет требованиям");
        }
    }

    public Customer(String firstName, String lastName, String adress) {
        this();
        this.firstName = firstName;
        this.secondName = lastName;
        this.adress = adress;
    }

}
