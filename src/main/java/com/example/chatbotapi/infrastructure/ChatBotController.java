package com.example.chatbotapi.infrastructure;


import com.example.chatbotapi.aplication.service.ChatBotService;
import com.example.chatbotapi.model.UsuarioChatbot;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class ChatBotController {
    private final ChatBotService chatBotService;

    public ChatBotController(ChatBotService chatBotService) {
        this.chatBotService = chatBotService;
    }

    @PostMapping("/guardar")
    public UsuarioChatbot guardarUsuario(@RequestBody UsuarioChatbot usuarioChatbot) {
        return chatBotService.guardarUsuarioChatbot(usuarioChatbot);
    }


}
