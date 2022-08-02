package uce.edu.prueba2_pa.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uce.edu.prueba2_pa.repository.IDoctorRepo;
import uce.edu.prueba2_pa.repository.modelo.Doctor;

@Service
public class DoctorServiceImpl implements IDoctorService {

	private static Logger logger = LogManager.getLogger(DoctorServiceImpl.class);

	@Autowired
	private IDoctorRepo doctRepo;

	@Override
	public Doctor buscar(Integer id) {
		return this.doctRepo.buscar(id);
	}

	@Override
	public void actualizar(Doctor doct) {
		this.doctRepo.actualizar(doct);

	}

	@Override
	public void eliminar(Integer id) {
		this.doctRepo.eliminar(id);

	}

	@Override
	public void insertar(Doctor doct) {
		this.doctRepo.insertar(doct);

	}

	@Override
	public Doctor buscarCedula(String cedula) {

		return this.doctRepo.buscarCedula(cedula);
	}

}
