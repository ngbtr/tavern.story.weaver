package com.dyb.dnd.tavern.story.weaver.core;

import com.dyb.dnd.tavern.story.weaver.core.llm.WeaverLLM;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class Weaver {
    @Inject
    WeaverLLM llm;

    public String weave(String userInput) {
        return llm.chat(userInput);
    }
}
