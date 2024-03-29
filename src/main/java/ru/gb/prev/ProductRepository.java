package ru.gb.prev;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductRepository {
    private List<Product> products = new ArrayList<>();


    public ProductRepository() {

        products.add(new Product(1, "Toys", 100.50F));
        products.add(new Product(2, "Spirits", 500.50F));
        products.add(new Product(3, "Bakery", 10.99F));
        products.add(new Product(4, "T-Shirts", 49.99F));
        products.add(new Product(5, "Ground meet", 19.99F));
    }

    public Optional<Product> findById(int id) {
        return products.stream().filter(p -> p.getId() == id).findFirst();
    }

    public List<Product> findAll() {
        return products;
    }

    public void add(Product product) {
        this.products.add(product);
    }


    @Override
    public String toString() {
        return "ProductRepository{" +
                "products=" + products +
                '}';
    }
}