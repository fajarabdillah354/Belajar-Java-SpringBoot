package belajar.spring.boot.service;

import belajar.spring.boot.dto.ResponseData;
import belajar.spring.boot.entity.Brand;
import belajar.spring.boot.entity.Product;
import belajar.spring.boot.repository.ProductRepository;
import org.modelmapper.internal.Errors;
import org.modelmapper.spi.ErrorMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {


    @Autowired
    private ProductRepository productRepository;


    //GET findAllBrand
    public List<Product> findAllProduct(){
        return productRepository.findAll();
    }



    //POST createBrand
    public ResponseEntity<ResponseData<Product>> create(Product product, Errors errors){
        ResponseData<Product> responseData = new ResponseData<>();
        if (errors.hasErrors()){
            for (ErrorMessage errorMessage : errors.getMessages()){
                responseData.getMessages().add(errorMessage.getMessage());
            }
            responseData.setStatus(false);
            responseData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
        responseData.setStatus(true);
        responseData.setPayload(productRepository.save(product));
        return ResponseEntity.ok(responseData);
    }




    //PUT updateBrand
    public ResponseEntity<Product> update(Integer id, Product product){
        Optional<Product> optional = productRepository.findById(id);
        if (optional.isPresent()){
            Product objProduct = new Product();
            objProduct.setProductName(product.getProductName());
            objProduct.setPrice(product.getPrice());
            objProduct.setQuantity(product.getQuantity());
            return ResponseEntity.ok(productRepository.save(objProduct));
        }else {
            return ResponseEntity.notFound().build();
        }
    }



}
