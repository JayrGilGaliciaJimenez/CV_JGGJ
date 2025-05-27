package mx.edu.utez.cv_jggj.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@CrossOrigin("*")
public class User1Controller {
    @GetMapping("/")
    public String getMessage() {
        return "Hola desde el controlador 1";
    }
}
