package com.codiPlayCo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "procesoLecciones")
public class ProcesoLeccion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer Completado;
	private Date fechaInicio;
	private Date fechaCompletada;
	private Integer puntuacion;
	private Integer intentos;

	@ManyToOne
	private Usuario Usuario;

	@ManyToOne
	private Leccion Leccion;

	public ProcesoLeccion() {

	}

	public ProcesoLeccion(Integer id, Integer completado, Date fechaInicio, Date fechaCompletada, Integer puntuacion,
			Integer intentos, com.codiPlayCo.model.Usuario usuario, com.codiPlayCo.model.Leccion leccion) {
		super();
		this.id = id;
		Completado = completado;
		this.fechaInicio = fechaInicio;
		this.fechaCompletada = fechaCompletada;
		this.puntuacion = puntuacion;
		this.intentos = intentos;
		Usuario = usuario;
		Leccion = leccion;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCompletado() {
		return Completado;
	}

	public void setCompletado(Integer completado) {
		Completado = completado;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaCompletada() {
		return fechaCompletada;
	}

	public void setFechaCompletada(Date fechaCompletada) {
		this.fechaCompletada = fechaCompletada;
	}

	public Integer getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(Integer puntuacion) {
		this.puntuacion = puntuacion;
	}

	public Integer getIntentos() {
		return intentos;
	}

	public void setIntentos(Integer intentos) {
		this.intentos = intentos;
	}

	public Usuario getUsuario() {
		return Usuario;
	}

	public void setUsuario(Usuario Usuario) {
		this.Usuario = Usuario;
	}

	public Leccion getLeccion() {
		return Leccion;
	}

	public void setLeccion(Leccion leccion) {
		Leccion = leccion;
	}

	@Override
	public String toString() {
		return "procesoLeccion [id=" + id + ", Completado=" + Completado + ", fechaInicio=" + fechaInicio
				+ ", fechaCompletada=" + fechaCompletada + ", puntuacion=" + puntuacion + ", intentos=" + intentos
				+ "]";
	}

}
