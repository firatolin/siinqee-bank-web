# 🏦 Sinqee Banking System - Web Application

A modern banking system built with **Spring Boot** (backend) and **React + Tailwind CSS** (frontend).

## 📁 Project Structure

siinqee-bank-web/
├── backend/ # Spring Boot REST API
│ ├── src/
│ │ ├── main/java/com/siinqee/banking/
│ │ │ ├── controller/ # REST Controllers
│ │ │ ├── service/ # Business Logic
│ │ │ ├── repository/ # JPA Repositories
│ │ │ ├── entity/ # Database Entities
│ │ │ ├── dto/ # Data Transfer Objects
│ │ │ └── config/ # Configuration
│ │ └── resources/ # Properties, static files
│ ├── pom.xml # Maven dependencies
│ └── maven/ # Maven wrapper
├── frontend/ # React + Tailwind CSS (to be created)
└── README.md

text

## 🚀 Features

### Backend (Spring Boot)

- ✅ RESTful API with Spring Boot 3.1.5
- ✅ JPA/Hibernate for database operations
- ✅ MySQL database integration
- ✅ Spring Security for authentication
- ✅ CORS configuration for React
- ✅ Complete banking operations:
  - Customer management
  - Account creation
  - Transactions (deposit, withdraw, transfer)
  - Admin dashboard
  - Account status management (Active/Frozen)

### Frontend (React - To be built)

- 🔜 Modern React 18 with Vite
- 🔜 Tailwind CSS for styling
- 🔜 Responsive design
- 🔜 Admin dashboard
- 🔜 Customer portal
- 🔜 Real-time transactions

## 🛠️ Tech Stack

**Backend:**

- Java 21
- Spring Boot 3.1.5
- Spring Data JPA
- Spring Security
- MySQL 8.0
- Maven 3.9.6

**Frontend:**

- React 18
- Tailwind CSS
- Axios for API calls
- React Router

## 📦 Setup & Installation

### Prerequisites

- Java 17+
- Node.js 18+
- MySQL 8.0+
- Maven 3.9+

### Backend Setup

```bash
cd backend
mvn clean compile
mvn spring-boot:run
Frontend Setup (Coming Soon)
bash
cd frontend
npm install
npm run dev
🌐 API Endpoints
Test Endpoints
GET /api/test/hello - Test server status

GET /api/test/db-check - Test database connection

Admin Endpoints
GET /api/admin/customers - Get all customers

POST /api/admin/customers - Create new customer

PUT /api/admin/customers/{accountNumber}/status - Update account status

Customer Endpoints
GET /api/customer/dashboard - Customer dashboard

POST /api/customer/transfer - Transfer funds

GET /api/customer/transactions - Get transactions

🗄️ Database Schema
sql
CREATE DATABASE siinqee_banking;

-- Tables: customers, accounts, transactions, admin_users
-- Auto-created by JPA Hibernate with spring.jpa.hibernate.ddl-auto=update
📊 Entity Relationships
text
Customer 1:1 Account
Customer 1:N Transaction
Account 1:N Transaction
🚀 Getting Started
Clone the repository

Setup MySQL database (siinqee_banking)

Configure application.properties

Run backend: mvn spring-boot:run

Access at: http://localhost:8080

📝 License
MIT License - see LICENSE file

👥 Contributors
ARU-CS3rd-GROUP-3 - Initial work

🙏 Acknowledgments
JavaFX to Web conversion project

Spring Boot documentation

React community
```
