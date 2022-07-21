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
@Entity(name="Habitacion")
@Table(name="habitacion")


public class Habitacion implements Serializable{
    
    private static final long serialVersion=1L;
    @Id
    @Column(name = "id_Habit")
    private long codigo;
    @Column(name = "Num")
    private int Num;
    @Column(name = "Piso")
    private int Piso;
    @Column(name = "Servicio")
    private String Servicio;
    @Column(name = "habest")
    private boolean estado;
    
    @ManyToOne
    @JoinColumn(name = "id_Tip",nullable = false)
    private TipoHabitacion tipoHabitacion;
    
}

