package com.codiPlayCo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name ="procesoLecciones")
public class procesoLeccion {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer Completado;
	private Date fechaInicio;
	private Date fechaCompletada;
	private Integer puntuacion;
	private Integer intentos;
	
	
	@ManyToOne
	private usuario usuario;
	
	@ManyToOne
	private leccion Leccion;

	public procesoLeccion() {
	
	}

	public procesoLeccion(Integer id, Integer completado, Date fechaInicio, Date fechaCompletada, Integer puntuacion,
			Integer intentos, usuario usuario, leccion leccion) {
		super();
		this.id = id;
		Completado = completado;
		this.fechaInicio = fechaInicio;
		this.fechaCompletada = fechaCompletada;
		this.puntuacion = puntuacion;
		this.intentos = intentos;
		this.usuario = usuario;
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

	public usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(usuario usuario) {
		this.usuario = usuario;
	}

	public leccion getLeccion() {
		return Leccion;
	}

	public void setLeccion(leccion leccion) {
		Leccion = leccion;
	}

	@Override
	public String toString() {
		return "procesoLeccion [id=" + id + ", Completado=" + Completado + ", fechaInicio=" + fechaInicio
				+ ", fechaCompletada=" + fechaCompletada + ", puntuacion=" + puntuacion + ", intentos=" + intentos
				+ "]";
	}
	
}
