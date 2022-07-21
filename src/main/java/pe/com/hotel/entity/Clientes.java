package pe.com.hotel.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name="Clientes")
@Table(name="clientes")
public class Clientes {
    
    private static final long serialVersion=1L;
    @Id
    @Column(name = "id_cliente")
    private long codigo;
    @Column(name = "Nombre")
    private String Nombre;
    @Column(name = "Apellidos_Paterno")
    private String Apellidos_Paterno;
    @Column(name = "Apellidos_Materno")
    private String Apellidos_Materno;
    @Column(name = "Fecha_Nac")
    private Date Fecha_Nac;
    @Column(name = "Tipo_doc")
    private String Tipo_doc;
    @Column(name = "N_Doc")
    private int num_Doc;
    @Column(name = "Correo")
    private String Correo;
    @Column(name = "Telf")
    private int Telf;
    @Column(name = "Sexo")
    private String Sexo;
    @Column(name = "cliest")
    private boolean estado;
    
}
