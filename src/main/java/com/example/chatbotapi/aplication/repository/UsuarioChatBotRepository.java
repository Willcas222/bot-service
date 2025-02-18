package com.example.chatbotapi.aplication.repository;

import com.example.chatbotapi.model.UsuarioChatbot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioChatBotRepository extends JpaRepository<UsuarioChatbot, Long> {
}
