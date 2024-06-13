package com.example.demo.demo2.controller;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class ProductController {

    @GetMapping("/products")
    public String getProducts() {
        return "[{\"id\":1,\"name\":\"Notebook DELL\",\"description\":\"โน๊ตบุคเดล\",\"price\":0,\"instock\":10},{\"id\":2,\"name\":\"SAMSUNG Crystal UHD 4K\",\"description\":\"Smart TV TU7000\",\"price\":0,\"instock\":5},{\"id\":3,\"name\":\"HAIER Air Conditioning\",\"description\":\"14976 BTU, Inverter\",\"price\":0,\"instock\":2}]";
		
    }
    
    @GetMapping("/product/{id}")
    public String getProducts(@PathVariable int id) {
        
        return "{\"id\":1,\"name\":\"Notebook DELL\",\"description\":\"RAM: 4, CPU: Intel Core i7-10750H\",\"price\":0,\"instock\":10}";
			
    }

}

