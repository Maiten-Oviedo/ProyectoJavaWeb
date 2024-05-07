
package persistencia;

import java.io.Serializable;

public class ControladoraPersistencia implements Serializable{
    HorarioJpaController horarioJpa = new HorarioJpaController();
    OdontologoJpaController odontologoJpa = new  OdontologoJpaController();
    PacienteJpaController pacienteJpa = new PacienteJpaController();
    PersonaJpaController personaJpa = new PersonaJpaController();
    ResponsableJpaController responsableJpa = new ResponsableJpaController();
    SecretarioJpaController secretarioJpa = new SecretarioJpaController();
    TurnoJpaController turnoJpa = new TurnoJpaController();
    UsuarioJpaController usuarioJpa = new UsuarioJpaController();
}
    