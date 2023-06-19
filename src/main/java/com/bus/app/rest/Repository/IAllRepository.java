package com.bus.app.rest.Repository;


import com.bus.app.rest.Model.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *  TEST API app
 *
 *  Gestion de tareas personal // Personal Task management
 *
 * @version 1.0.0 2023-06-18
 * @author Milton Figueredo <gratno@gmail.com>
 * @since 1.0.0
 */

public interface IAllRepository extends JpaRepository<TaskModel, Long> {
}
