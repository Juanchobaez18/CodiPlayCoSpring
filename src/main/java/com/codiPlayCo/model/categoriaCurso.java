package com.codiPlayCo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name ="categoriaCursos")
public class categoriaCurso {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String descripcion;
	private String icono;
	
	@ManyToOne
	private curso Curso;

	public categoriaCurso() {
	
	}

	public categoriaCurso(Integer id, String nombre, String descripcion, String icono, curso curso) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.icono = icono;
		Curso = curso;
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

	public String getIcono() {
		return icono;
	}

	public void setIcono(String icono) {
		this.icono = icono;
	}

	public curso getCurso() {
		return Curso;
	}

	public void setCurso(curso curso) {
		Curso = curso;
	}

	@Override
	public String toString() {
		return "categoriaCurso [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", icono=" + icono
				+ "]";
	}
	
	
}
