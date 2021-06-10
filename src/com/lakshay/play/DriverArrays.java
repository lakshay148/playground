package com.lakshay.play;

import com.lakshay.play.arrays.ArrayProblems;

import java.util.*;
import java.util.stream.Collectors;

public class DriverArrays {
    public static void main(String[] args){
        System.out.println("Program started");
//        int[] input = new int[]{1, 2, 2, 4, 5, 5,7};
//        ArrayProblems driver = new ArrayProblems();
//        int[] output = driver.rotateArray(input, input.length, 15);
//        for(int i : output){
//            System.out.print(i);
//        }
//
//        int[] numbers = {1,4,5,2,34,66,5,4,33,45,6,8,56,76,78,98,34,37,12,12,23,43,54,56};
//        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
//        TreeSet<Integer> listSet = new TreeSet<>(list);
//        System.out.println(listSet.first());
//        System.out.println(listSet.last());

        Map<String, Integer> stockPrice = new HashMap<>();

        stockPrice.put("Oracle", 56);
        stockPrice.put("Fiserv", 117);
        stockPrice.put("BMW", 73);
        stockPrice.put("Microsoft", 213);
        stockPrice.put("Google", 421);
        stockPrice.put("Ford", 456);
        stockPrice.put("Novartis", 43);
        stockPrice.put("TCS", 23);

        int maxPrice = -1;
        int totalPrice = 0;
        for(Map.Entry<String, Integer> entry : stockPrice.entrySet()){
            if(entry.getValue() > maxPrice)
                maxPrice = entry.getValue();
            totalPrice += entry.getValue();
        }
        int average = totalPrice/stockPrice.size();
        System.out.println("Max Price " + maxPrice);
        System.out.println("Avg Price " + average);
        Iterator<Map.Entry<String, Integer>> iterator = stockPrice.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry =  iterator.next();
            if(entry.getValue()<50)
                iterator.remove();
        }
        System.out.println(stockPrice);
    }

    public class Employee {

        String name;
        int age;
        String country;

        public Employee(String name, int age, String country) {
            super();
            this.name = name;
            this.age = age;
            this.country = country;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", country='" + country + '\'' +
                    '}';
        }

        public String getName() {
            return name;
        }

        public int getAge() {
//            Collection
            return age;
        }

        public String getCountry() {
            return country;
        }
    }

    public void test(){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Alex", 23, "USA"));
        list.add(new Employee("Dave", 34, "India"));
        list.add(new Employee("Carl", 21, "USA"));
        list.add(new Employee("Joe", 56, "Russia"));
        list.add(new Employee("Amit", 64, "China"));
        list.add(new Employee("Ryan", 19, "Brazil"));


        List<Employee> employeeAbove50 = list.stream().filter(employee -> employee.age > 50).collect(Collectors.toList());

        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getCountry().compareTo(o2.getCountry());
            }
        });
    }
}
