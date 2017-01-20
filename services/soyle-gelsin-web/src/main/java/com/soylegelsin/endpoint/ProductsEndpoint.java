package com.soylegelsin.endpoint;

import com.soylegelsin.model.Product;
import com.soylegelsin.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by ekrema on 1/7/17.
 */

@RestController
public class ListProductsEndpoint {

    @Autowired
    ProductRepository productRepository;

    @RequestMapping(value = "/api/getProducts", method = RequestMethod.GET)
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @RequestMapping(value = "/api/newProduct", method = RequestMethod.POST)
    public void newProduct(@RequestBody Product newProduct) {
        productRepository.save(newProduct);
    }

    @RequestMapping(value = "/api/deleteProduct/{id}", method = RequestMethod.DELETE)
    public void newProduct(@PathVariable String id) {
        productRepository.delete(id);
    }
}
