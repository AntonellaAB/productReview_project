
--Primero va categoria
CREATE TABLE category (
	id_category SERIAL PRIMARY KEY,
	name VARCHAR(100) NOT NULL,
	description TEXT

);


-- PRODUCTOS / cada producto tiene una catogoria
CREATE TABLE products (
    id_product SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description TEXT,
    img_url VARCHAR(255), ---BUSCAR CUAL ES MEJOR PARA FOTOS
    brand VARCHAR(100),
	id_category INTEGER REFERENCES category(id_category) ON DELETE SET NULL
);


CREATE TABLE users (
    id_user SERIAL PRIMARY KEY,
    username VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
	signup_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    
);

--REVIEWS
CREATE TABLE reviews (
	id_review SERIAL PRIMARY KEY,
	comment TEXT, 
	score INTEGER CHECK (score BETWEEN 1 AND 5), --CHECK se usa para controlar que sea el rengo declarado
	review_date TIMESTAMP CURRENT_TIMESTAMP, --buscar como poner fecha actual
	id_users INTEGER REFERENCES users(id_users)	ON DELETE CASCADE,
	id_product INTEGER REFERENCES proi
)

