DROP TABLE IF EXISTS reviews CASCADE;
DROP TABLE IF EXISTS products CASCADE;
DROP TABLE IF EXISTS users CASCADE;
DROP TABLE IF EXISTS categories CASCADE;

--Primero va categoria
CREATE TABLE categories (
	id_category SERIAL PRIMARY KEY,
	name VARCHAR(100) NOT NULL,
	description TEXT

);


-- PRODUCTOS / cada producto tiene una catogoria
CREATE TABLE products (
    id_product SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description TEXT,
    image_url VARCHAR(255),
    brand VARCHAR(100),
	id_category INTEGER REFERENCES categories(id_category) ON DELETE SET NULL
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
	score INTEGER NOT NULL CHECK (score BETWEEN 1 AND 5), --CHECK se usa para controlar que sea el rengo declarado
	review_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP, 
	id_user INTEGER NOT NULL REFERENCES users(id_user),
	id_product INTEGER NOT NULL REFERENCES products(id_product),
	UNIQUE(id_user, id_product)
);


ALTER TABLE products ADD COLUMN price NUMERIC(12,2);