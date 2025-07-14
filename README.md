# 🛒 Products SpringIO

A simple Spring Boot REST API to manage product listings — built as part of learning Spring MVC and RESTful services.

---

## 📦 Features

- Exposes a REST API to:
  - Fetch all products
  - Add a new product
  - Get product by ID
- In-memory product list (no database yet)
- Easy to extend for real-world use

---

## 🧑‍💻 Technologies Used

- Java 21
- Spring Boot 3.5.x
- Spring Web (REST Controller)
- Lombok (for model simplicity)
- Tested via Bruno / Postman

---

## 🚀 How to Run

1. **Clone the repo:**
   ```bash
   git clone https://github.com/KnowME-AS-Aditya/Products_springIO.git
   cd Products_springIO
Open in IntelliJ or any Java IDE.

Run the Application:
Run DemoApplication.java from the model package.
It should start at:

arduino
Copy
Edit
http://localhost:8080
📬 REST Endpoints
Method	Endpoint	Description
GET	/products	Fetch all products
POST	/products	Add a product (JSON)
GET	/products/{id}	Get product by ID

🧪 Example Requests
✅ Get All Products
http
Copy
Edit
GET http://localhost:8080/products
🆕 Add Product
http
Copy
Edit
POST http://localhost:8080/products
Content-Type: application/json

{
  "prodId": 201,
  "prod_name": "Gaming Mouse",
  "prod_price": 1299.99
}
🔧 API Testing
You can test the API using:

🧪 Postman Web (with Postman Agent)

🟠 Bruno — lightweight, offline API client

🧠 Author
Made with ☕ by Aditya Ranjan Sahoo
Backend Aspirant & Spring Boot Learner

📜 License
This project is licensed under the MIT License — feel free to use and modify.
