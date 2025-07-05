package com.dyb.dnd.tavern.story.weaver.core;

import io.smallrye.config.ConfigMapping;

@ConfigMapping(prefix = "weaver")
public interface WeaverConfig {
    String systemPrompt();
}
