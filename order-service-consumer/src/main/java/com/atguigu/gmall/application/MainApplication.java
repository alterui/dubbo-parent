package com.atguigu.gmall.application;

import com.atguigu.gmall.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author liurui
 * @time 2019-07-10 15:37
 */
public class MainApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService orderService = context.getBean(OrderService.class);// 获取远程服务代理
        orderService.initOrder("1");
        System.out.println("调用完成...");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
