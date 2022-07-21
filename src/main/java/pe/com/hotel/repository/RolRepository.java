package pe.com.hotel.repository;

import pe.com.hotel.entity.Roles;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RolRepository extends JpaRepository<Roles, Long> {

    @Query("select ro from Rol ro where ro.estado='1'")
    List<Roles> findAllCustom();
    
    @Query("select ro from Rol ro where upper(ro.Nombre_cargo) like upper(:Nombre_cargo) and ro.estado='1'")
    List<Roles> findByName(@Param("Nombre_cargo") String Nombre_cargo);
}
