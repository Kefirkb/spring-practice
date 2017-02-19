package com.kefirkb;

import com.kefirkb.annotated.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Sergey on 19.02.2017.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
        MessageRenderer renderer = ctx.getBean(MessageRenderer.class);
        renderer.printMessage();
    }
}
