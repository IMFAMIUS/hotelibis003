package pe.com.hotel.repository;

import pe.com.hotel.entity.Clientes;
import pe.com.hotel.entity.TipoHabitacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TipoHabitacionRepository extends JpaRepository<TipoHabitacion, Long> {

    @Query("select th from Tipohabitacion th where th.estado='1'")
    List<TipoHabitacion> findAllCustom();
    
    @Query("select th from Tipohabitacion th where upper(th.Categoria) like upper(:Categoria) and th.estado='1'")
    List<TipoHabitacion> findByName(@Param("Categoria") String Categoria);
}
