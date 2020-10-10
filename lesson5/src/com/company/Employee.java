package com.company;

public class Employee {

    // Поля
    String FIO; // ФИО
    String position; // должность
    String email; // Почта
    String telephone; // Телефон
    int salary; // Зарплата
    int age; // Возраст

    // Конструктор - по умолчанию
    public Employee(){
        FIO = "Петя";
        position = "Тестировщик";
        email = "testP@gmail.com";
        telephone = "8-800-555-35-35";
        salary = 30000;
        age = 21;
    }

    // Конструктор - для новых сотрудников
    public Employee(String FIO, String position, String email, String telephone, int salary, int age){
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

//    Метод вывода информации о сотруднике
    public void informationAboutEmployees(){
        System.out.println("Имя сотрудника: " + this.FIO + "\n" +
                "Должность: " + this.position + "\n" +
                "Email: " + this.email + "\n" +
                "Телефон: " + this.telephone + "\n" +
                "Зарплата: " + this.salary + "\n" +
                "Возраст: " + this.age);
    }
}
