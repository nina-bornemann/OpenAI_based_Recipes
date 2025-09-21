package com.example.chatgptbasedcookingingredients;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;
import org.springframework.beans.factory.annotation.Value;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {

    private final RestClient restClient;

    public IngredientController(@Value("${OPENAI_API_KEY}") String apiKey) {
        this.restClient = RestClient.builder()
                .baseUrl("https://api.openai.com/v1/")
                .defaultHeader("Authorization", "Bearer " + apiKey)
                .build();
    }

    @PostMapping
    String categorizeIngredient(@RequestBody String ingredient) {

        // TODO: This should return "vegan", "vegetarian" or "regular" depending on the ingredient.

        return "vegan";
    }

}
