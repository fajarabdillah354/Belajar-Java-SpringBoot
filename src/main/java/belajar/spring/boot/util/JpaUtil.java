package belajar.spring.boot.util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil {


    private EntityManagerFactory entityManagerFactory = null;


    public EntityManagerFactory getEntityManagerFactory() {
        if (entityManagerFactory == null){
            entityManagerFactory = Persistence.createEntityManagerFactory("spring-jpa");
        }

        return entityManagerFactory;
    }
}
