package com.zxz.aiagent.template;

import org.springframework.ai.chat.messages.Message;
import org.springframework.ai.chat.prompt.ChatOptions;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplateActions;
import org.springframework.ai.chat.prompt.PromptTemplateMessageActions;
import org.springframework.ai.model.Media;

import java.util.List;
import java.util.Map;

public class PromptTemplate implements PromptTemplateActions, PromptTemplateMessageActions {
    @Override
    public Prompt create() {
        return null;
    }

    @Override
    public Prompt create(ChatOptions modelOptions) {
        return null;
    }

    @Override
    public Prompt create(Map<String, Object> model) {
        return null;
    }

    @Override
    public Prompt create(Map<String, Object> model, ChatOptions modelOptions) {
        return null;
    }

    @Override
    public Message createMessage() {
        return null;
    }

    @Override
    public Message createMessage(List<Media> mediaList) {
        return null;
    }

    @Override
    public Message createMessage(Map<String, Object> model) {
        return null;
    }

    @Override
    public String render() {
        return "";
    }

    @Override
    public String render(Map<String, Object> model) {
        return "";
    }
    // 实现细节
}
