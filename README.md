# dev-java-web-maven-spring-thyme-cosmosdb-simple

## Description
A POC for springboot web app with thymeleaf support
connecting to a database.

## Tech stack
- java
- maven
  - springboot
  - thymeleaf
  - cosmos connector
- bootstrap
- jquery
- dataTable

## Build note
Cosmosdb docker is windows only.

## Docker stack
- mcr.microsoft.com/cosmosdb/windows/azure-cosmos-emulator
- maven:3-openjdk-17

## To run
`sudo ./install.sh -u`
Available at http://localhost

## To stop
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credit
[Cosmosdb springboot](https://github.com/eugenp/tutorials/tree/master/persistence-modules/spring-data-cosmosdb)