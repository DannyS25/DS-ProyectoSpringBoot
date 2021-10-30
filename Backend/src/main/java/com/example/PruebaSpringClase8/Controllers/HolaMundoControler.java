package com.example.PruebaSpringClase8.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class HolaMundoControler {

        @GetMapping("/hola")
        public String saludar(){

            return "Hola grupo";

        }

        @GetMapping("/hello")
        public String saludar2(){

            return "Hello Group";

        }
}
