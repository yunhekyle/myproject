package com.iflytek.lambda.utils;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Lambda {

    // 分别针对 四种 函数式接口做实现
    //
    // Consumer  消费者类型
    // Suppler  生产着类型
    // Function  函数类型
    // Predicate 断言类型



    @Test
    public void test1(){
        accept(100, (x)-> System.out.println("输入的数据为"+x));
    }

    void  accept(int a , Consumer con){
        con.accept(a);
    }


    // 2 供给型函数
    @Test
    public void test2(){

        List<Integer> supply = supply(10, () -> (int) (Math.random() * 100));
        supply.forEach(System.out::println);
    }

    List<Integer> supply(int x ,Supplier<Integer> supplier){
        List list =new ArrayList();
        for (int i=0;i<10;i++){
            Integer in = supplier.get();
            list.add(in);
        }
        return list;
    }


    @Test
    void test3(){



    }
    void test4(){

    }

}
