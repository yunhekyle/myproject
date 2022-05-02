package com.iflytek.lambda.utils;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo {
    
    /*
    *  关于lambda 表达式 ， 函数式接口的实现
    *
    *
    *  1、消费者类型
    *  2、供给型类型
    *  3、函数型类型
    *  4、断言型接口
    * */


    @Test
    public void test1 (){
        Consumer t = (x) -> System.out.println("消费者函数输入："+x);
        t.accept("hello java");
    }

    @Test
    public void test2(){

//        List<Integer> list = getList(10, () -> (int) (Math.random() * 100));
//        list.forEach(System.out::println);

        Supplier<Integer> supplier=()->(int) (Math.random()*100);
        System.out.println( supplier.get());
    }

    List<Integer> getList( int num,Supplier<Integer> supplier){
        List ls=new ArrayList();
        for (int i=0;i<num;i++){
            ls.add(supplier.get());
        }
         return ls;
    }

    @Test
    public void test3(){
        System.out.println(fileTest("hello",(x)-> ( String.valueOf(x).length()>2)));

        Predicate p=(x) -> x.toString().length()>5;
        System.out.println(p.test("hhh"));
    }


    public Boolean fileTest(String s, Predicate predicate) {
        return predicate.test(s);

    }

    @Test
   public void fileFilter() {

        Predicate p = new Predicate() {
            @Override
            public boolean test(Object o) {
                return o.toString().length() > 2;
            }
        };
        System.out.println(p.test("hellojavaworld"));
    }


    @Test
    public void test4(){

     //   System.out.println(testfunc("hello",(x)-> x.toString().length()));


        Function function=(x)->x.toString().length();
        System.out.println(function.apply("nishishuiaaa"));

    }

    int testfunc(String s, Function function){
       return  (Integer) function.apply(s);
    }

}
