package uce.edu.prueba2_pa.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uce.edu.prueba2_pa.repository.ICitaMedicaRepo;
import uce.edu.prueba2_pa.repository.modelo.CitaMedica;
import uce.edu.prueba2_pa.repository.modelo.ReporteCita;



@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService {
	
	private static Logger logger =  LogManager.getLogger(CitaMedicaServiceImpl.class);

	@Autowired
	private ICitaMedicaRepo citaRepo ;
	
	@Override
	public CitaMedica buscar(Integer id) {
		
		return this.citaRepo.buscar(id);
	}

	@Override
	public void actualizar(CitaMedica cita) {
		this.citaRepo.actualizar(cita);
		
	}

	@Override
	public void eliminar(Integer id) {
		this.citaRepo.eliminar(id);
		
	}

	@Override
	public void insertar(CitaMedica cita) {
		this.citaRepo.insertar(cita);
		
	}

	@Override
	public CitaMedica buscarNumero(String numero) {
		
		return this.citaRepo.buscarNumero(numero);
	}

	@Override
	public List<ReporteCita> buscarTo(LocalDateTime fechaCita, BigDecimal costo) {
		
		return this.citaRepo.buscarTo(fechaCita, costo);
	}

}

