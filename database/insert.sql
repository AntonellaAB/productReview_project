-- CATEGORIES
INSERT INTO categories(name, description) VALUES
('Electrónica', 'Dispositivos y gadgets electrónicos.'),
('Libros', 'Novelas, técnicos y libros infantiles.'),
('Ropa', 'Prendas de vestir para hombre y mujer.'),
('Hogar', 'Artículos para el hogar y decoración.'),
('Belleza', 'Productos de cuidado personal y cosmética');

-- PRODUCTS (usa subconsultas para referenciar categoría)
INSERT INTO products(name, description, image_url, brand, id_category, price) VALUES
('Auriculares inalámbricos', 'Auriculares Bluetooth con cancelación de ruido.', 'https://example.com/img/auriculares.jpg', 'SoundMax', (SELECT id_category FROM categories WHERE name='Electrónica'), 79.99),
('Smartphone X200', 'Teléfono con pantalla OLED y 128GB.', 'https://example.com/img/phone.jpg', 'PhoneCorp', (SELECT id_category FROM categories WHERE name='Electrónica'), 499.00),
('Cálculo Avanzado', 'Libro de matemáticas para universitarios.', 'https://example.com/img/libro.jpg', 'EduPress', (SELECT id_category FROM categories WHERE name='Libros'), 39.50),
('Camiseta básica', 'Camiseta 100% algodón.', 'https://example.com/img/camiseta.jpg', 'BasicWear', (SELECT id_category FROM categories WHERE name='Ropa'), 12.00),
('Juego de sábanas', 'Sábanas de algodón 300 hilos, 2 plazas.', 'https://example.com/img/sabanas.jpg', 'HomeSoft', (SELECT id_category FROM categories WHERE name='Hogar'), 59.90),
('Crema facial hidratante', 'Hidratación diaria para todo tipo de piel.', 'https://example.com/img/crema.jpg', 'BeautyLab', (SELECT id_category FROM categories WHERE name='Belleza'), 24.75),
('Novela de misterio', 'Thriller psicológico de autor contemporáneo.', 'https://example.com/img/novela.jpg', 'LitHouse', (SELECT id_category FROM categories WHERE name='Libros'), 18.00),
('Chaqueta impermeable', 'Chaqueta ligera, resistente al agua.', 'https://example.com/img/chaqueta.jpg', 'OutdoorPro', (SELECT id_category FROM categories WHERE name='Ropa'), 89.90);

-- USERS
/*
INSERT INTO users(username, email, password) VALUES
('ana', 'ana@example.com', 'passAna123'),
('juan', 'juan@example.com', 'passJuan123'),
('maria', 'maria@example.com', 'passMaria123'),
('carlos', 'carlos@example.com', 'passCarlos123'),
('laura', 'laura@example.com', 'passLaura123');

-- REVIEWS (cada usuario reseña productos distintos; score entre 1 y 5)
INSERT INTO reviews(comment, score, id_user, id_product) VALUES
('Muy buenos auriculares, excelente sonido.', 5, (SELECT id_user FROM users WHERE username='ana'), (SELECT id_product FROM products WHERE name='Auriculares inalámbricos')),
('Buena relación calidad-precio.', 4, (SELECT id_user FROM users WHERE username='juan'), (SELECT id_product FROM products WHERE name='Smartphone X200')),
('Libro claro y bien explicado.', 5, (SELECT id_user FROM users WHERE username='maria'), (SELECT id_product FROM products WHERE name='Cálculo Avanzado')),
('La camiseta se ve económica pero cómoda.', 3, (SELECT id_user FROM users WHERE username='carlos'), (SELECT id_product FROM products WHERE name='Camiseta básica')),
('Sábanas suaves y buen tamaño.', 4, (SELECT id_user FROM users WHERE username='laura'), (SELECT id_product FROM products WHERE name='Juego de sábanas')),
('Crema fantástica para piel seca.', 5, (SELECT id_user FROM users WHERE username='ana'), (SELECT id_product FROM products WHERE name='Crema facial hidratante')),
('Novela atrapante, la leí en dos noches.', 5, (SELECT id_user FROM users WHERE username='juan'), (SELECT id_product FROM products WHERE name='Novela de misterio')),
('La chaqueta es impermeable pero talla pequeña.', 4, (SELECT id_user FROM users WHERE username='maria'), (SELECT id_product FROM products WHERE name='Chaqueta impermeable'));
*/
-- Asegurar secuencias correctas (PostgreSQL)
SELECT setval(pg_get_serial_sequence('categories','id_category'), COALESCE((SELECT MAX(id_category) FROM categories),0) );
SELECT setval(pg_get_serial_sequence('products','id_product'), COALESCE((SELECT MAX(id_product) FROM products),0) );
--SELECT setval(pg_get_serial_sequence('users','id_user'), COALESCE((SELECT MAX(id_user) FROM users),0) );
--SELECT setval(pg_get_serial_sequence('reviews','id_review'), COALESCE((SELECT MAX(id_review) FROM reviews),0) );
