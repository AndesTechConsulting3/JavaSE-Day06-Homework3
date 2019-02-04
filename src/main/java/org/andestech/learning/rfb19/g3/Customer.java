package org.andestech.learning.rfb19.g3;

public class Customer {

    public String getFirstName() {
        return firstName;
    }

//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }

    public String getSecondName() {
        return secondName;
    }

//    public void setSecondName(String secondName) {
//        this.secondName = secondName;
//    }

    public String getAddress() {
        return address;
    }

//    public void setAddress(String address) {
//        this.address = address;
//    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private String firstName, secondName, address;
    public Integer age;

    public Customer(String firstName, String secondName, Integer age, String address) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.address = address;
    }

    public String getCustomerInfо(){
        return
                "First Name: " + firstName + ", " +
                        "Second Name: " + secondName  + ", " + "Age: " + age + ", " +
                        "Address: " + address;
    }

    public void printCustomerinfo()
    {
        System.out.println(getCustomerInfо());

    }
}