package uce.edu.prueba2_pa.repository;

import java.util.List;

import uce.edu.prueba2_pa.repository.modelo.Doctor;

public interface IDoctorRepo {
	public Doctor buscar(Integer id);

	public Doctor buscarCedula(String cedula);

	public List<Doctor> buscarTodos();

	public void actualizar(Doctor doct);

	public void eliminar(Integer id);

	public void insertar(Doctor doct);
}
