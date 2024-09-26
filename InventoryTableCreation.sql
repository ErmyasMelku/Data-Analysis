-- Create table for inventory
CREATE TABLE inventory (
    product_id SERIAL PRIMARY KEY,
    product_name VARCHAR(100) NOT NULL,
    category VARCHAR(50),
    quantity INT,
    price DECIMAL(10, 2),
    supplier VARCHAR(100),
    last_updated DATE
);
