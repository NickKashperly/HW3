package ru.geekbrains.lesson3.task2;

public abstract class Employee implements Comparable<Employee> {

    protected String name;

    protected String surname;
    protected int age;

    protected String married;

    public String getMarried() {
        return married;
    }

    protected double salary; // Ставка заработной платы

    public Employee(String name, String surname, int age, String married, double salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.married = married;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }


    /**
     * Расчет среднемесячной заработной платы
     *
     * @return
     */
    public abstract double calculateSalary();


    public int compareTo(Employee o) {
        int res = surname.compareTo(o.surname);
        if (res == 0)
            return Double.compare(calculateSalary(), o.calculateSalary());
        else
            return res;
    }

//
//    public int compareTo<one>(Employee o) {
//        int res = surname.compareTo(o.surname);
//        if (res == 0)
//            return name.compareTo(o.name);
//        else
//            return res;
//    }
}
    //public abstract double calculateSalary();

