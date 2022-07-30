package uce.edu.prueba2_pa.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import uce.edu.prueba2_pa.repository.modelo.CitaMedica;
import uce.edu.prueba2_pa.repository.modelo.ReporteCita;

public interface ICitaMedicaRepo {
    public CitaMedica buscar(Integer id);

    public CitaMedica buscarNumero(String numero);
    
    public List<ReporteCita> buscarTo(LocalDateTime fechaCita, BigDecimal costo);

    public void actualizar(CitaMedica cita);

    public void eliminar(Integer id);

    public void insertar(CitaMedica cita);


}
