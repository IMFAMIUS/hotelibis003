package pe.com.hotel.service;

import pe.com.hotel.entity.TipoHabitacion;
import java.util.List;
import java.util.Optional;

public interface TipoHabitacionService {
    //Mostrar todo
    List<TipoHabitacion> findAll();
    //Mostrar todos los habilitados
    List<TipoHabitacion> findAllCustom();
    //buscar pòr nombre
    List<TipoHabitacion> findbyName();
    //buscar pòr codigo
    Optional<TipoHabitacion> findById(Long id);
    //agregar
    TipoHabitacion add(TipoHabitacion th);
    //actualizar
    TipoHabitacion update(TipoHabitacion th);
    //eliminar
    TipoHabitacion delete(TipoHabitacion th);
}
