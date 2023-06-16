package ru.geekbrains.lesson3.task2;

public class Worker extends Employee {


    public Worker(String name, String surname, int age, String married, double salary) {
        super(name, surname, age, married, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Возраст: %s; Семейное положение: %s; Среднемесячная заработная плата (фиксированная месячная оплата): %.2f (руб.)",
                surname, name, age,married, calculateSalary());
    }

}
