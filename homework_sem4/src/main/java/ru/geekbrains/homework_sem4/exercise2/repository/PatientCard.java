package ru.geekbrains.homework_sem4.exercise2.repository;

public class PatientCard {
    private Long id;
    private String name;
    private String surname;
    private int age;
    private String address;
    private String phone;
    private String email;


    public Object getId() {
        return id;
    }

    public void setId(Long aLong) {
        this.id = aLong;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
