package com.chw.activemq.service;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

/**
 * @author chw
 * 2018/5/29
 */
@Service
public class TopicMsgProducer {

    @Autowired
    JmsTemplate jmsTemplate;

    public void produceMsg(String queue, String msg) {
        ActiveMQTopic activeMQTopic = new ActiveMQTopic(queue);
        jmsTemplate.convertAndSend(activeMQTopic, msg);
    }

}
