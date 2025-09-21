# ChatGPT-Based Cooking Ingredients API 🍳🤖
This Spring Boot project provides two REST endpoints that 
interact with the OpenAI API to assist with cooking and 
ingredient classification. Using your OpenAI API key, the app 
can:

Generate a creative, formatted dish recipe based on a list of ingredients.

Categorize a given ingredient as vegan, vegetarian, or other.

## 🛠️ Tech Stack
- Spring Boot 3.x 
- REST API development and dependency injection
- Rest client to interact with external APIs (OpenAI API)
- Java 24 – Core language features, records, and modern Java syntax
- OpenAI API – GPT-3.5-turbo for dish generation, GPT-5 for ingredient categorization
- JUnit 5 – Unit testing framework
- MockRestServiceServer – Mocking external HTTP requests for tests
- Maven – Project build and dependency management
- JSON – Request and response payloads
- Markdown – Recipe formatting for readable output

---

## 🚀 Endpoints
1. ### Generate Dish by Ingredients
   > POST /dish  

   Request Body: Plain text listing ingredients.  
   Response: Markdown-formatted recipe with title, description, instructions, ingredients, emojis, and cute jokes.
   
Example Request:
   > "tofu, mushrooms, bell peppers, potatoes, rice"

Example Response:
## **Tofu Stir-Fry Over Mushroom Rice**

🥔🍄🫑🥡🍚

This dish combines the earthy flavors of mushrooms, the creamy texture of tofu, and the colorful bell peppers to create a delicious and nutritious meal. Serve it over a bed of fluffy rice for a satisfying and filling dinner! 🌟

### Ingredients:
- 1 block of tofu
- 1 cup of sliced mushrooms
- 1 bell pepper, diced
- 2 potatoes, diced
- 1 cup of rice
- Soy sauce
- Sesame oil
- Garlic
- Ginger
- Salt and pepper

### Instructions:
1. Press tofu to remove excess water and cut into cubes.
2. Cook rice according to package instructions.
3. In a wok, heat sesame oil and sauté garlic and ginger until fragrant.
4. Add diced potatoes and cook until slightly browned.
5. Add in tofu and stir-fry until golden.
6. Toss in mushrooms and bell peppers, cook until vegetables are tender.
7. Season with soy sauce, salt, and pepper to taste.
8. Serve the stir-fry over a bed of mushroom rice and enjoy the flavorful medley of ingredients! 🍲🥢

Don't be a potato-head and give this dish a try! It's sure to tofu-tally satisfy your taste buds. 🌶️🥔

---

2. ### Categorize Ingredient
   > POST /ingredients

   Request Body: Plain text of the ingredient.

   Response: Single word: vegan, vegetarian, or other.


   Example Request:
   > "cheese"

   Example Response:
   > vegetarian

   ## 🎬 Setup
   Clone the repository:
   > git clone https://github.com/yourusername/chatgpt-based-cooking-ingredients.git  

   Set your OpenAI API key as an environment variable:
   > export OPENAI_API_KEY="your_api_key_here"

   Build and run the Spring Boot application:
   > mvn spring-boot:run

   ## Dependencies
   - Spring Boot Web & WebFlux
   - Spring Boot Test
   - RestClient (Spring 3x)
   
   ## 💬 Notes
   Recipes are generated dynamically using OpenAI’s GPT 
   models (gpt-3.5-turbo for dishes, gpt-5 for ingredient 
   categorization).
   Responses include emojis and markdown formatting for a fun,
   readable output.
   Example recipes are illustrative; the API can generate many
   variations depending on ingredients provided.