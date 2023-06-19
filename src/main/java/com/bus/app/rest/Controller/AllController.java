package com.bus.app.rest.Controller;

import com.bus.app.rest.Model.TaskModel;
import com.bus.app.rest.Repository.IAllRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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

    @Autowired   //Inyección de dependencias  /Instaciar el IAllREspository dentro de la clase
    private IAllRepository iAllRepository;

//    public AllController(IAllRepository iAllRepository) {
//        this.iAllRepository = iAllRepository;
//    }

    @GetMapping(value = "/")  //Entrata principal de la web
    public String testApi() {
        return  "HOLA TEST!!!";
    }

    @GetMapping(value = "/tasks")
    public List<TaskModel> getTasks() {
        return iAllRepository.findAll();
    }

    @PostMapping(value = "savetasks")
    public String saveTasks(@RequestBody TaskModel taskModel) {
        iAllRepository.save(taskModel);
        return "Save Task!!!";
    }

}
