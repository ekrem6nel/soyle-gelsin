package com.soylegelsin.endpoint;

import com.soylegelsin.model.Product;
import com.soylegelsin.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by ekrema on 1/7/17.
 */

@RestController
public class ListProductsEndpoint {

    @Autowired
    ProductRepository productRepository;

    @PostConstruct
    public void init() {
        productRepository.save(new Product("1", "Absolut Vodka", 70L));
        productRepository.save(new Product("2", "Jack Daniels Whiskey", 160L));
        productRepository.save(new Product("3", "Guarana Mojito", 4L));
    }

    @RequestMapping(value = "/api/getProducts")
    public List<Product> getProducts() {
        return productRepository.findAll();
    }
}
