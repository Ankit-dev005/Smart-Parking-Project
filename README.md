# Smart Parking System

A backend application for managing parking slots, vehicles, parking bookings, user authentication, and parking charges.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Spring Security
- JWT
- REST APIs
- Maven
- Postman

## Architecture

The project follows a layered architecture:

Controller → Service → Repository → Database

- Controller: Handles HTTP requests and responses.
- Service: Contains business logic.
- Repository: Handles database operations using Spring Data JPA.
- DTO: Transfers data between client and application.
- Entity: Represents database tables.

## Main Features

- User registration and login
- JWT-based authentication
- Role-based authorization for Admin and User
- Vehicle management
- Parking slot management
- Parking slot booking
- Vehicle entry and exit
- Dynamic parking price calculation
- Input validation
- Exception handling

## Parking Charges

| Vehicle Type | Rate per Hour |
|--------------|---------------|
| CAR          | ₹50           |
| AUTO         | ₹40           |
| BIKE         | ₹20           |

Minimum parking duration for billing is 1 hour.

## API Endpoints

### Authentication

POST `/auth/register`

POST `/auth/login`

### Vehicle

POST `/vehicle/saveVehicle`

### Parking Slot

POST `/parkingslot/register`

### Booking

POST `/booking/book`

PUT `/booking/exit`

## How to Run

### 1. Clone the repository

```bash
git clone https://github.com/Ankit-dev005/Smart-Parking-Project.git