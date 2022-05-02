package com.iflytek.lambda.utils.strategyPattern;

import java.math.BigDecimal;

public class AddOperate implements OperateInteface<Integer,Integer> {

    @Override
    public Integer operate(Integer p1, Integer p2) {
        BigDecimal b1=BigDecimal.valueOf(p1);
        BigDecimal b2=BigDecimal.valueOf(p2);
        return  b1.add(b2).intValue();
    }
}
