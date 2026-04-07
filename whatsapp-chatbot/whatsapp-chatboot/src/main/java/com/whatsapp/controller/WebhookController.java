package com.whatsapp.controller;

import com.whatsapp.model.MessageRequest;
import com.whatsapp.model.MessageResponse;
import com.whatsapp.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class WebhookController {

    @Autowired
    private ChatService chatService;

    @PostMapping("/webhook")
    public MessageResponse handleMessage(@RequestBody MessageRequest request) {
        String message = request.getMessage();
        System.out.println("Incoming message: " + message);

        String reply = chatService.getReply(message);
        return new MessageResponse(reply);
    }
}
