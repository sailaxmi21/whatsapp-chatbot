# whatsapp-chatbot
A simple WhatsApp chatbot backend simulation using **Java** and **Spring Boot**.  
It accepts JSON messages via REST API and responds with predefined replies.

---

## Features

- POST `/webhook` endpoint to receive messages
- Predefined replies:
  - `"Hi"` → `"Hello"`
  - `"Bye"` → `"Goodbye"`
- Logs all incoming messages to console
- Responds `"I don't understand"` for unknown messages
