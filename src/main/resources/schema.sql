CREATE TABLE IF NOT EXISTS users (
    user_id SERIAL PRIMARY KEY, 
    user_name varchar(255), 
    first_name varchar(255), 
    email varchar(255)
);