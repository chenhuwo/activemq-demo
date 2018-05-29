package com.chw.activemq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

/**
 * @author chw
 * 2018/5/29
 */
@Service
public class MsgProducer {

    @Autowired
    JmsTemplate jmsTemplate;

    public void produceMsg(String queue, String msg) {
        jmsTemplate.convertAndSend(queue, msg);
    }

}
