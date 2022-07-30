package uce.edu.prueba2_pa.service;

import java.util.List;

import uce.edu.prueba2_pa.repository.modelo.Doctor;

public interface IDoctorService {
	public Doctor buscar(Integer id);

	public List<Doctor> buscarTodos();

	public void actualizar(Doctor doct);

	public void eliminar(Integer id);

	public void insertar(Doctor doct);

	public Doctor buscarCedula(String cedula);
}
