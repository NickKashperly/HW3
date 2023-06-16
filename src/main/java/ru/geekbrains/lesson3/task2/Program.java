package ru.geekbrains.lesson3.task2;

import java.util.Arrays;
import java.util.Random;

public class Program {

    static Random random = new Random();

    /**
     * TODO: Переработать метод generateEmployee в рамках домашнего задания,
     *  метод должен генерировать рабочих (Employee) разных типов.
     *
     * @return
     */
    static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        String[] marrieds = new String[] { "Женат", "Холост"};
        int age = random.nextInt(18, 67);
        int salaryWorker = random.nextInt(20000, 80000);
        int time = random.nextInt(4, 168);
        int salaryFreelancer = time * 500;
        int employee = random.nextInt(0, 2);
        if (employee == 1)

            return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(3)], age, marrieds[random.nextInt(marrieds.length)], salaryWorker);
        else
            return new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(3)], age, marrieds[random.nextInt(marrieds.length)], salaryFreelancer);
        
    //    int marrieds = random.nextInt(0, 1){
//            if (marrieds ==0)
//                return String married = "Холост";
//            else
//                return String married = "Женат";



        //return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(3)], age, marrieds[random.nextInt(marrieds.length)], salary);

    }


    /**
     * TODO: Придумать новые состояния для наших сотрудников
     *  Придумать несколько Comparator'ов для сортировки сотрудников
     *  по фамилии + имени или по возрасту и уровню ЗП.
     * @param args
     */
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++){
            employees[i] = generateEmployee();
        }
        System.out.println("***");
        System.out.println("По фамилии и зарплате");
        Arrays.sort(employees);


        for(Employee employee : employees){
            System.out.println(employee);
        }

        System.out.println("***");
        System.out.println("По зарплате");

        Arrays.sort(employees, new SalaryComparator());

        for(Employee employee : employees){
            System.out.println(employee);
        }


        System.out.println("***");
        System.out.println("По фамилии и имени");

        Arrays.sort(employees, new SurnameNameComparator());

        for(Employee employee : employees){
            System.out.println(employee);
        }


        System.out.println("***");
        System.out.println("По возрасту и зарплате");

        Arrays.sort(employees, new AgeSalaryComparator());

        for(Employee employee : employees){
            System.out.println(employee);
        }
    }
}


