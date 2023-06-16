package ru.geekbrains.lesson3.task2;

/**
 * TODO: Спроектировать класс Freelancer самостоятельно в рамках домашнего задания.
 *  *20*8
 */
public class Freelancer extends Employee {

    protected int time;
    public Freelancer(String name, String surname, int age, String married, double salary) {
        super(name, surname, age, married, salary);
    }

    public int getTime() {
        return time;
    }

    @Override
    public double calculateSalary() {

        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Возраст: %s; Семейное положение: %s; Заработная плата (сдельная месячная оплата): %.2f (руб.)",
                surname, name, age, married, calculateSalary());
    }
//    @Override
//    public int compareTo(Freelancer o){
//        int res = surname.compareTo(o.surname);
//        if (res == 0)
//            return name.compareTo(o.name);
//        else
//            return res;
    }



