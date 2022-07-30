package uce.edu.prueba2_pa.repository;

import java.util.List;

import uce.edu.prueba2_pa.repository.modelo.Paciente;

public interface IPacienteRepo {
	public Paciente buscar(Integer id);

	public Paciente buscarCedula(String cedula);

	public List<Paciente> buscarTodos();

	public void actualizar(Paciente paci);

	public void eliminar(Integer id);

	public void insertar(Paciente paci);
}
