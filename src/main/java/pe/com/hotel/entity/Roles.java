package pe.com.hotel.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name="Rol")
@Table(name="rol")

public class Roles implements Serializable{
    
    private static final long serialVersion=1L;

    @Id
    @Column(name = "id_Rol")
    private long codigo;
    @Column(name = "Nombre_cargo")
    private String Nombre_cargo;
    @Column(name = "rolest")
    private boolean estado;
}   
    