# Aprendiendo Java con Spring Boot

Este proyecto es una aplicación de ejemplo para aprender los conceptos básicos de Java y Spring Boot, utilizando varias dependencias para crear una aplicación web con acceso a una base de datos MySQL.

## Tecnologías Utilizadas

- **Java 22**: Lenguaje de programación.
- **Spring Boot 3.2.5**: Framework para simplificar el desarrollo de aplicaciones Java.
- **Spring Web**: Módulo de Spring para construir aplicaciones web, incluyendo RESTful.
- **MySQL Driver**: Conector para bases de datos MySQL.
- **Spring Data JPA**: Abstracción de persistencia sobre JPA.
- **Spring Boot DevTools**: Herramientas de desarrollo para Spring Boot, incluyendo recarga automática de código.

## Requisitos Previos

- **Java 22**: Asegúrate de tener instalado JDK 22. [Descargar JDK](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- **Maven**: Herramienta de gestión de dependencias. [Instalar Maven](https://maven.apache.org/install.html)
- **MySQL**: Base de datos relacional. [Descargar MySQL](https://dev.mysql.com/downloads/installer/)

## Base de datos

- Nombre de la tabla: Persona
- Campos:
    - id: Clave primaria autoincremental
    - nombre: Tipo VARCHAR
    - apellidos: Tipo VARCHAR
    - sexo: Tipo VARCHAR
    - correo: Tipo VARCHAR

## Configuración del Proyecto

### 1. Clonar el Repositorio

```sh
git clone https://github.com/tu_usuario/java-spring-boot-crud.git
cd java-spring-boot-crud