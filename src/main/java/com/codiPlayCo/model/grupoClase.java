package com.codiPlayCo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = "grupoClases")
public class grupoClase {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String descripcion;
	private Date fechaCreacion;
	private Integer codigoAcceso;
	
	@OneToMany
	private String docente;

	public grupoClase() {
	 
	}

	public grupoClase(Integer id, String nombre, String descripcion, Date fechaCreacion, Integer codigoAcceso,
			String docente) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaCreacion = fechaCreacion;
		this.codigoAcceso = codigoAcceso;
		this.docente = docente;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Integer getCodigoAcceso() {
		return codigoAcceso;
	}

	public void setCodigoAcceso(Integer codigoAcceso) {
		this.codigoAcceso = codigoAcceso;
	}

	public String getDocente() {
		return docente;
	}

	public void setDocente(String docente) {
		this.docente = docente;
	}

	@Override
	public String toString() {
		return "grupoClase [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fechaCreacion="
				+ fechaCreacion + ", codigoAcceso=" + codigoAcceso + "]";
	}
	
	
	
}
