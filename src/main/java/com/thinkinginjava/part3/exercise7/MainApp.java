package com.thinkinginjava.part3.exercise7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Created by vendin on 10.10.2017.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Coin coin = (Coin) context.getBean("coin");
        for (int i = 0; i < 100000; i++) {
            System.out.println(coin.toss());
        }
    }
}
