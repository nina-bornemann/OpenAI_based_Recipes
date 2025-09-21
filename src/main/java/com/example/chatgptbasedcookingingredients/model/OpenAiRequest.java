package com.example.chatgptbasedcookingingredients.model;

import java.util.List;

/*
"Content-Type: application/json" \
  -H "Authorization: Bearer $OPENAI_API_KEY" \
  -d '{
    "model": "gpt-5",
    "messages": [

      {
        "role": "user",
        "content": "Hello!"
      }
    ]
  }'
 */
public record OpenAiRequest(String model,
                            List<OpenAiMessage> messages) {
}
