package belajar.spring.boot.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "brands")
public class Brand {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name_brands")
    private String nameBrand;


    private String description;


    @OneToMany(mappedBy = "brands", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Product> products;

}
