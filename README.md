# FreelanceHub

Marketplace platform connecting companies with skilled freelancers, enabling project publishing, proposals, digital contracts, and milestone-based payments.

## Tech Stack

- **Java 17** + **Spring Boot 3.5.x**
- **PostgreSQL** — primary database
- **Redis** — caching and session management
- **Apache Kafka** — event streaming
- **RabbitMQ** — task queue
- **Docker** — containerization
- **GitHub Actions** — CI/CD
- **GCP Cloud Run** — deployment

## Architecture

Modular monolith with hexagonal architecture per module, designed for future migration to microservices.

## Modules

- `identity` — authentication, authorization, user management
- `projects` — project lifecycle and proposals
- `contracts` — digital contracts and milestones
- `payments` — escrow, milestone payments and billing
- `notifications` — event-driven notifications
- `backoffice` — admin and dispute management

## Getting Started

### Prerequisites
- Java 17
- Maven 3.9+
- Docker

### Run locally
```bash
mvn spring-boot:run
```

## License

MIT