package com.example.chatgptbasedcookingingredients.controller;

import com.example.chatgptbasedcookingingredients.model.OpenAiMessage;
import com.example.chatgptbasedcookingingredients.model.OpenAiRequest;
import com.example.chatgptbasedcookingingredients.model.OpenAiResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {

    private final RestClient restClient;

    public IngredientController(@Value("${OPENAI_API_KEY}") String apiKey) {
        this.restClient = RestClient.builder()
                .baseUrl("https://api.openai.com/v1")
                .defaultHeader("Authorization", "Bearer " + apiKey)
                .build();
    }

    // TODO: This should return "vegan", "vegetarian" or "regular" depending on the ingredient.
    @PostMapping
    public String categorizeIngredient(@RequestBody String ingredient) {
        OpenAiResponse response = restClient.post()
                .uri("/chat/completions")
                .contentType(MediaType.APPLICATION_JSON)
                .body(new OpenAiRequest("gpt-5", List.of(
                        new OpenAiMessage("user",
                        "Please answer with one word, if the ingredient is vegan, vegetarian or other"),
                        new OpenAiMessage("user", ingredient))))
                .retrieve()
                .body(OpenAiResponse.class);
        return response.choices().getFirst().message().content();
    }

}
