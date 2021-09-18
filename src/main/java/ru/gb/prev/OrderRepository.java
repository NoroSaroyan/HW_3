package ru.gb.prev;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class OrderRepository {
    private List<Order> orders = new ArrayList<>();
    private ProductRepository productRepository;


    public OrderRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
        orders.add(new Order(1, LocalDate.now(), 888.77f, Collections.emptyList(), null));

    }

    public Optional<Order> findById(int id) {
        return orders.stream().filter(o -> o.getId() == id).findFirst();
    }

    public List<Order> findAll() {
        return orders;
    }

    public void add(Order order) {
        order.setProducts(productsFromList(order.getProductsFromForm(), productRepository));
        order.setCost(countCost(order.getProducts()));
        order.setDate(LocalDate.now());
        order.setProductsList(formProductList(order.getProducts()));
        this.orders.add(order);
    }


    @Override
    public String toString() {
        return "ProductRepository{" +
                "products=" + orders +
                '}';
    }

    public float countCost(List<Product> products) {
        float cost = 0;
        for (Product p : products) {
            cost += p.getPrice();
        }
        return cost;
    }

    public List<Product> productsFromList(String list, ProductRepository pr) {
        List<Product> products = new ArrayList<>();

        String[] stringArr = list.split("\\s+");
        for (String s : stringArr) {
            pr.findById(Integer.parseInt(s)).ifPresent(products::add);
        }
        return products;
    }

    public String formProductList(List<Product> products) {
        StringBuilder sb = new StringBuilder();
        for (Product p : products) {
            sb.append("ID: ").append(p.getId()).append(", ");
            sb.append("NAME: ").append(p.getName()).append(", ");
            sb.append("PRICE: ").append(p.getPrice()).append("; ");
        }
        return sb.toString();
    }

}