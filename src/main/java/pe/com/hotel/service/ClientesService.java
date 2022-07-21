package pe.com.hotel.service;

import pe.com.hotel.entity.Clientes;
import java.util.List;
import java.util.Optional;

public interface ClientesService {
    //Mostrar todo
    List<Clientes> findAll();
    //Mostrar todos los habilitados
    List<Clientes> findAllCustom();
    //buscar pòr nombre
    List<Clientes> findbyName();
    //buscar pòr codigo
    Optional<Clientes> findById(Long id);
    //agregar
    Clientes add(Clientes c);
    //actualizar
    Clientes update(Clientes c);
    //eliminar
    Clientes delete(Clientes c);
}
