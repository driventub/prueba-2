package uce.edu.prueba2_pa.service;

import uce.edu.prueba2_pa.repository.modelo.Paciente;

public interface IPacienteService {
	public Paciente buscar(Integer id);

	public void actualizar(Paciente paci);

	public void eliminar(Integer id);

	public void insertar(Paciente paci);

	public Paciente buscarCedula(String cedula);
}
