package ru.geekbrains.lesson3.task2;

import java.util.Comparator;

public class AgeSalaryComparator implements Comparator<Employee> {


        @Override
        public int compare(Employee o1, Employee o2) {
            // 1 0 -1
            int res = o1.getAge()-o2.getAge();
            if (res == 0)
                return Double.compare(o1.getSalary(),o2.getSalary());
            else
                return res;
            //return o1.calculateSalary() == o2.calculateSalary() ? 0 : (o1.calculateSalary() > o2.calculateSalary() ? 1 : -1);

        }

    }

