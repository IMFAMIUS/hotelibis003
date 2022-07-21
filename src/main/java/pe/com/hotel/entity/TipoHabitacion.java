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
@Entity(name="Tipohabitacion")
@Table(name="tipohabitacion")
     
public class TipoHabitacion implements Serializable {
    private static final long serialVersion=1L;
    @Id
    @Column(name = "id_Tip")
    private long codigo;
    @Column(name = "Categoria")
    private String Categoria;
    @Column(name = "Camas")
    private int Camas;
    @Column(name = "baños")
    private int baños;
    @Column(name = "Terrazas")
    private int Terrazas;
    @Column(name = "Precio")
    private double Precio;
    @Column(name = "tipest")
    private boolean estado;
    
}