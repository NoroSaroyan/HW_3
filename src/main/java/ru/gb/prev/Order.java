package ru.gb.prev;


import java.time.LocalDate;
import java.util.List;

public class Order {
    private int id;
    private LocalDate date;
    private float cost;
    private List<Product> products;
    private String productsFromForm;
    private String productsList;


    public Order() {

    }

    public Order(int id, LocalDate date, float cost, List<Product> products, String productsFromForm) {
        this.id = id;
        this.date = date;
        this.cost = cost;
        this.products = products;
        this.productsFromForm = productsFromForm;

    }


    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public float getCost() {
        return cost;
    }



    public List<Product> getProducts() {
        return products;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + date +
                ", cost=" + cost +
                ", products=" + products +
                '}';
    }

    public String getProductsFromForm() {
        return productsFromForm;
    }

    public void setProductsFromForm(String productsFromForm) {
        this.productsFromForm = productsFromForm;
    }

    public String getProductsList() {
        return productsList;
    }

    public void setProductsList(String productsList) {
        this.productsList = productsList;
    }
}
