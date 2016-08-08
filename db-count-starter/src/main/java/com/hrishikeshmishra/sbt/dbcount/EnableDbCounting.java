package com.hrishikeshmishra.sbt.dbcount;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by hrishikesh.mishra on 08/08/16.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(DbCountAutoConfiguration.class)
@Documented
public @interface EnableDbCounting {
}
