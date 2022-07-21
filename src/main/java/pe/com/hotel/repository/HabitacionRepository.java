package pe.com.hotel.repository;

import pe.com.hotel.entity.Clientes;
import pe.com.hotel.entity.Habitacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface HabitacionRepository extends JpaRepository<Habitacion, Long> {

    @Query("select ha from Habitacion ha where ha.estado='1'")
    List<Habitacion> findAllCustom();
    
    @Query("select ha from Habitacion ha where upper(ha.Num) like upper(:Num) and ha.estado='1'")
    List<Habitacion> findByName(@Param("Num") String Num);
}
