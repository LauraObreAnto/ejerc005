package es.santander.ascender.ejerc005.model;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Documento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    @Length (max = 256)
    @Column
    private String nombre;

    @Length (max = 15)
    @Column
    private String extension;

    @NotBlank
    @Column
    private Long persona_id;

    @NotBlank
    @CreationTimestamp
    @Column
    private LocalDate fechacreacion;

    @NotBlank
    @Column
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
