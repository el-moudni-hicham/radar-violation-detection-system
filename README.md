# Radar Violation Detection System

```
This is a web-based application built using Spring Boot and Angular. It is a radar violation detection
system It aims to detect and track radar violations, providing real-time notifications and reporting
reporting for efficient traffic management.
The backend is built using Spring Boot , while the frontend is built using Angular with Bootstrap for
the user interface.

In addition to the standard operations of data querying and modification, the system allow for
the submission of a speeding violation, resulting in an offense record. Furthermore, it should enable
vehicle owners to view their own violations, providing them with easy access to their offense history.
```

# Table of Contents
- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Installation](#installation)
- [Technologies Used](#technologies-used)
- [Technical Architecture](#technical-architecture)
- [Class Diagram](#class-diagram)
- [Services](#getting-started)
    - [Regestration Service](#regestration-service)
    - [Radar Service](#radar-service)
    - [Infraction Service](#infraction-service)
- [License](#license)


## Getting Started
### Prerequisites
Before running this application, you need to have the following software installed on your system :

```java
- Java Development Kit (JDK) version 11 or later
- Node.js version 14 or later
- Angular CLI version 13 or later
```

### Installation
Follow these steps to install and run the application :

1. Clone the repository :
```
git clone https://github.com/el-moudni-hicham/radar-violation-detection-system.git
```
2. Navigate to the backend directory and run the following command to start the each Spring Boot project :
```
./mvnw spring-boot:run
```
3. Navigate to the frontend directory and run the following command to install the required packages :
```
npm install
```
4. After the packages are installed, run the following command to start the Angular application :
```
ng serve
```
5. Open your browser and navigate to `http://localhost:4200` to access the application.

## Technologies Used
The following technologies and frameworks are used in this application:

- Spring Boot
- Spring Cloud
- Eureka Descovery
- Angular
- Bootstrap
- MySQL

## Functionalities

The application allows performing the following operations:
- Submit a speeding violation.
- View violations of a vehicle owner.
- Modify and view radar data.
- Modify and view vehicle and owner data.
- Modify and view offense data.

## Technical Architecture

<img src="projet-archi.png" width="90%">

## Class Diagram

<img src="backend.png" width="70%">

## Services

The backend contains 5 services :

### Regestration Service :

```
Registration microservice manages vehicles owned by owners. Each vehicle belongs to a single owner.
An owner is defined by their ID, name, date of birth, email.
A vehicle is defined by its ID, regestration number, brand, fiscal power, and model
```
- Service Structure
<pre>

├───src
│   ├───main
│   │   ├───java
│   │   │   └───ma
│   │   │       └───enset
│   │   │           └───regestrationservice
│   │   │               │   RegestrationServiceApplication.java
│   │   │               │
│   │   │               ├───entites
│   │   │               │       Owner.java
│   │   │               │       OwnerRequest.java
│   │   │               │       Vehicle.java
│   │   │               │
│   │   │               ├───repositories
│   │   │               │       OwnerRepository.java
│   │   │               │       VehicleRepository.java
│   │   │               │
│   │   │               └───web
│   │   │                   ├───graphql
│   │   │                   │       OwnerGraphqlController.java
│   │   │                   │       VehicleGraphqlController.java
│   │   │                   │
│   │   │                   ├───grpc
│   │   │                   │   │   GrpcConfig.java
│   │   │                   │   │   OwnerGrpcService.java
│   │   │                   │   │
│   │   │                   │   └───stub
│   │   │                   │           OwnerGrpcServiceGrpc.java
│   │   │                   │           OwnerService.java
│   │   │                   │
│   │   │                   ├───rest
│   │   │                   │       OwnerRestController.java
│   │   │                   │       VehicleRestController.java
│   │   │                   │
│   │   │                   └───soap
│   │   │                           CXFSoapWebServiceConfig.java
│   │   │                           OwnerSoapController.java
│   │   │                           OwnerSoapService.java
│   │   │
│   │   └───resources
│   │       │   application.properties
│   │       │   owner-service.proto
│   │       │   xsd-schema.xsd
│   │       │
│   │       ├───graphql
│   │       │       schema.graphqls
│   │       │
│   │       ├───static
│   │       └───templates

</pre>
- Web services integration REST, GraphQL, SOAP et GRPC :

 > a. REST :

Tests with `Postman`

<table> 
    <tr>
        <td >
            <h5 align="center">All Vehicles</h3>
                <p align="center">
                    <img src="https://github.com/el-moudni-hicham/radar-violation-detection-system/assets/85403056/77beb752-739f-47fd-845f-c666ea4ab362" alt="project example"/>
                </p>
        </td>
    </tr>
    <tr>
        <td >
            <h5 align="center">Find Vehicle By Id</h3>
                <p align="center">
                    <img src="https://github.com/el-moudni-hicham/radar-violation-detection-system/assets/85403056/4b2cf16c-1340-4404-8cec-1bcdc51f524c" alt="project example"/>
                </p>
        </td>
    </tr>
</table>

<table> 
    <tr>
        <td >
            <h5 align="center">Delete Vehicle</h3>
                <p align="center">
                    <img src="https://github.com/el-moudni-hicham/radar-violation-detection-system/assets/85403056/7a2c7083-7539-4dcd-b506-3556fec50c3a" alt="project example"/>
                </p>
        </td>
    </tr>
    <tr>
        <td >
            <h5 align="center">Update Vehicle</h3>
                <p align="center">
                    <img src="https://github.com/el-moudni-hicham/radar-violation-detection-system/assets/85403056/270691bf-1f79-446c-9359-20fec739881c" alt="project example"/>
                </p>
        </td>
    </tr>
</table>


 > b. GraphQL :
<table>
    <tr>
        <td>
            <h5 align="center">All Vehicles with specific attributs </h3>
                <p align="center">
                    <img alt="project example"
                         src="https://github.com/el-moudni-hicham/radar-violation-detection-system/assets/85403056/e29db325-f14f-4d6a-9916-0ee1d1760da0"/>
                </p>
        </td>
    </tr>
    <tr>
        <td>
            <h5 align="center">Find Vehicle By Id with specific attributs</h3>
                <p align="center">
                    <img alt="project example"
                         src="https://github.com/el-moudni-hicham/radar-violation-detection-system/assets/85403056/15f188ac-d384-455d-a8ed-91363143f97f"/>
                </p>
        </td>
    </tr>
</table>

 > c. SOAP :
 


 > d. GRPC :

Tests with `BloomRPC`
<table>
    <tr>
        <td>
            <h5 align="center">All Owners </h3>
                <p align="center">
                    <img alt="project example"
                         src="https://github.com/el-moudni-hicham/radar-violation-detection-system/assets/85403056/abc8437c-d043-4821-b684-0a27917cb13c"/>
                </p>
        </td>
    </tr>
    <tr>
        <td>
            <h5 align="center">Find Owner By Id</h3>
                <p align="center">
                    <img alt="project example"
                         src="https://github.com/el-moudni-hicham/radar-violation-detection-system/assets/85403056/7b33bad2-3ac7-415d-ab60-33d3ae23b08e"/>
                </p>
        </td>
    </tr>
</table>



####

### Radar Service :

```
Radar microservice responsible for managing radars handles radar entities defined
by their ID, maximum speed limit, and coordinates (longitude and latitude)
```
- Service Structure
<pre>
├───src
│   ├───main
│   │   ├───java
│   │   │   └───ma
│   │   │       └───enset
│   │   │           └───radarservice
│   │   │               │   RadarServiceApplication.java
│   │   │               │
│   │   │               ├───entites
│   │   │               │       Radar.java
│   │   │               │
│   │   │               ├───feign
│   │   │               │       InfractionRestClient.java
│   │   │               │
│   │   │               ├───models
│   │   │               │       Infraction.java
│   │   │               │       NewData.java
│   │   │               │
│   │   │               ├───repositories
│   │   │               │       RadarRepository.java
│   │   │               │
│   │   │               └───web
│   │   │                       RadarRestController.java
│   │   │
│   │   └───resources
│   │       │   application.properties
│   │       │   radar-service.proto
│   │       │
│   │       ├───static
│   │       └───templates
</pre>

### Infraction Service :

```
Infraction microservice responsible for managing violations handles each violation, which is defined
by its ID, date, the radar number that detected the offense, the vehicle regestration number,
the vehicle's speed, the radar's maximum speed limit, and the fine amount.
```
- Service Structure
<pre>
├───src
│   ├───main
│   │   ├───java
│   │   │   └───ma
│   │   │       └───enset
│   │   │           └───infractionservice
│   │   │               │   InfractionServiceApplication.java
│   │   │               │
│   │   │               ├───entites
│   │   │               │       Infraction.java
│   │   │               │
│   │   │               ├───feign
│   │   │               │       RadarRestClient.java
│   │   │               │       VehicleRestClient.java
│   │   │               │
│   │   │               ├───models
│   │   │               │       NewData.java
│   │   │               │       Owner.java
│   │   │               │       Radar.java
│   │   │               │       Vehicle.java
│   │   │               │
│   │   │               ├───repositories
│   │   │               │       InfractionRepository.java
│   │   │               │
│   │   │               └───web
│   │   │                       InfractionRestController.java
│   │   │
│   │   └───resources
│   │       │   application.properties
│   │       │
│   │       ├───static
│   │       └───templates
</pre>

## Licence
This project is licensed under the GNU General Public License v3.0 - see the LICENSE file for details.
