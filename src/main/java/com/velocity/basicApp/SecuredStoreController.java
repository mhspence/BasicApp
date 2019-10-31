package com.velocity.basicApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("secure-store")
public class SecuredStoreController {

    @GetMapping(path="products")
    public String getProducts() {
        return "some secured products";
    }

    @GetMapping(path="customers")
    public String getCustomers() {
        return "some secured customers";
    }

}
