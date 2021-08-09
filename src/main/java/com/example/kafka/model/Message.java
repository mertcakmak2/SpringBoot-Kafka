package com.example.kafka.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Message {

    private String id = UUID.randomUUID().toString();
    private String content;
    private Date created_at;
    private User toUser;
    private User fromUser;
}
