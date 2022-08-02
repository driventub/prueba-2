package uce.edu.prueba2_pa.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.print.Doc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uce.edu.prueba2_pa.repository.ICitaMedicaRepo;
import uce.edu.prueba2_pa.repository.modelo.CitaMedica;
import uce.edu.prueba2_pa.repository.modelo.Doctor;
import uce.edu.prueba2_pa.repository.modelo.Paciente;
import uce.edu.prueba2_pa.repository.modelo.PacienteSencillo;
import uce.edu.prueba2_pa.repository.modelo.ReporteCita;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Service
public class GestorServiceImpl implements IGestorService{

    private static Logger LOG = LogManager.getLogger(GestorServiceImpl.class);

    @Autowired
    private IDoctorService doctorService;

    @Autowired
    private IPacienteService pacienteService;

    @Autowired
    private ICitaMedicaService citaMedicaService;


    @Override
    public void agendarCita(String numero, LocalDateTime fechaCita, BigDecimal costoCita, String lugarCita,
            String cedulaDoctor, String cedulaPaciente) {

        CitaMedica c = new CitaMedica();
        Paciente p = this.pacienteService.buscarCedula(cedulaPaciente);
        Doctor d = this.doctorService.buscarCedula(cedulaDoctor);

        c.setNumero(numero);
        c.setFechaCita(fechaCita);
        c.setValorCita(costoCita);
        c.setLugarCita(lugarCita);
        c.setDoctor(d);
        c.setPaciente(p);

        this.citaMedicaService.insertar(c);

        
    }

    @Override
    public void actualizarCita(String numero, String diagnostico, String receta, LocalDateTime fechaControl) {
        CitaMedica c = this.citaMedicaService.buscarNumero(numero);
        c.setDiagnostico(diagnostico);
        c.setReceta(receta);
        c.setFechaControl(fechaControl);
        
        this.citaMedicaService.actualizar(c);
        
    }

    @Override
    public void generarReporteCita(LocalDateTime fechaCita, BigDecimal costo) {
        List<ReporteCita> lista = this.citaMedicaService.buscarTo(fechaCita, costo);

        for (ReporteCita reporteCita : lista) {
            LOG.info(reporteCita.toString());
        }
        
    }

    @Override
    public void generarPacienteSencillo(LocalDateTime fechaNacimiento, String genero) {
        List<PacienteSencillo> lista = this.pacienteService.buscar(fechaNacimiento, genero);
        for (PacienteSencillo pacienteSencillo : lista) {
            LOG.info(pacienteSencillo.toString());
        }
        
        
    }
    
}
