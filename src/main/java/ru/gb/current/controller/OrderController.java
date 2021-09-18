package ru.gb.current.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.gb.prev.Order;
import ru.gb.prev.OrderRepository;
import ru.gb.prev.ProductRepository;


@Controller
public class OrderController {

    private final OrderRepository repository;
    private final ProductRepository productRepository;

    public OrderController(OrderRepository repository, ProductRepository productRepository) {
        this.repository = repository;
        this.productRepository = productRepository;
    }

    @RequestMapping(value = "/orders/add", method = RequestMethod.POST)
    public String add(Order order) {
        repository.add(order);
        return "orders";
    }

    @RequestMapping(value = "/orders/add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("order", new Order());
        model.addAttribute("products", productRepository.findAll());
        return "orders-add";
    }

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public String findAll(Model model) {
        model.addAttribute("orders", repository.findAll());
        return "orders";
    }

}