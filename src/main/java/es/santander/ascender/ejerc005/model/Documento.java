package es.santander.ascender.ejerc005.model;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Documento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nombre", nullable = false, length = 256)
    private String nombre;
    @Column(name = "extension", nullable = false, length = 15)
    private String extension;
    @Column(name = "persona_id", nullable = false)
    private Long persona_id;
    @CreationTimestamp
    @Column(name = "fechacreacion", nullable = false)
    private LocalDate fechacreacion;
    @Column(name="borrado", nullable= false)
    private boolean borrado;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getExtension() {
        return extension;
    }
    public void setExtension(String extension) {
        this.extension = extension;
    }
    public Long getPersona_id() {
        return persona_id;
    }
    public void setPersona_id(Long persona_id) {
        this.persona_id = persona_id;
    }
    public LocalDate getFechacreacion() {
        return fechacreacion;
    }
    public void setFechacreacion(LocalDate fechacreacion) {
        this.fechacreacion = fechacreacion;
    }
    public boolean isBorrado() {
        return borrado;
    }
    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }
    
}
