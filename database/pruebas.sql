--=======
--Para crear un nuevo usuario y passwd
--=======

-- Create a dedicated user just for this project team
CREATE USER review_app_user WITH PASSWORD 'password';

-- Give this new user ownership of your project database
ALTER DATABASE product_review_db OWNER TO review_app_user;



GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA public TO review_app_user;
GRANT ALL PRIVILEGES ON ALL SEQUENCES IN SCHEMA public TO review_app_user;

SELECT * FROM users;
SELECT * FROM products;
