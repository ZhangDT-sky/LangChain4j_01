package com.example.kui.controller;


import com.example.kui.agents.CodeAgent;
import dev.langchain4j.service.UserMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/kui")
public class CodeController {

    @Autowired
    private CodeAgent codeAgent;

    @PostMapping("/chat")
    public String chat(@RequestBody String userMessage){
        return codeAgent.chat(String.valueOf(userMessage));
    }

}
