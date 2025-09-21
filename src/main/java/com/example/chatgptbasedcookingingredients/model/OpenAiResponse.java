package com.example.chatgptbasedcookingingredients.model;

/*
{

  "choices": [
    {
      "message": {
        "role": "assistant",
        "content": "Hello! How can I assist you today?"
    }
  ],
}

 */

import java.util.List;

public record OpenAiResponse(List<OpenAiChoice> choices) {
}
