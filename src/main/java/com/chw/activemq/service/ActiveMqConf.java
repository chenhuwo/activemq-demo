package com.chw.activemq.service;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.config.SimpleJmsListenerContainerFactory;

import javax.jms.ConnectionFactory;

/**
 * @author chw
 * 2018/5/29
 */
@Configuration
public class ActiveMqConf {

    @Bean
    JmsListenerContainerFactory mycontainerFactory(ConnectionFactory connectionFactory) {
        SimpleJmsListenerContainerFactory simpleJmsListenerContainerFactory = new SimpleJmsListenerContainerFactory();
        simpleJmsListenerContainerFactory.setPubSubDomain(true);
        simpleJmsListenerContainerFactory.setConnectionFactory(connectionFactory);
        return simpleJmsListenerContainerFactory;
    }
}
