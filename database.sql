CREATE DATABASE osahaneat_app;
USE osahaneat_app;

CREATE TABLE roles(
	id INT PRIMARY KEY,
	role_name VARCHAR(255),
    description VARCHAR(255)
);

CREATE TABLE users(
	id INT PRIMARY KEY,
    email VARCHAR(255), 
    password VARCHAR(255),
    fullname VARCHAR(255),
    address VARCHAR(255),
    role_id INT,
    FOREIGN KEY (role_id) REFERENCES roles(id)
);

CREATE TABLE restaurant(
	id INT PRIMARY KEY,
    name VARCHAR(255),
    address VARCHAR(255),
    description VARCHAR(255),
    rating VARCHAR(255),
    content VARCHAR(255)
);

CREATE TABLE rating_restaurant(
	id INT PRIMARY KEY,
    user_id INT,
	rest_id INT,
    star INT,
    comment VARCHAR(255),
    FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (rest_id) REFERENCES restaurant(id)
);

CREATE TABLE category(
	id INT PRIMARY KEY,
    name VARCHAR(255),
    description VARCHAR(255)
);

CREATE TABLE category_restaurant(
	id INT PRIMARY KEY,
    cate_id INT,
    rest_id INT,
    
    FOREIGN KEY (cate_id) REFERENCES category(id),
    FOREIGN KEY (rest_id) REFERENCES restaurant(id)
);

CREATE TABLE coupon(
	id INT PRIMARY KEY,
    code VARCHAR(255),
    description VARCHAR(255),
    discount DOUBLE,
    cate_rest_id INT,
    
    FOREIGN KEY (cate_rest_id) REFERENCES category_restaurant(id)
);

CREATE TABLE orders(
	id INT PRIMARY KEY,
	total_price DOUBLE,
    user_id INT,
    time_order DATE,
    status VARCHAR(30),
    FOREIGN KEY (user_id) REFERENCES users(id)
);

CREATE TABLE food(
	id INT PRIMARY KEY,
    name VARCHAR(255),
    description VARCHAR(255),
    price DOUBLE,
    cate_rest_id INT,
    FOREIGN KEY (cate_rest_id) REFERENCES category_restaurant(id)
);

CREATE TABLE order_item(
	order_id INT,
    food_id INT,
	amount INT,
    price DOUBLE,
    coupon_id INT,
    PRIMARY KEY (order_id, food_id),
    
    FOREIGN KEY (coupon_id) REFERENCES coupon(id),
    FOREIGN KEY (order_id) REFERENCES orders(id),
    FOREIGN KEY (food_id) REFERENCES food(id)
);

CREATE TABLE rating_food(
	id INT PRIMARY KEY,
    user_id INT,
    food_id INT,
    star INT,
    comment VARCHAR(255),
    FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (food_id) REFERENCES food(id)
);

CREATE TABLE rating_orders(
	id INT PRIMARY KEY,
    user_id INT,
	order_id INT,
    star INT,
    comment VARCHAR(255),
    
    FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (order_id) REFERENCES orders(id)
);