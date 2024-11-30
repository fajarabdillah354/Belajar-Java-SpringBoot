package belajar.spring.boot.service;


import belajar.spring.boot.dto.ResponseData;
import belajar.spring.boot.entity.Brand;
import belajar.spring.boot.repository.BrandRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.internal.Errors;
import org.modelmapper.spi.ErrorMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrandService {


    @Autowired
    private BrandRepository brandRepository;


    //GET findAllBrand
    public List<Brand> findAllBrand(){
        return brandRepository.findAll();
    }



    //POST createBrand
    public Brand create(Brand brand){
        return brandRepository.save(brand);
    }




    //PUT updateBrand
    public ResponseEntity<Brand> update(Integer id, Brand brand){
        Optional<Brand> optional = brandRepository.findById(id);
        if (optional.isPresent()){
            Brand objBrand = new Brand();
            objBrand.setNameBrand(brand.getNameBrand());
            objBrand.setDescription(brand.getDescription());
            return ResponseEntity.ok(brandRepository.save(objBrand));
        }else {
            return ResponseEntity.notFound().build();
        }
    }





}
