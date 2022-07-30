package uce.edu.prueba2_pa.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ReporteCita {
    
    private String numeroCita;
    
    private LocalDateTime fechaCita;

    private BigDecimal costoCita;

    private LocalDateTime fechaControl;

    public ReporteCita(String numeroCita, LocalDateTime fechaCita, BigDecimal costoCita, LocalDateTime fechaControl) {
        this.numeroCita = numeroCita;
        this.fechaCita = fechaCita;
        this.costoCita = costoCita;
        this.fechaControl = fechaControl;
    }

    

    public ReporteCita() {
    }



    public String getNumeroCita() {
        return numeroCita;
    }

    public void setNumeroCita(String numeroCita) {
        this.numeroCita = numeroCita;
    }

    public LocalDateTime getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(LocalDateTime fechaCita) {
        this.fechaCita = fechaCita;
    }

    public BigDecimal getCostoCita() {
        return costoCita;
    }

    public void setCostoCita(BigDecimal costoCita) {
        this.costoCita = costoCita;
    }

    public LocalDateTime getFechaControl() {
        return fechaControl;
    }

    public void setFechaControl(LocalDateTime fechaControl) {
        this.fechaControl = fechaControl;
    }



    @Override
    public String toString() {
        return "ReporteCita [costoCita=" + costoCita + ", fechaCita=" + fechaCita + ", fechaControl=" + fechaControl
                + ", numeroCita=" + numeroCita + "]";
    }

    
    
    
}
