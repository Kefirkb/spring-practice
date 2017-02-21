package com.kefirkb;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * Created by Sergey on 21.02.2017.
 */
public class PrintMessageReplacer implements MethodReplacer {
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {

        if("printMessage".equals(method.getName())) {
            System.out.println("printMessage Replaced");
            return null;
        }
        throw new NoSuchMethodError("Method "+method.getName()+" error");
    }
}
