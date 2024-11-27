package belajar.spring.boot.controller;


import belajar.spring.boot.dto.ResponseData;
import belajar.spring.boot.entity.Brand;
import belajar.spring.boot.service.BrandService;
import org.modelmapper.internal.Errors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandController {


    @Autowired
    private BrandService brandService;

    @GetMapping
    public List<Brand> findAllBrand(){
        return brandService.findAllBrand();
    }



    @PostMapping("/create")
    public Brand create(@RequestBody Brand brand){
        return brandService.create(brand);
    }




}
