package com.example;

class Manager extends Employee {

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
    }

    public static void raiseEmployeeSalaries(Employee[] employees, double increase) {

        for (Employee emp : employees) {
            if (!(emp instanceof Manager)) {
                emp.raiseSalary(increase);
            }
        }
    }
}

