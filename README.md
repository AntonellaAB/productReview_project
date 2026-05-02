# Product Review System 
**Proyecto de Modelo de Base de Datos y POO**

Este es el sistema centralizado para la gestión y revisión de productos, desarrollado en Java con persistencia en PostgreSQL.

---

## Integrantes y Roles

- **Backend:** Antonella, Fabrizio y Mauri
- **Frontend:** Nayeli y Nico
- **Base de Datos:** Ezequiel e Ivo
- **Documentación:** Jorge (y todos)

---

## Configuración del Entorno

### 1. Clonar el Proyecto

Para descargar el proyecto, abre una terminal en tu carpeta de proyectos y ejecuta:

```bash
git clone https://github.com/AntonellaAB/product-review-system.git
```

### 2. Base de Datos (PostgreSQL) 

Abre pgAdmin


Crea una nueva base de datos llamada product_review_db.


Busca en el repositorio la carpeta /database y abre el archivo script.sql.


Ejecuta el script para crear las tablas y cargar los datos iniciales.


Importante:
Asegúrate de que las credenciales en tu código local (db/Conexion.java) coincidan con tu usuario y contraseña de Postgres.

### 3. Ejecución en NetBeans 


Abre NetBeans IDE.


Ve a File > Open Project.


Selecciona la carpeta donde clonaste el repositorio.


Haz clic derecho en el proyecto > Clean and Build.


Dale al botón Run.



## Reglas del Repositorio (Workflow)
Para evitar conflictos en el código, seguiremos estas normas:


## No subir cambios a main:
Crea una rama para tu tarea:
git checkout -b feat/nombre-tarea


**Pull Requests:**
Antes de unir cambios a la rama principal, se debe abrir un PR para revisión.


**Ignorados:**
No subas carpetas build/, dist/ o archivos privados de tu IDE.
El .gitignore ya está configurado para esto.

