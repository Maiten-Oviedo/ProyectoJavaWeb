
package logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class PacienteEntity extends PersonaEntity implements Serializable{
    private boolean tiene_OS;
    private String tipo_sangre;
    @OneToMany(mappedBy = "paciente")
    private List<TurnoEntity> listaTurnos;
    @OneToOne
    private ResponsableEntity responsable;

    public PacienteEntity() {
    }

    public PacienteEntity(boolean tiene_OS, String tipo_sangre, List<TurnoEntity> listaTurnos, ResponsableEntity responsable, int id, String nombre, String apellido, int dni, int telefono, String dreccion, Date fecha_nac) {
        super(id, nombre, apellido, dni, telefono, dreccion, fecha_nac);
        this.tiene_OS = tiene_OS;
        this.tipo_sangre = tipo_sangre;
        this.listaTurnos = listaTurnos;
        this.responsable = responsable;
    }

    public boolean isTiene_OS() {
        return tiene_OS;
    }

    public void setTiene_OS(boolean tiene_OS) {
        this.tiene_OS = tiene_OS;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

    public List<TurnoEntity> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<TurnoEntity> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

    public ResponsableEntity getResponsable() {
        return responsable;
    }

    public void setResponsable(ResponsableEntity responsable) {
        this.responsable = responsable;
    }
    
    
    
}
