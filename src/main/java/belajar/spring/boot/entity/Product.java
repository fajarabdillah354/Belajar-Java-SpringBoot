package belajar.spring.boot.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "products_name")
    private String productName;

    private Integer quantity;


    private Integer price;

    @ManyToOne()
    @JoinColumn(name = "product_brands")
    @JsonBackReference
    private Brand brands;

    @ManyToOne()
    @JoinColumn(name = "product_customers")
    @JsonBackReference
    private Customer customer;




}
