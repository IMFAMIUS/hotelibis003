package pe.com.hotel.entity;

import java.io.Serializable;
import java.util.Date;
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
@Entity(name="Reserva")
@Table(name="reserva")


public class Reserva implements Serializable{
    
    private static final long serialVersion=1L;
    @Id
    @Column(name = "id_reserva")
    private long codigo;
    @Column(name = "Costo")
    private double Costo;
    @Column(name = "CantP_Adultos")
    private int CantP_Adultos;
    @Column(name = "CantP_Niños")
    private int CantP_Niños;
    @Column(name = "Fecha_ingreso")
    private String Fecha_ingreso;
    @Column(name = "Fecha_Salida")
    private String Fecha_Salida;
    @Column(name = "Usuario_registro")
    private String Usuario_registro;
    @Column(name = "Fecha_Registro")
    private String Fecha_Registro;
    @Column(name = "Usuario_Modifico")
    private String Usuario_Modifico;
    @Column(name = "Fecha_Modifico")
    private String Fecha_Modifico;
    @Column(name = "resest")
    private boolean estado;
    
    @ManyToOne
    @JoinColumn(name = "id_clientes",nullable = false)
    private Clientes clientes;
    @ManyToOne
    @JoinColumn(name = "id_Habit",nullable = false)
    private Habitacion habitacion;
}

