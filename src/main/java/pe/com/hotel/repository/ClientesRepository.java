package pe.com.hotel.repository;

import pe.com.hotel.entity.Clientes;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClientesRepository extends JpaRepository<Clientes, Long> {

    @Query("select cl from Clientes cl where cl.estado='1'")
    List<Clientes> findAllCustom();
    
    @Query("select cl from Clientes cl where upper(cl.Nombre) like upper(:Nombre) and cl.estado='1'")
    List<Clientes> findByName(@Param("Nombre") String Nombre);
}
