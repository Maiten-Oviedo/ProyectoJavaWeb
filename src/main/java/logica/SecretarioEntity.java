
package logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class SecretarioEntity extends PersonaEntity implements Serializable{
    private String sector;
    @OneToOne
    private UsuarioEntity usuario;

    public SecretarioEntity() {
    }

    public SecretarioEntity(String sector, UsuarioEntity usuario, int id, String nombre, String apellido, int dni, int telefono, String dreccion, Date fecha_nac) {
        super(id, nombre, apellido, dni, telefono, dreccion, fecha_nac);
        this.sector = sector;
        this.usuario = usuario;
    }

    

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public UsuarioEntity getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioEntity usuario) {
        this.usuario = usuario;
    }
    
    
}
