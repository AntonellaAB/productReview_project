# Product Review System 
**Proyecto de Modelo de Base de Datos y POO**

Este es el sistema centralizado para la gestión y revisión de productos, desarrollado en Java con persistencia en PostgreSQL.

---

## Integrantes y Roles

**Backend:** Antonella, Fabrizio y Mauri
> **Antonella** = User.java - UserDAO.java

> **Mauri** = Product.java - Category.java - ProductDAO.java - CategoryDAO.java

> **Fabrizio** = Review.java - ReviewDAO.java

**Frontend:** Nayeli y Nico

> **Nayeli** = Login

> **Nico** = Menu

**Base de Datos:** Ezequiel e Ivo

**Documentación:** Jorge (y todos)

---


## Tecnologías utilizadas
* Java
* NetBeans
* PostgreSQL
* PgAdmin4
* Git & GitHub

## Configuración inicial del proyecto
1. **Crear una carpeta para el proyecto**

Crear una carpeta en una ubicación fácil de encontrar.

Ejemplo:
```
C:\Projects\
```
o
```
Documents\NetBeansProjects\
```

2. **Verificar instalación de Java**

Abrir uno de estos:

    Visual Studio Code
    PowerShell
    CMD

y ejecutar:

    java --version

Si aparece error:

>Instalar Java:
>https://www.java.com/download

Si muestra una versión:
>Java ya está instalado correctamente.

3. **Verificar instalación de NetBeans**

Si NO está instalado:

Descargar Apache NetBeans:
>https://netbeans.apache.org/front/main/download/

4. **Verificar instalación de PostgreSQL y PgAdmin4**

Debe estar instalado:

* PostgreSQL
* PgAdmin4

Descarga oficial:
>https://www.postgresql.org/download/

5. **Verificar instalación de Git**

Abrir una terminal y ejecutar:

    git --version
Si aparece error:
> Instalar Git:
>https://git-scm.com/install/

6. **Configurar GitHub en Git (solo primera vez)**

Verificar configuración actual:

    git config --global user.name
    git config --global user.email

Si no aparecen datos, configurar:

    git config --global user.name "TuNombre"
    git config --global user.email "tuemail@gmail.com"

## EMPEZAR CON EL PROYECTO 
1. **Clonar el repositorio**

Ubicarse dentro de la carpeta donde se guardará el proyecto y ejecutar:
    git clone https://github.com/AntonellaAB/product-review-system.git

2. **Verificar que se descargó correctamente**

Debe aparecer la carpeta:

    product-review-system

con:

    dao/
    db/
    model/
    ui/
    script.sql
    etc.

**Abrir el proyecto en NetBeans**
* Abrir NetBeans
* Ir a:
    * File > Open Project
* Buscar la carpeta del proyecto
* Seleccionar la carpeta que tiene el ícono de la taza de café ☕
* Click en:
    * Open Project


**Crear la base de datos**
* Abrir PgAdmin4
* Crear una nueva base de datos
* Ejecutar el archivo:
    * script.sql

*para crear las tablas.*

**Configurar conexión en NetBeans**

* Abrir:

    * db/conexionDB.java

* y completar:

```
private static final String URL =
"jdbc:postgresql://localhost:5432/product_review_bd";

private static final String USER = "TU_USUARIO";
private static final String PASSWORD = "TU_PASSWORD";
```
Usar SUS propias credenciales de PostgreSQL.

## Importante

Los compañeros que solo trabajen en UI/frontend NO necesitan configurar PostgreSQL si no van a probar funcionalidades de base de datos.

Pueden enfocarse únicamente en:

* interfaces
* diseño visual
* navegación
* componentes Swing

## Flujo de trabajo recomendado
**Antes de comenzar**

Siempre actualizar el proyecto:

    git pull origin main


**Guardar cambios**

Cuando terminen de trabajar:

    git add .

Verificar cambios:

    git status

Crear commit:

    git commit -m "descripcion breve de cambios"

Subir cambios:

    git push origin main
>Si aparece error al hacer push

>Ejecutar:
>```git pull origin main```

>y luego volver a hacer:

> ```git push origin main```

## Reglas del proyecto
* Cada integrante trabaja únicamente en su carpeta/clase asignada.
* No modificar archivos de otros integrantes sin avisar.
* Simpre hacer git pull antes de empezar a trabajar




**Pull Requests:**
Antes de unir cambios a la rama principal, se debe abrir un PR para revisión.


**Ignorados:**
No subas carpetas build/, dist/ o archivos privados de tu IDE.
El .gitignore ya está configurado para esto.

