package com.wcy.oop.f_super;

import lombok.Data;

public class Demo09 {

    public static void main(String[] args) {

        DeepSeekChatModel deepSeekChatModel = new DeepSeekChatModel("deepseek-v5-pro");
        System.out.println(deepSeekChatModel);

        DeepSeekChatModel chatgpt = new DeepSeekChatModel("gpt-6", "openai", "sk-123123", "www.baidu.com");
        System.out.println(chatgpt);

    }
}

@Data
// @AllArgsConstructor
// @NoArgsConstructor
class ChatModel {
    private String model;
    private String modelProvider;
    private String apiKey;
    private String baseUrl;

    public ChatModel(String model, String modelProvider, String apiKey, String baseUrl) {
        this.model = model;
        this.modelProvider = modelProvider;
        this.apiKey = apiKey;
        this.baseUrl = baseUrl;
    }
}

class DeepSeekChatModel extends ChatModel {

    public DeepSeekChatModel(String model, String modelProvider, String apiKey, String baseUrl) {
        super(model, modelProvider, apiKey, baseUrl);
    }

    public DeepSeekChatModel(String model) {
        this(model, null, null, null);
        // 默认 modelProvider
        String modelProvider = null;
        String baseUrl = null;
        if (model.startsWith("deepseek")) {
            modelProvider = "deepseek";
            baseUrl = "http://www.deepseek.com/api";
        }
        // 默认 apiKey
        String apiKey = System.getenv("DEEPSEEK_API_KEY");
        super.setApiKey(apiKey);
        super.setModelProvider(modelProvider);
        super.setBaseUrl(baseUrl);
    }

    public DeepSeekChatModel(String model, String modelProvider) {
        this(model, modelProvider, null, null);
        // 默认 modelProvider
        String baseUrl = null;
        if (model.startsWith("deepseek")) {
            baseUrl = "http://www.deepseek.com/api";
        }
        // 默认 apiKey
        String apiKey = System.getenv("DEEPSEEK_API_KEY");
        super.setApiKey(apiKey);
        super.setBaseUrl(baseUrl);
    }

    public DeepSeekChatModel(String model, String modelProvider, String apiKey) {
        this(model, modelProvider, apiKey, null);
        // 默认 modelProvider
        String baseUrl = null;
        if (model.startsWith("deepseek")) {
            baseUrl = "http://www.deepseek.com/api";
        }
        super.setBaseUrl(baseUrl);
    }
}


