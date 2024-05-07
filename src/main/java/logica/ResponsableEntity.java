
package logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;

@Entity
public class ResponsableEntity extends PersonaEntity implements Serializable{
    private String tipo_respnsabilidad;

    public ResponsableEntity() {
    }

    public ResponsableEntity(String tipo_respnsabilidad, int id, String nombre, String apellido, int dni, int telefono, String dreccion, Date fecha_nac) {
        super(id, nombre, apellido, dni, telefono, dreccion, fecha_nac);
        this.tipo_respnsabilidad = tipo_respnsabilidad;
    }


    public String getTipo_respnsabilidad() {
        return tipo_respnsabilidad;
    }

    public void setTipo_respnsabilidad(String tipo_respnsabilidad) {
        this.tipo_respnsabilidad = tipo_respnsabilidad;
    }
    
    
}
