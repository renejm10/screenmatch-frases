package com.renejm.PeliFrases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {
    @Autowired
    FraseService servicio;
    @GetMapping("/series/frases")
    public FraseDTO obtenerFraseRandom(){
        return servicio.obtenerFraseRandom();

    }

}
