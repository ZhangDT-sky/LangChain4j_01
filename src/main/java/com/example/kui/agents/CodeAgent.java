package com.example.kui.agents;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;
import reactor.core.publisher.Flux;

import static dev.langchain4j.service.spring.AiServiceWiringMode.EXPLICIT;

@AiService(wiringMode = EXPLICIT,
        chatModel = "openAiChatModel",
        chatMemory = "chatMemory"
)
public interface CodeAgent {

    @SystemMessage("回答用户问题")
    String chat(@UserMessage String message);
}
