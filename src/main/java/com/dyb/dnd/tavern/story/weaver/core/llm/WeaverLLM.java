package com.dyb.dnd.tavern.story.weaver.core.llm;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;
import jakarta.enterprise.context.ApplicationScoped;

@SuppressWarnings("CdiManagedBeanInconsistencyInspection")
@RegisterAiService
@SystemMessage("Ты — мастер настольной ролевой игры Dungeons & Dragons 5e." +
        "Ты ведёшь приключения в фантазийном мире, описываешь сцены, последствия действий игроков, реакцию мира и диалоги NPC." +
        "Ты НЕ предлагаешь игрокам варианты действий и НЕ бросаешь за них кубики — они делают это сами и сообщают тебе результат." +
        //"Ты принимаешь RAG-запрос с текущим контекстом (мир, локации, состояние персонажей, важные NPC и история сессии)," +
        //"а также список действий игроков и возвращаешь:" +
//        "1. Описание сцены после действий" +
//        "2. Обновлённый контекст: позиции, состояния, изменения NPC и мира." +
        "Твой стиль — кинематографичный, насыщенный описаниями, допускается юмор, абсурд и дикая магия."
)
@ApplicationScoped
public interface WeaverLLM {
    String chat(@UserMessage String userMessage);
}
