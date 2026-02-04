# Employee Shift Management System

A full-stack application designed to streamline staff scheduling, shift management, and internal team communication.

## 🏗️ Architecture
* **Backend:** Spring Boot (Java 17), Maven, MySQL/H2 Database.
* **Frontend:** Flutter Mobile Application (Dart).
* **Communication:** RESTful API with JSON exchange.

## 📂 Project Structure
* `/backend`: Contains the Spring Boot API, entities, repositories, and services.
* `/frontend`: Contains the Flutter mobile app source code and assets.

## 🚀 Getting Started

### Prerequisites
* Java 17 or higher
* Flutter SDK (3.x recommended)
* Maven

### Installation & Execution
1. **Backend:**
   - Navigate to the `/backend` directory.
   - Run `mvn spring-boot:run` or execute the main class via your IDE.
   - The API will be available at `http://localhost:8080`.

2. **Frontend:**
   - Navigate to the `/frontend` directory.
   - Run `flutter pub get` to install dependencies.
   - Run `flutter run` to launch the app on an emulator or physical device.

## 🛠️ Key Features
- **User Management:** Full CRUD operations for employees and supervisors.
- **Shift Scheduling:** Assign, view, and manage work shifts.
- **Internal Messaging:** Real-time chat system for team communication.
- **Leave Requests:** Digital handling of employee time-off requests.
