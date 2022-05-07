package com.iflytek.lambda.utils.strategyPattern;

public class Middle<T,R> {


    Object operate(T x, T y , OperateInteface ope){
        return  ope.operate(x,y);
    }

}
