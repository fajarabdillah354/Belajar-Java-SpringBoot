package belajar.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller adalah turunan dari annotation component sehingga akan dianggep sebagai bean oleh Spring Container
@Controller
public class HomeController {

    //kita bisa membuat banyak method sesuai dengan kebutuhan


    @GetMapping("/home")
    public String getHome(Model model){
        //untuk menggunakan thymeleaf pada java, kita bisa tambahkan <html xmlns:th="http://www.thymeleaf.org"> pada file htmlnya
        model.addAttribute("name","fajar");
        return "home";//akan mengembalikan home yang ada di templates home.html
    }

    @GetMapping("/list")
    public String getList(Model model){
        return "list";
    }




}
