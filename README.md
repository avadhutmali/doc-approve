
# DocApprove 🧾✅

**DocApprove** is an online document verification portal that allows authorized users to upload, approve, and track the status of submitted documents securely.

> 🚧 This project is currently under development.

---

## 📁 Project Structure

- `Entity/` – JPA entity classes (e.g. User, Document, Review)
- `Repository/` – Spring Data JPA interfaces
- `Service/` – Business logic layer
- `Controller/` – REST APIs
- `resources/` – `application.properties`, static files

---

## 🚀 Features (Planned)

- ✅ User registration & role-based authentication
- 🗂️ Upload and manage documents
- 👮 Admin & reviewer roles for verification workflow
- 🧾 Approval logs & status tracking
- 📊 Dashboard for document analytics (future)

---

## 🛠️ Tech Stack

- Java 17  
- Spring Boot 3.5.x  
- Spring Security  
- MySQL  
- Maven  
- (Planned) React.js for frontend

---

## ⚙️ Setup (for dev)

1. Clone the repo:
   ```bash
   git clone https://github.com/your-username/doc-approve.git
   ```
2. Configure your `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/documentflow
   spring.datasource.username=root
   spring.datasource.password=your-password
   ```
3. Run the app:
   ```bash
   ./mvnw spring-boot:run
   ```

---

## 📌 Current Status

- [x] User entity + basic auth via Spring Security  
- [x] JPA setup with MySQL  
- [ ] File upload & document entity  
- [ ] Reviewer dashboard  
- [ ] Frontend integration  
- [ ] End-to-end flow

---

## 👤 Author

**Avdhut Mali**   
[GitHub](https://github.com/avadhutmali)

---

## 📜 License

MIT License (or choose your preferred license)
