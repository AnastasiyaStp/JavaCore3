package com.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Employee[] employees = new Employee[3];

        employees[0] = new Employee("Alice", 50000, 2022, 5, 20);
        employees[1] = new Employee("Bob", 60000, 2021, 6, 15);
        employees[2] = new Manager("Charlie", 80000, 2020, 3, 10);

        System.out.println("Salaries before raise:");
        Arrays.stream(employees).forEach(System.out::println);

        Manager.raiseEmployeeSalaries(employees, 5000);

        System.out.println("Salaries after raise:");
        Arrays.stream(employees).forEach(System.out::println);
    }
}