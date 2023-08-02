Software Requirements
Programming language: Java
Framework: Spring Boot
Database: MySQL or in-memory
Automated build: Apache Maven
UI: Any JavaScript framework (ReactJS, Angular, VueJS, etc) 
Description
This sample project is managing gateways - master devices that control multiple peripheral devices. 
Your task is to create a REST service (JSON/HTTP) for storing information about these gateways and their associated devices. This information must be stored in the database. 
When storing a gateway, any field marked as “to be validated” must be validated and an error returned if it is invalid. Also, no more than 10 peripheral devices are allowed for a gateway.
The service must also offer an operation for displaying information about all stored gateways (and their devices) and an operation for displaying details for a single gateway. Finally, it must be possible to add and remove a device from a gateway.

Each gateway has:
•	a unique serial number (string), 
•	human-readable name (string),
•	IPv4 address (to be validated),
•	multiple associated peripheral devices. 
Each peripheral device has:
•	a UID (number),
•	vendor (string),
•	date created,
•	status - online/offline.
Other considerations
Please, provide 
-	Basic UI - recommended or (providing test data for Postman (or other rest client) if you do not have enough time.
-	Meaningful Unit tests.
-	Readme file with installation guides.
-	An automated build.

Configuration
Programming language: Java
Framework: Spring Boot
Database: in-memory H2
Automated build: Apache Maven

Postman

Add gateways
POST : http://localhost:8080/gateways/

{
    "ipv4Address":"192.168.1.1",
    "name":"Momar",
    "serialNumber" : "GTW-001"
}

All gateways without device

GET : http://localhost:8080/gateways/

Add device to a gateway

POST : http://localhost:8080/gateways/{gatewayId}/devices/

{
    "created":"2023-08-02T11:31:02.441+0000",
    "status":"online",
    "uid" : 1,
    "vendor": "Iphone"
}

Remove device from a gateway

DELETE : http://localhost:8080/gateways/{gatewayId}/devices/{deviceId}

Details for a single gateway
GET : http://localhost:8080/gateways/{gatewayId}/devices/

GET ALL GATEWAYS WITH DEVICE 

GET : http://localhost:8080/gateways/withdevice

