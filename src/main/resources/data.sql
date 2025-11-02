-- Insert users
INSERT INTO users (id, name, email, password, role) VALUES
(1, 'Admin User', 'admin@example.com', 'admin123', 'ADMIN'),
(2, 'John Doe', 'john@example.com', 'password', 'CUSTOMER'),
(3, 'Jane Smith', 'jane@example.com', 'password', 'CUSTOMER');

-- Insert stores
INSERT INTO stores (id, store_name, location, contact_number) VALUES
(1, 'Downtown Pizza', 'Downtown City', '9876543210'),
(2, 'Uptown Pizza', 'Uptown Area', '9123456780');

-- Insert food items
INSERT INTO food_items (id, name, description, price, store_id) VALUES
(1, 'Margherita Pizza', 'Classic cheese and tomato pizza', 299.00, 1),
(2, 'Pepperoni Pizza', 'Spicy pepperoni with cheese', 399.00, 1),
(3, 'Veggie Supreme', 'Loaded with veggies', 349.00, 2),
(4, 'BBQ Chicken Pizza', 'Smoky BBQ chicken and cheese', 449.00, 2);

-- Insert orders
INSERT INTO orders (id, order_date, status, user_id) VALUES
(1, NOW(), 'PLACED', 2),
(2, NOW(), 'DELIVERED', 3);

-- Insert order items
INSERT INTO order_items (id, quantity, total_price, order_id, food_item_id) VALUES
(1, 2, 598.00, 1, 1),
(2, 1, 399.00, 1, 2),
(3, 1, 349.00, 2, 3);
