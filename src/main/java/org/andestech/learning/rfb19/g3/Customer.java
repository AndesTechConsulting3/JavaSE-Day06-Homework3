package org.andestech.learning.rfb19.g3;

public class Customer {

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String firstName, secondName, address;
    public int age;

    public Customer(String firstName, String secondName, String address, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
        this.age = age;
    }

    private String getCustomerInfo(){
        return
                "FirstName: " + firstName +
                 ", SecondName: " + secondName +
                 ", Address: " + address +
                ", What's My Age Again? " + age;}

    public void printCustomerInfo(){

        System.out.println(getCustomerInfo());
    }

    public Customer(){
        System.out.println("++ ctor, Customer: " + this);
    }
}
