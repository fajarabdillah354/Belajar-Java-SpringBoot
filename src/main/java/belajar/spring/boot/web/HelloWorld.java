package belajar.spring.boot.web;

import belajar.spring.boot.service.GreetingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


//contoh RestAPI dengan menggunakan spring boot
@RestController
@Slf4j
public class HelloWorld {

    private GreetingService greetingService;




    //secara implisit kita sudah melakukan @AutoWired
    public HelloWorld(GreetingService greetingService) {
        super();
        this.greetingService = greetingService;
    }

    @GetMapping("/fajar")
    public String helloWorld(){
        log.info("success access api /fajar");
        String getText = greetingService.sayGreat();
        return "Hello Fajar Abdillah Ahmad, nice to meet you \n"+ getText;
    }


    @GetMapping("/api-2")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String helloTwo(){
        log.info("Success acces api TWO");
        return "HELLO THIS IS API TWO";
    }


    @PostMapping("/post")
    public String post(@RequestBody String message){
        return "Request accepted and message is : "+message;
    }


}
