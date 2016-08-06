package com.hrishikeshmishra.integrationdata;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by hrishikesh.mishra on 06/08/16.
 */
public class Application {

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext ctx = new SpringApplication("/hello/integration.xml").run(args);
        System.out.println("Hit Enter to terminate");
        System.in.read();
        ctx.close();
    }
}
