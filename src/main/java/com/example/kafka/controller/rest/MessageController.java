package com.example.kafka.controller.rest;

import com.example.kafka.model.Message;
import com.example.kafka.service.MessageService.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/message")
@RequiredArgsConstructor
public class MessageController {

    private final MessageService messageService;

    @PostMapping("")
    public Message sendMessage(@RequestBody Message message){
        return messageService.sendMessage(message);
    }
}
