package uce.edu.prueba2_pa;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import uce.edu.prueba2_pa.repository.modelo.Doctor;
import uce.edu.prueba2_pa.repository.modelo.Paciente;
import uce.edu.prueba2_pa.service.IDoctorService;
import uce.edu.prueba2_pa.service.IGestorService;
import uce.edu.prueba2_pa.service.IPacienteService;

@SpringBootApplication
public class Prueba2PaApplication implements CommandLineRunner {

	@Autowired
	private IDoctorService doctorService;

	@Autowired
	private IPacienteService pacienteService;

	@Autowired
	private IGestorService gestorService;

	public static void main(String[] args) {
		SpringApplication.run(Prueba2PaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Doctor doctor = new Doctor();
		Paciente paciente = new Paciente();

		// 1.
		doctor.setApellido("Monterrey");
		doctor.setCedula("173782994-3");
		doctor.setFechaNacimiento(LocalDateTime.of(1980, 12, 03, 01, 01));
		doctor.setNombre("Belen");
		doctor.setNumeroConsultorio("11A");
		doctor.setSalario(new BigDecimal("7000.00"));
		doctor.setTitulo("Licenciada");

		this.doctorService.insertar(doctor);
		// 2.

		paciente.setApellido("Gomez");
		paciente.setCedula("173732954-0");
		paciente.setCodigoIESS("37372");
		paciente.setEstatura(new BigDecimal("166.3"));
		paciente.setFechaNacimiento(LocalDateTime.of(1970, 11, 05, 01, 01));
		paciente.setGenero("Masculino");
		paciente.setNombre("Andres");
		paciente.setPeso(new BigDecimal("68.7"));

		this.pacienteService.insertar(paciente);

		// 3.

		this.gestorService.agendarCita("1Q", LocalDateTime.of(2022, 7, 31, 7, 01), new BigDecimal("25.00"), "Quito",
				"173782994-3", "173732954-0");

		// 4.

		this.gestorService.actualizarCita("1Q", "Urea Alta", "Paracetamol", LocalDateTime.of(2022, 8, 31, 07, 01 ));

		// 5.
		
		this.gestorService.generarReporteCita(LocalDateTime.of(2022, 7, 01, 07, 01), new BigDecimal("20.00"));

	}

}
