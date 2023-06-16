package ru.geekbrains.lesson3.task2;

import java.util.Comparator;
import java.util.stream.Collector;

public class SurnameNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        // 1 0 -1
        int res = o1.getSurname().compareTo( o2.getSurname());
        if (res == 0)
            return o1.getName().compareTo(o2.getName());
        else
            return res;
        //return o1.calculateSalary() == o2.calculateSalary() ? 0 : (o1.calculateSalary() > o2.calculateSalary() ? 1 : -1);

    }

}

//    public int compareTo<one>(Employee o) {
//        int res = surname.compareTo(o.surname);
//        if (res == 0)
//            return name.compareTo(o.name);
//        else
//            return res;
//    }

