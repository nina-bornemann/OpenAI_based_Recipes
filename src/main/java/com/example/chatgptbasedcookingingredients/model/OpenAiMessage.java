package com.example.chatgptbasedcookingingredients.model;

/*
{
        "role": "user",
        "content": "Hello!"
      }
 */
public record OpenAiMessage(String role,
                            String content) {
}
