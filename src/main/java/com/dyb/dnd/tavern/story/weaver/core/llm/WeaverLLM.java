package com.dyb.dnd.tavern.story.weaver.core.llm;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;
import jakarta.enterprise.context.ApplicationScoped;

@SuppressWarnings("CdiManagedBeanInconsistencyInspection")
@RegisterAiService
@SystemMessage("You are a narrative AI Game Master guiding players through a fantasy world." +
        "Keep responses vivid, immersive, and interactive."
)
@ApplicationScoped
public interface WeaverLLM {
    String chat(@UserMessage String userMessage);
}
