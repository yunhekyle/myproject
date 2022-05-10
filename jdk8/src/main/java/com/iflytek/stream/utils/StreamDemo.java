package com.iflytek.stream.utils;

import com.iflytek.stream.bean.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo {

    public static void main(String[] args) {
        System.out.println("");
    }


     Employee[] employees =new Employee[]{
            new Employee("张三",18,1888),
            new Employee("李四",28,2888),
            new Employee("王五",38,3888),
            new Employee("赵七",58,5888)};

    ArrayList<Employee> list =new ArrayList(Arrays.asList(employees));

   String str[] =new String[]{"aaa","bbb","ccc"};

   @Test
   public void test1(){
       List<String> list1 = Arrays.asList(str);
       System.out.println("1.array_________________________");
       list1.stream().forEach(System.out::println);
       System.out.println("2.list_________________________");
       list.stream().forEach(System.out::println);
       System.out.println("3.limit_________________________");
       list.stream().limit(2).forEach(System.out::println);
       System.out.println("4.map_________________________");
       list.stream().map(Employee::getName).forEach(System.out::println);
       System.out.println("5.filter_________________________");
       list.stream().filter((x)-> x.getAge()>30).forEach(System.out::println);


   }






}
