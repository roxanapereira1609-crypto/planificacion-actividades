
# Apoyo Educativo

## Descripción del proyecto

Apoyo Educativo es un proyecto web desarrollado con el propósito de facilitar la organización de información administrativa dentro de un establecimiento educativo.

Durante su desarrollo, el proyecto fue evolucionando hasta incorporar dos aplicaciones independientes: Planificación de Actividades y Asistencias de Docentes.

Ambas buscan facilitar tareas que normalmente requieren llevar registros manuales, permitiendo consultar y administrar la información desde un navegador.

## Tecnologías utilizadas

Java 21

Spring Boot

Maven

HTML5

Thymeleaf

Spring Security

Spring Data JPA

PostgreSQL

Neon

Git y GitHub

Render

Visual Studio Code

## Variables de entorno requeridas en Render

Para que las aplicaciones de Apoyo Educativo funcionen correctamente en producción, se utilizan variables de entorno configuradas en Render. Estas permiten establecer la conexión con PostgreSQL en Neon y administrar las credenciales de acceso sin escribir contraseñas directamente en el código.

| Variable | Función |
|---|---|
| `SPRING_PROFILES_ACTIVE` | Activa el perfil de producción (`prod`). |
| `DB_URL` | Contiene la dirección de conexión a PostgreSQL en Neon. |
| `DB_USER` | Identifica al usuario de la base de datos. |
| `DB_PASSWORD` | Almacena la contraseña de conexión a la base de datos. |
| `ADMIN_PASSWORD` | Define la contraseña del usuario administrador. |
| `DOCENTE_PASSWORD` | Define la contraseña del usuario docente. |
| `PORT` | Puerto utilizado por el servicio web, cuando corresponde a la configuración de Render. |

### Seguridad de las credenciales

Por motivos de seguridad, en este documento se presentan únicamente los nombres y las funciones de las variables de entorno.

Las contraseñas y los datos privados de conexión se configuran directamente en Render y no se publican en GitHub.

Esta práctica permite proteger la información sensible y facilita la administración de las aplicaciones durante su despliegue.

## Organización del proyecto

Las aplicaciones utilizan una estructura organizada por capas:

Controller: recibe las solicitudes y dirige las operaciones del sistema.

Service: contiene la lógica de funcionamiento y las reglas del proyecto.

Repository: permite consultar y almacenar información mediante JPA.

Model / Entity: representa los datos que se administran.

Templates: contiene las vistas que utiliza el usuario.

Esta organización permite mantener el código ordenado y facilita futuras mejoras.

## Rutas disponibles

1. Planificación de Actividades

/login-actividades: inicio de sesión.

/actividades: consulta de las actividades registradas.

Aplicación publicada:
https://planificacion-actividades.onrender.com

2. Asistencias de Docentes

/login: inicio de sesión.

/asistencias: listado de asistencias registradas.

/asistencias/nuevo: formulario para registrar una asistencia.

/asistencias/editar/{id}: formulario para editar una asistencia existente.

Aplicación publicada:
https://asistencias-docentes.onrender.com

## Reposiorios de Github
  
- Asistencia docentes: 
https://github.com/roxanapereira1609-crypto/asistencias-docentes

- Planificacion de actividades:
https://github.com/roxanapereira1609-crypto/planificacion-actividades

## Seguridad y validaciones

Se implementó un sistema de inicio de sesión con roles de administrador y docente.

Los permisos permiten limitar el acceso a determinadas operaciones según el usuario que haya iniciado sesión.

## Base de datos y despliegue

Las aplicaciones utilizan PostgreSQL alojado en Neon para almacenar sus registros.

Los sistemas se encuentran publicados en Render y pueden consultarse desde un navegador.

Durante las pruebas se comprobó que los registros permanecen disponibles después de volver a ingresar a las aplicaciones.

También se verificó el proceso de actualización del código mediante GitHub y el despliegue automático en Render.

## Cómo ejecutar el proyecto

1. Abrir la carpeta del proyecto en Visual Studio Code.
2. Abrir una terminal en la carpeta que contiene `pom.xml`.
3. Ejecutar el comando:

   `.\mvnw.cmd spring-boot:run`

4. Esperar a que Spring Boot inicie correctamente.
5. Abrir `http://localhost:8080` en el navegador.


## Estado actual

Apoyo Educativo cuenta con dos aplicaciones web publicadas y funcionales, que permiten administrar actividades y asistencias de docentes.

Como parte de las siguientes mejoras, se contempla continuar fortaleciendo la experiencia del usuario, la organización de la información y las funcionalidades de ambos sistemas.

## Pitch ejecutivo: https://www.canva.com/design/DAHaNSPbkUE/-u4XOXASnl0OkUL971PF4w/view

## Video de 5min: 

https://correo2urledu-my.sharepoint.com/:v:/r/personal/rapereirad_correo_url_edu_gt/_layouts/15/stream.aspx?id=%2Fpersonal%2Frapereirad%5Fcorreo%5Furl%5Fedu%5Fgt%2FDocuments%2FProgramaci%C3%B3n%201%2FProyecto%2DAsistencia%2DDocente%2Ewmv&share=cQqqO4XksUs0QrcZt15%5FO3Z5EgUCEzKD%5FPP9Qqx8L98w0hiuIg  

https://correo2urledu-my.sharepoint.com/:v:/r/personal/rapereirad_correo_url_edu_gt/_layouts/15/stream.aspx?id=%2Fpersonal%2Frapereirad%5Fcorreo%5Furl%5Fedu%5Fgt%2FDocuments%2FProgramaci%C3%B3n%201%2FProyecto%5FActividades%2Emp4&share=cQon%5FVZMnZyTRqDEkZkBPPCkEgUCEIKXA4TiLE0lkPIcOMdWVg

## Autora

Roxana Adelaida Pereira Delgado
