package belajar.spring.boot.controller;


import belajar.spring.boot.dto.ResponseData;
import belajar.spring.boot.entity.Brand;
import belajar.spring.boot.entity.Product;
import belajar.spring.boot.service.ProductService;
import org.modelmapper.internal.Errors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {


    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> findAllBrand(){
        return productService.findAllProduct();
    }



    @PostMapping("/create")
    public ResponseEntity<ResponseData<Product>> create(@RequestBody Product product, Errors errors){
        return productService.create(product, errors);
    }

}
