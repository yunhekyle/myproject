package com.iflytek.lambda.utils.abs;

import com.iflytek.lambda.utils.strategyPattern.OperateInteface;
import org.junit.Test;

import java.math.BigDecimal;

public class abs {

    @Test
    public void ope() {
        OperateInteface operateInteface = new OperateInteface() {
            @Override
            public Object operate(Object p1, Object p2) {
                BigDecimal b1=BigDecimal.valueOf((Integer)p1);
                BigDecimal b2=BigDecimal.valueOf((Integer)p2);
                return b1.add(b2).intValue();
            }
        };
        System.out.println(operateInteface.operate(100,10));
    }

    @Test
    public void ope2() {

        System.out.println(new OperateInteface() {
            @Override
            public Object operate(Object p1, Object p2) {
                BigDecimal b1=BigDecimal.valueOf((Integer)p1);
                BigDecimal b2=BigDecimal.valueOf((Integer)p2);
                return b1.add(b2).intValue();
            }
        }.operate(100,20));
    }
}
