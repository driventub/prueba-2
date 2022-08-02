package uce.edu.prueba2_pa.service;

import java.time.LocalDateTime;
import java.util.List;

import uce.edu.prueba2_pa.repository.modelo.Paciente;
import uce.edu.prueba2_pa.repository.modelo.PacienteSencillo;

public interface IPacienteService {
	public Paciente buscar(Integer id);

	public void actualizar(Paciente paci);

	public void eliminar(Integer id);

	public void insertar(Paciente paci);

	public Paciente buscarCedula(String cedula);

	public List<PacienteSencillo> buscar(LocalDateTime fechaNacicimiento, String genero);
}
