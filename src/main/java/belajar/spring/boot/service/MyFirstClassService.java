package belajar.spring.boot.service;

import org.springframework.stereotype.Service;

//@Service adalah turunan dari @Component sehingga semua behavior yang ada di Component sama dengan service

@Service
public class MyFirstClassService {

    public String sayHello(){
        return "hello fajar abdillah ahmad";
    }


}
