package com.chw.activemq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

/**
 * @author chw
 * 2018/5/29
 */
@Service
public class MsgConsumer {

    @Autowired
    JmsTemplate template;

    @JmsListener(destination = "hello-queue")
    public void consumer(String text) {
        System.out.println("receive--> "+Thread.currentThread().getName()+"：" + text);

    }
    @JmsListener(destination = "hello-queue")
    public void consumer1(String text) {
        System.out.println("receive2--> "+Thread.currentThread().getName()+"：" + text);

    }
}
