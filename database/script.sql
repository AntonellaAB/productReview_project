CREATE TABLE productos (
    id_producto VARCHAR(200),
    nombre TEXT,
    precio NUMERIC(50,0),
    img_producto VARCHAR(200),
    enlace VARCHAR(200),
    resena_recibidas INTEGER,
    descripcion TEXT,
    id_proveedor VARCHAR(200)
);


CREATE TABLE proveedores (
    id_proveedor VARCHAR(200),
    empresa VARCHAR(50),
    nombre TEXT,
    usuario_proveedor VARCHAR(50),
    email VARCHAR(50),
    contrasena VARCHAR(200),
    cantidad_producto INTEGER,
    enlace_empresa VARCHAR(200),
    productos_listados VARCHAR(1000)[], -- Este es un array de strings
    fk_productos VARCHAR(200)
);



CREATE TABLE tokens (
    id_tokens VARCHAR(200),
    token VARCHAR(200),
    plataforma TEXT
);


CREATE TABLE usuarios (
    id_usuario INTEGER,
    nombre VARCHAR(200),
    email VARCHAR(100),
    contrasena VARCHAR(200),
    cantidad_resena INTEGER,
    fecha_creacion DATE,
    fk_productos VARCHAR(200)
);
