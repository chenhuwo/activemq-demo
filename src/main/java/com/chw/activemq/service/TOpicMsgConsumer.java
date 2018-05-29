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
public class TOpicMsgConsumer {

    @Autowired
    JmsTemplate template;

    @JmsListener(destination = "hello-topic",containerFactory = "mycontainerFactory")
    public void consumer(String text) {
        System.out.println("topic--> "+Thread.currentThread().getName()+"：" + text);

    }
    @JmsListener(destination = "hello-topic",containerFactory = "mycontainerFactory")
    public void consumer1(String text) {
        System.out.println("topic1--> "+Thread.currentThread().getName()+"：" + text);

    }
}
