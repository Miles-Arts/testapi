package com.bus.app.rest.Model;


import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;
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

@Entity
@RestController
public class TaskModel {

        @Id
        private Long id;
        private String titulo;
        private String descripcion;

}
