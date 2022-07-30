package uce.edu.prueba2_pa.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import uce.edu.prueba2_pa.repository.modelo.Doctor;

@Repository
@Transactional
public class DoctorRepoImpl implements IDoctorRepo {

	private static Logger logger = LogManager.getLogger(DoctorRepoImpl.class);

	@PersistenceContext
	private EntityManager e;

	@Override
	public Doctor buscar(Integer id) {
		return this.e.find(Doctor.class, id);
	}

	@Override
	public List<Doctor> buscarTodos() {
		TypedQuery<Doctor> myTypedQuery = (TypedQuery<Doctor>) this.e
				.createQuery("SELECT d FROM Doctor d    ", Doctor.class);
		return myTypedQuery.getResultList();

	}

	@Override
	public void actualizar(Doctor doct) {
		this.e.merge(doct);

	}

	@Override
	public void eliminar(Integer id) {
		Doctor gBorrar = this.buscar(id);
		this.e.remove(gBorrar);

	}

	@Override
	public void insertar(Doctor doct) {
		this.e.persist(doct);

	}

	@Override
	public Doctor buscarCedula(String cedula) {
		TypedQuery<Doctor> myTypedQuery = (TypedQuery<Doctor>) this.e
				.createQuery("SELECT d FROM Doctor d WHERE d.cedula = :datoCedula" , Doctor.class)
				.setParameter("datoCedula", cedula);

		return myTypedQuery.getSingleResult();
	}

}
