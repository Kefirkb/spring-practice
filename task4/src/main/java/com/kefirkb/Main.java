package com.kefirkb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

/**
 * Created by Sergey on 19.02.2017.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new GenericGroovyApplicationContext("spring-context.groovy");
        MessageRenderer renderer = ctx.getBean("messageRenderer",MessageRendererImpl.class);
        renderer.printMessage();
        renderer = ctx.getBean("messageRendererFromEmbedded",MessageRendererImpl.class);
        renderer.printMessage();
    }
}
