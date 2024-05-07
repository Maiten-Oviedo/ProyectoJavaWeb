
package logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class OdontologoEntity extends PersonaEntity implements Serializable{
    
    private String especialidad;
    @OneToMany(mappedBy = "odontologo")
    private List<TurnoEntity> listaTurnos;
    @OneToOne
    private UsuarioEntity unUsuario;
    @OneToOne
    private Horario unHorario;

    public OdontologoEntity() {
    }

    public OdontologoEntity(String especialidad, List<TurnoEntity> listaTurnos, UsuarioEntity unUsuario, Horario unHorario, int id, String nombre, String apellido, int dni, int telefono, String direccion, Date fecha_nac) {
        super(id, nombre, apellido, dni, telefono, direccion, fecha_nac);
        this.especialidad = especialidad;
        this.listaTurnos = listaTurnos;
        this.unUsuario = unUsuario;
        this.unHorario = unHorario;
    }

    
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<TurnoEntity> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<TurnoEntity> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

    public UsuarioEntity getUsuario() {
        return unUsuario;
    }

    public void setUsuario(UsuarioEntity usuario) {
        this.unUsuario = usuario;
    }

    public Horario getHorario() {
        return unHorario;
    }

    public void setHorario(Horario horario) {
        this.unHorario = horario;
    }
    
    
    
}
