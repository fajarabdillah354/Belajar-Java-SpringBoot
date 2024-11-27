package belajar.spring.boot.controller;


import belajar.spring.boot.entity.RajaongkirRequest;
import belajar.spring.boot.entity.RajaongkirResponse;
import belajar.spring.boot.service.RajaongkirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping("/api/ongkir")
public class RajaongkirController {

    @Autowired
    private RajaongkirService rajaongkirService;

    @PostMapping("/cost")
    public RajaongkirResponse getCost(@RequestBody RajaongkirRequest request) {
        return rajaongkirService.getCost(request);
    }


}
