package com.chw.activemq;

import com.chw.activemq.service.TopicMsgProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.chw.activemq.service.MsgProducer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ActivemqApplicationTests {

    @Autowired
    MsgProducer producer;

    @Autowired
    TopicMsgProducer topic;

    @Test
    public void contextLoads() throws InterruptedException {
        int i = 0;
        while (true) {
            producer.produceMsg("hello-queue", "msg + " + i++);
            Thread.sleep(10);

        }
    }
    @Test
    public void topic() throws InterruptedException {
        int i = 0;
        while (true) {
            topic.produceMsg("hello-topic", "msg + " + i++);
            Thread.sleep(10);

        }
    }

}
