package com.example.chatbotapi.aplication.service;

import com.example.chatbotapi.aplication.repository.UsuarioChatBotRepository;
import com.example.chatbotapi.model.UsuarioChatbot;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatBotService {

    private final UsuarioChatBotRepository usuarioChatBotRepository;

    public ChatBotService(UsuarioChatBotRepository usuarioChatBotRepository) {
        this.usuarioChatBotRepository = usuarioChatBotRepository;
    }

    public UsuarioChatbot guardarUsuarioChatbot(UsuarioChatbot usuarioChatbot) {
        return usuarioChatBotRepository.save(usuarioChatbot);
    }
}
