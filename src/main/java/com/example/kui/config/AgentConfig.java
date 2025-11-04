package com.example.kui.config;

import com.example.kui.agents.CodeAgent;
import dev.langchain4j.memory.ChatMemory;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.service.AiServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AgentConfig {

    @Bean
    public ChatMemory chatMemory(){
        MessageWindowChatMemory memory=MessageWindowChatMemory.builder()
                .maxMessages(20).build();
        return memory;
    }


}
