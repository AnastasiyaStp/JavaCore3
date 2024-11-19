package com.example;

class Employee {

    String name;
    double salary;
    int year;
    int month;
    int day;

    public Employee(String name, double salary, int year, int month, int day) {

        this.name = name;
        this.salary = salary;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int compareDates(Employee other) {

        return Integer.compare(this.year, other.year) != 0 ?
                Integer.compare(this.year, other.year) :
                Integer.compare(this.month, other.month) != 0 ?
                        Integer.compare(this.month, other.month) :
                        Integer.compare(this.day, other.day);
    }

    public void raiseSalary(double increase) {

        this.salary += increase;
    }

    @Override
    public String toString() {

        return name + " (Salary: " + salary + ")";
    }
}
