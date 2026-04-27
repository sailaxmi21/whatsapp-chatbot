WhatsApp Chatbot Backend (Spring Boot)

A simple WhatsApp-style chatbot backend built using **Java and Spring Boot**.  
It exposes REST APIs to simulate message handling and returns predefined responses based on user input.

---

## 🚀 Features

- 📩 REST API to receive messages (`/webhook`)
- 🤖 Predefined chatbot responses:
  - "Hi" → "Hello"
  - "Bye" → "Goodbye"
- ❓ Default response for unknown messages
- 🧾 Logs all incoming messages to console
- ⚡ Lightweight and fast Spring Boot backend

---

## 🛠️ Tech Stack

- Java
- Spring Boot
- REST APIs
- Maven

---

## 📂 Project Structure


whatsapp-chatbot/
│
├── controller/ # Handles API requests
├── service/ # Business logic (response handling)
├── model/ # Data models
├── config/ # Configuration classes (if any)
└── Application.java # Main Spring Boot entry point


---

## 📡 API Endpoint

### 🔹 Send Message

**POST** `/webhook`

#### Request Body:
```json
{
  "message": "Hi"
}
Response:
{
  "reply": "Hello"
}
