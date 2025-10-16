<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>E-Commerce Home</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            background-color: #f5f5f5;
        }

        /* Header */
        header {
            background-color: #4CAF50;
            color: white;
            padding: 20px 0;
            text-align: center;
        }

        header h1 {
            margin: 0;
            font-size: 28px;
        }

        /* Navbar */
        nav {
            background-color: #333;
            display: flex;
            justify-content: center;
        }

        nav a {
            color: white;
            text-decoration: none;
            padding: 14px 20px;
            display: block;
        }

        nav a:hover {
            background-color: #575757;
        }

        /* Product Grid */
        .product-container {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
            gap: 20px;
            padding: 30px;
            max-width: 1200px;
            margin: auto;
        }

        .product-card {
            background-color: white;
            border-radius: 10px;
            box-shadow: 0 2px 6px rgba(0, 0, 0, 0.1);
            padding: 15px;
            text-align: center;
            transition: transform 0.2s ease, box-shadow 0.2s ease;
        }

        .product-card:hover {
            transform: translateY(-5px);
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.15);
        }

        .product-card img {
            width: 100%;
            height: 200px;
            object-fit: cover;
            border-radius: 8px;
        }

        .product-card h3 {
            color: #333;
            margin: 10px 0 5px;
        }

        .product-card p {
            color: #777;
            font-size: 14px;
        }

        .price {
            color: #4CAF50;
            font-weight: bold;
            margin: 10px 0;
        }

        .buy-btn {
            background-color: #4CAF50;
            color: white;
            border: none;
            padding: 10px 16px;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        .buy-btn:hover {
            background-color: #45a049;
        }

        /* Footer */
        footer {
            background-color: #333;
            color: white;
            text-align: center;
            padding: 15px 0;
            position: relative;
            bottom: 0;
            width: 100%;
            margin-top: 30px;
        }
    </style>
</head>
<body>

    <header>
        <h1>ShopEase - Your Online Store</h1>
    </header>

    <nav>
        <a href="home.jsp">Home</a>
        <a href="products.jsp">Products</a>
        <a href="cart.jsp">Cart</a>
        <a href="orders.jsp">Orders</a>
        <a href="logout">Logout</a>
    </nav>

    <div class="product-container">
        <div class="product-card">
            <img src="https://via.placeholder.com/250x200" alt="Product 1">
            <h3>Wireless Headphones</h3>
            <p>High-quality sound and comfort fit.</p>
            <div class="price">$49.99</div>
            <button class="buy-btn">Add to Cart</button>
        </div>

        <div class="product-card">
            <img src="https://via.placeholder.com/250x200" alt="Product 2">
            <h3>Smart Watch</h3>
            <p>Track your fitness and notifications easily.</p>
            <div class="price">$79.99</div>
            <button class="buy-btn">Add to Cart</button>
        </div>

        <div class="product-card">
            <img src="https://via.placeholder.com/250x200" alt="Product 3">
            <h3>Bluetooth Speaker</h3>
            <p>Portable and powerful music experience.</p>
            <div class="price">$39.99</div>
            <button class="buy-btn">Add to Cart</button>
        </div>

        <div class="product-card">
            <img src="https://via.placeholder.com/250x200" alt="Product 4">
            <h3>Gaming Mouse</h3>
            <p>Precision and comfort for every click.</p>
            <div class="price">$29.99</div>
            <button class="buy-btn">Add to Cart</button>
        </div>
    </div>

    <footer>
        &copy; 2025 ShopEase | All Rights Reserved
    </footer>

</body>
</html>
