package belajar.spring.boot.repository;

import belajar.spring.boot.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Integer> {



}
