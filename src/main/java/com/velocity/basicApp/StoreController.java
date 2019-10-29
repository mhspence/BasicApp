package com.velocity.basicApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("store")
public class StoreController {

    @GetMapping(path="products")
    public String getProducts() {
        return "some products";
    }

    @GetMapping(path="customers")
    public String getCustomers() {
        return "some customers";
    }

}
