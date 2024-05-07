
package logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class TurnoEntity implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTurno;
    @Temporal(TemporalType.DATE)
    private Date fechaTurno;
    private String horaTurno;
    private String afeccion;
    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private PacienteEntity paciente;
    @ManyToOne
    @JoinColumn(name = "odontologo_id")
    private OdontologoEntity odontologo;

    public TurnoEntity() {
    }

    public TurnoEntity(Date fechaTurno, String horaTurno, String afeccion, PacienteEntity paciente, OdontologoEntity odontologo) {
        this.fechaTurno = fechaTurno;
        this.horaTurno = horaTurno;
        this.afeccion = afeccion;
        this.paciente = paciente;
        this.odontologo = odontologo;
    }

    public int getId_turno() {
        return idTurno;
    }

    public void setId_turno(int id_turno) {
        this.idTurno = id_turno;
    }

    public Date getFecha_turno() {
        return fechaTurno;
    }

    public void setFecha_turno(Date fecha_turno) {
        this.fechaTurno = fecha_turno;
    }

    public String getHora_turno() {
        return horaTurno;
    }

    public void setHora_turno(String hora_turno) {
        this.horaTurno = hora_turno;
    }

    public String getAffecion() {
        return afeccion;
    }

    public void setAffecion(String affecion) {
        this.afeccion = affecion;
    }
    

    public PacienteEntity getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteEntity paciente) {
        this.paciente = paciente;
    }

    public OdontologoEntity getOdontologo() {
        return odontologo;
    }

    public void setOdontologo(OdontologoEntity odontologo) {
        this.odontologo = odontologo;
    }
    
    
    
}
