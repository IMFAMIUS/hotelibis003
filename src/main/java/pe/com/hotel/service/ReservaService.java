package pe.com.hotel.service;

import pe.com.hotel.entity.Reserva;
import java.util.List;
import java.util.Optional;

public interface ReservaService {
    //Mostrar todo
    List<Reserva> findAll();
    //Mostrar todos los habilitados
    List<Reserva> findAllCustom();
    //buscar pòr nombre
    List<Reserva> findbyName();
    //buscar pòr codigo
    Optional<Reserva> findById(Long id);
    //agregar
    Reserva add(Reserva re);
    //actualizar
    Reserva update(Reserva re);
    //eliminar
    Reserva delete(Reserva re);
}
