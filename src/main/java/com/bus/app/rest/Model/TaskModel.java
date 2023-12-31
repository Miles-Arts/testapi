package com.bus.app.rest.Model;


import jakarta.persistence.*;

/**
 *  TEST API app
 *
 *  Gestion de tareas personal // Personal Task management
 *
 * @version 1.0.0 2023-06-18
 * @author Milton Figueredo <gratno@gmail.com>
 * @since 1.0.0
 */

@Entity                 //TaskModel es la entidad ENTITY   task_model
@Table(schema = "test")
public class TaskModel {

        //Entidad y Componentes de entidad
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column
        private String titulo;

        @Column
        private String descripcion;

        public TaskModel() {
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getTitulo() {
                return titulo;
        }

        public void setTitulo(String titulo) {
                this.titulo = titulo;
        }

        public String getDescripcion() {
                return descripcion;
        }

        public void setDescripcion(String descripcion) {
                this.descripcion = descripcion;
        }
}
