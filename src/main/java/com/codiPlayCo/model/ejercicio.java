package com.codiPlayCo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ejercicios")
public class Ejercicio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String tipo;
	private String anunciado;
	private String solucion;
	private String dificultad;
	private String tiempoEstimado;

	@ManyToOne
	private Docente Docente;

	@ManyToOne
	private Leccion Leccion;

	public Ejercicio() {

	}

	public Ejercicio(Integer id, String tipo, String anunciado, String solucion, String dificultad,
			String tiempoEstimado, com.codiPlayCo.model.Docente docente, com.codiPlayCo.model.Leccion leccion) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.anunciado = anunciado;
		this.solucion = solucion;
		this.dificultad = dificultad;
		this.tiempoEstimado = tiempoEstimado;
		Docente = docente;
		Leccion = leccion;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getAnunciado() {
		return anunciado;
	}

	public void setAnunciado(String anunciado) {
		this.anunciado = anunciado;
	}

	public String getSolucion() {
		return solucion;
	}

	public void setSolucion(String solucion) {
		this.solucion = solucion;
	}

	public String getDificultad() {
		return dificultad;
	}

	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}

	public String getTiempoEstimado() {
		return tiempoEstimado;
	}

	public void setTiempoEstimado(String tiempoEstimado) {
		this.tiempoEstimado = tiempoEstimado;
	}

	public Docente getDocente() {
		return Docente;
	}

	public void setDocente(Docente docente) {
		Docente = docente;
	}

	public Leccion getLeccion() {
		return Leccion;
	}

	public void setLeccion(Leccion Leccion) {
		this.Leccion = Leccion;
	}

	@Override
	public String toString() {
		return "Ejercicio [id=" + id + ", tipo=" + tipo + ", anunciado=" + anunciado + ", solucion=" + solucion
				+ ", dificultad=" + dificultad + ", tiempoEstimado=" + tiempoEstimado + "]";
	}

}
