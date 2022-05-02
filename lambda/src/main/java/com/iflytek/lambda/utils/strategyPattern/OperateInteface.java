package com.iflytek.lambda.utils.strategyPattern;

public interface OperateInteface<T,R> {
    R operate(T  p1,T p2);
}
