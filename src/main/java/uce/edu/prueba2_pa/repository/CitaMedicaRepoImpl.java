package uce.edu.prueba2_pa.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import uce.edu.prueba2_pa.repository.modelo.CitaMedica;
import uce.edu.prueba2_pa.repository.modelo.ReporteCita;

@Repository
@Transactional
public class CitaMedicaRepoImpl implements ICitaMedicaRepo {

	private static Logger logger = LogManager.getLogger(CitaMedicaRepoImpl.class);

	@PersistenceContext
	private EntityManager e;

	@Override
	public CitaMedica buscar(Integer id) {
		return this.e.find(CitaMedica.class, id);
	}


	@Override
	public void actualizar(CitaMedica cita) {
		this.e.merge(cita);

	}

	@Override
	public void eliminar(Integer id) {
		CitaMedica gBorrar = this.buscar(id);
		this.e.remove(gBorrar);

	}

	@Override
	public void insertar(CitaMedica cita) {
		this.e.persist(cita);

	}

	@Override
	public CitaMedica buscarNumero(String numero) {
		TypedQuery<CitaMedica> myTypedQuery = (TypedQuery<CitaMedica>) this.e
				.createQuery("SELECT c FROM CitaMedica c WHERE c.numero = :datoNumero", CitaMedica.class)
				.setParameter("datoNumero", numero);
		return myTypedQuery.getSingleResult();
	}


	@Override
	public List<ReporteCita> buscarTo(LocalDateTime fechaCita, BigDecimal costo) {
		TypedQuery<ReporteCita> myTypedQuery = (TypedQuery<ReporteCita>) this.e
				.createQuery("SELECT NEW uce.edu.prueba2_pa.repository.modelo.ReporteCita(c.numero, c.fechaCita, c.valorCita, c.fechaControl) FROM CitaMedica c WHERE c.fechaCita >= :datoFecha AND c.valorCita >= :datoCosto", ReporteCita.class)
				.setParameter("datoFecha", fechaCita)
				.setParameter("datoCosto",costo);
		return myTypedQuery.getResultList();
	}

}
