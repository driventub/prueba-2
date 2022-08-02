package uce.edu.prueba2_pa.repository;

import uce.edu.prueba2_pa.repository.modelo.Paciente;

public interface IPacienteRepo {
	public Paciente buscar(Integer id);

	public Paciente buscarCedula(String cedula);

	public void actualizar(Paciente paci);

	public void eliminar(Integer id);

	public void insertar(Paciente paci);
}
