package com.bus.app.rest.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *  TEST API app
 *
 *  Gestion de tareas personal // Personal Task management
 *
 * @version 1.0.0 2023-06-18
 * @author Milton Figueredo <gratno@gmail.com>
 * @since 1.0.0
 */

//Etiqueta de entrada para la API
@RestController
public class AllController {


    @GetMapping(value = "/")
    public String testApi() {
        return  "HOLA TEST!!!";
    }
}
