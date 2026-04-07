package com.whatsapp.service;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.HashMap;

@Service
public class ChatService {

    private final Map<String, String> replies = new HashMap<>();

    public ChatService() {
        replies.put("hi", "Hello");
        replies.put("bye", "Goodbye");
    }

    public String getReply(String message) {
        if (message == null || message.isBlank()) return "I don't understand";
        return replies.getOrDefault(message.toLowerCase(), "I don't understand");
    }
}