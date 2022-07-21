package pe.com.hotel.service;

import pe.com.hotel.entity.Roles;
import java.util.List;
import java.util.Optional;

public interface RolService {
    //Mostrar todo
    List<Roles> findAll();
    //Mostrar todos los habilitados
    List<Roles> findAllCustom();
    //buscar pòr nombre
    List<Roles> findbyName();
    //buscar pòr codigo
    Optional<Roles> findById(Long id);
    //agregar
    Roles add(Roles ro);
    //actualizar
    Roles update(Roles ro);
    //eliminar
    Roles delete(Roles ro);
}
