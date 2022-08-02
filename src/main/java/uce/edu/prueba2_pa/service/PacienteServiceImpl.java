package uce.edu.prueba2_pa.service;

import java.time.LocalDateTime;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uce.edu.prueba2_pa.repository.IPacienteRepo;
import uce.edu.prueba2_pa.repository.modelo.Paciente;
import uce.edu.prueba2_pa.repository.modelo.PacienteSencillo;

@Service
public class PacienteServiceImpl implements IPacienteService {

	private static Logger logger = LogManager.getLogger(PacienteServiceImpl.class);

	@Autowired
	private IPacienteRepo paciRepo;

	@Override
	public Paciente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.paciRepo.buscar(id);
	}

	@Override
	public void actualizar(Paciente paci) {
		this.paciRepo.actualizar(paci);

	}

	@Override
	public void eliminar(Integer id) {
		this.paciRepo.eliminar(id);

	}

	@Override
	public void insertar(Paciente paci) {
		this.paciRepo.insertar(paci);

	}

	@Override
	public Paciente buscarCedula(String cedula) {

		return this.paciRepo.buscarCedula(cedula);
	}

	@Override
	public List<PacienteSencillo> buscar(LocalDateTime fechaNacicimiento, String genero) {
		// TODO Auto-generated method stub
		return this.paciRepo.buscar(fechaNacicimiento, genero);
	}

}
