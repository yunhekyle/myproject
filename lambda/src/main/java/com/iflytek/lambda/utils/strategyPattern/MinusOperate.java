package com.iflytek.lambda.utils.strategyPattern;

import java.math.BigDecimal;

public class MinusOperate implements OperateInteface<Integer,Integer> {

    @Override
    public Integer operate(Integer p1, Integer p2) {

        BigDecimal b1=BigDecimal.valueOf(p1);
        BigDecimal b2=BigDecimal.valueOf(p2);

        return b1.subtract(b2).intValue();
    }
}
