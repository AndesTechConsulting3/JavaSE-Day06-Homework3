package org.andestech.learning.rfb19.g3;

public class Customer {

    private String firstname;
    private String secondName;
    private int age;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 18)
            this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String address;

    public Customer(String firstname, String secondName, int age, String address) {
        this.firstname = firstname;
        this.secondName = secondName;
        this.age = age;
        this.address = address;
    }

}

