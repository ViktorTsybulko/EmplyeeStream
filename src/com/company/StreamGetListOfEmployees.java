package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class StreamGetListOfEmployees {

    public static void main(String[] args) {
        List<Employee> employeesList=getListOfEmployees();

        /*
        * 1) Given a list of employees, you need to find all the
        * employees whose age is greater than 30 and print the employee names.
        * */

        /*List<String> employeeFilteredList = employeesList.stream()
                .filter(e -> e.getAge() > 30)
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(employeeFilteredList);*/

        /*
        * 2) Given the list of employees, find the count of employees with age greater than 25?
        * */
        /*int countOfEmployees = (int) employeesList.stream()
                .filter(e -> e.getAge() > 25)
                .count();
        System.out.println(countOfEmployees);*/

        /*
        * 3) Given the list of employees, find the employee whose name is John.
        * */
        /*Optional<Employee> employeeJohn = employeesList.stream()
                .filter(e -> e.getName().equals("John"))
                .findAny();
        System.out.println(employeeJohn);*/

        /*
        * 4) Given a list of employees, You need to find the highest age of employee?
        * */
        /*int maxAge = employeesList.stream()
                .mapToInt(Employee::getAge)
                .max()
                .getAsInt();
        System.out.println(maxAge);*/

        /*
        * 5) Given a list of employees, You need to find the highest age of employee?
         * */
        /*List<Employee> sortedAge = employeesList.stream()
                .sorted(Comparator.comparingInt(Employee::getAge))
                .collect(Collectors.toList());
        System.out.println(sortedAge);*/

        /*
        * 6) Given the list of Employees, you need to join the all employee names with ","?
        * */
        /*List<String> names = employeesList.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        String joinNames = String.join(", ", names);

        System.out.println(joinNames);*/

        /*
        * 7) Given the list of employees, you need to group them by name
        * */
        /*Map<String, List<Employee>> map = employeesList.stream()
                .collect(Collectors.groupingBy(Employee::getName));
        map.forEach((name, employeeListTemp) -> System.out.println("Name: " + name + " ==>" + employeeListTemp));*/
    }

    public static List<Employee> getListOfEmployees() {

        List<Employee> listOfEmployees = new ArrayList<>();

        Employee e1 = new Employee("Mohan", 24,Arrays.asList("Newyork","Banglore"));
        Employee e2 = new Employee("John", 27,Arrays.asList("Paris","London"));
        Employee e3 = new Employee("Vaibhav", 32,Arrays.asList("Pune","Seattle"));
        Employee e4 = new Employee("Amit", 22,Arrays.asList("Chennai","Hyderabad"));

        listOfEmployees.add(e1);
        listOfEmployees.add(e2);
        listOfEmployees.add(e3);
        listOfEmployees.add(e4);

        return listOfEmployees;
    }
}
