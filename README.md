# wa2-g12-ticketing-system

Repository for the Lab 5 assignment of the Web Applications II course at Polytechnic University of Turin (academic year 2021-2022).

## Group 12 members:
| Student ID | Surname | Name |
| --- | --- | --- |
| s286154 | Ballario | Marco |
| s277873 | Galazzo | Francesco |
| s276086 | Tangredi | Giovanni |
| s292522 | Ubertini | Pietro |

## Description

### Project structure:
- `wa2-g12-user-registration`: Contains the login service
- `wa2-g12-traveler-service`: Contains the traveler service and the instructions to setup the postgres database container.
- `wa2-g12-ticket-catalogue-service`: Contains the catalogue service and the instructions to setup Apache Kafka.
- `wa2-g12-payment-service`: Contains the payment service. It requires Kafka.
- `wa2-g12-bank-service`: Contains the bank service, used to mock a real bank service. It requires Kafka.

### Services
| Service | Port |
| --- | --- |
| login-service | 8080 |
| traveler-service | 8081 |
| ticket-catalogue-service | 8082 |
| payment-service | 8083 |
| bank-service | 8084 |
