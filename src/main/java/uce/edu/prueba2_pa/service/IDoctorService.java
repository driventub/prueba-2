package uce.edu.prueba2_pa.service;

import uce.edu.prueba2_pa.repository.modelo.Doctor;

public interface IDoctorService {
	public Doctor buscar(Integer id);

	public void actualizar(Doctor doct);

	public void eliminar(Integer id);

	public void insertar(Doctor doct);

	public Doctor buscarCedula(String cedula);
}
