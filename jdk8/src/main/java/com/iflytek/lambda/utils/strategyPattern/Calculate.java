package com.iflytek.lambda.utils.strategyPattern;

import org.junit.Test;

import java.math.BigDecimal;

public class Calculate {

    // 加减乘除计算
    // 抽象接口，具体实现类，中间类， 客户端调用类

    @Test
    public void cal(){

        Middle midOperate = new Middle();
        System.out.println(String.valueOf(midOperate.operate(100, 10, new AddOperate())));
    }

    @Test
    public void minux(){

        Middle midOperate = new Middle();
        System.out.println(String.valueOf(midOperate.operate(100, 10, new MinusOperate())));
    }

}

