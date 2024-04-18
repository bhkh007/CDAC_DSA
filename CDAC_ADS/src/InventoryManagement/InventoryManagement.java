package InventoryManagement;

import java.util.HashMap;

public class InventoryManagement {
    public static HashMap<String, Product> inventory = new HashMap<>();

    public static void addProduct(String name, int quantity, double price, String category) {
        Product product = new Product(name, quantity, price, category);
        inventory.put(name, product);
    }

    public void removeProduct(String name) throws Exception {
        if (!inventory.containsKey(name)) {
            throw new Exception("Product not found");
        }
        inventory.remove(name);
    }

    // Inner class representing a product
    public static class Product {
        public String name;
        public int quantity;
        public double price;
        public String category;

        Product(String name, int quantity, double price, String category) {
            this.name = name;
            this.quantity = quantity;
            this.price = price;
            this.category = category;
        }
    }
}

