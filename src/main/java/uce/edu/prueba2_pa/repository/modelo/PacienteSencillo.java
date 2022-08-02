package uce.edu.prueba2_pa.repository.modelo;

import java.time.LocalDateTime;

public class PacienteSencillo {
    
    private String cedula;

    private String nombre;

    private LocalDateTime fechaNacimiento;

    private String genero;


    public PacienteSencillo(String cedula, String nombre, LocalDateTime fechaNacimiento, String genero) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
    }
    

    public PacienteSencillo() {
    }

    // Get y Set

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    @Override
    public String toString() {
        return "PacienteSencillo [cedula=" + cedula + ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero
                + ", nombre=" + nombre + "]";
    }

    

    

}
