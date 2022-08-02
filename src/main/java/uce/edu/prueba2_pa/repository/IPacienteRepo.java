package uce.edu.prueba2_pa.repository;

import java.time.LocalDateTime;
import java.util.List;

import uce.edu.prueba2_pa.repository.modelo.Paciente;
import uce.edu.prueba2_pa.repository.modelo.PacienteSencillo;

public interface IPacienteRepo {
	public Paciente buscar(Integer id);

	public Paciente buscarCedula(String cedula);

	public void actualizar(Paciente paci);

	public void eliminar(Integer id);

	public void insertar(Paciente paci);

	public List<PacienteSencillo> buscar(LocalDateTime fechaNacicimiento, String genero);
}
