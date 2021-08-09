package com.example.kafka.service.MessageService;

import com.example.kafka.model.Message;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {

    private final KafkaTemplate<String, Message> kafkaTemplate;
    private final static Logger logger = LoggerFactory.getLogger(MessageServiceImpl.class);

    @Override
    public Message sendMessage(Message message) {
        logger.info("sendMessage method");
        kafkaTemplate.send("message-topic", message);
        return message;
    }

    @Override
    @KafkaListener(
            topics = "message-topic",
            groupId = "1"
    )
    public void consumeMessage(Message message) {
        logger.info(message.toString());
    }

}
