package uce.edu.prueba2_pa.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface IGestorService {
    public void agendarCita(String numero, LocalDateTime fechaCita, BigDecimal costoCita, String lugarCita,
            String cedulaDoctor, String cedulaPaciente);

    public void actualizarCita(String numero, String diagnostico, String receta, LocalDateTime fechaControl) ;

    public void generarReporteCita(LocalDateTime fechaCita, BigDecimal costo);

    public void generarPacienteSencillo(LocalDateTime fechaNacimiento, String genero);
}
