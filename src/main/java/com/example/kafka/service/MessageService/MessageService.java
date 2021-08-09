package com.example.kafka.service.MessageService;

import com.example.kafka.model.Message;

public interface MessageService {

    Message sendMessage(Message message);

    void consumeMessage(Message message);
}
