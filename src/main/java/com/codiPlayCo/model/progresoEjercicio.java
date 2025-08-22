package com.codiPlayCo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "progesoEjercicios")
public class progresoEjercicio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer completada;
	private Integer estadoEjercicios;
	private Date fechaIntento;
	private Integer puntuacion;
	private Date tiempoTardado;
	
	@ManyToOne
	private Usuario usuario;
	
	@ManyToOne
	private ejercicio Ejercicio;

	public progresoEjercicio() {
	
	}

	public progresoEjercicio(Integer id, Integer completada, Integer estadoEjercicios, Date fechaIntento,
			Integer puntuacion, Date tiempoTardado, Usuario usuario, ejercicio ejercicio) {
		super();
		this.id = id;
		this.completada = completada;
		this.estadoEjercicios = estadoEjercicios;
		this.fechaIntento = fechaIntento;
		this.puntuacion = puntuacion;
		this.tiempoTardado = tiempoTardado;
		this.usuario = usuario;
		Ejercicio = ejercicio;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCompletada() {
		return completada;
	}

	public void setCompletada(Integer completada) {
		this.completada = completada;
	}

	public Integer getEstadoEjercicios() {
		return estadoEjercicios;
	}

	public void setEstadoEjercicios(Integer estadoEjercicios) {
		this.estadoEjercicios = estadoEjercicios;
	}

	public Date getFechaIntento() {
		return fechaIntento;
	}

	public void setFechaIntento(Date fechaIntento) {
		this.fechaIntento = fechaIntento;
	}

	public Integer getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(Integer puntuacion) {
		this.puntuacion = puntuacion;
	}

	public Date getTiempoTardado() {
		return tiempoTardado;
	}

	public void setTiempoTardado(Date tiempoTardado) {
		this.tiempoTardado = tiempoTardado;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public ejercicio getEjercicio() {
		return Ejercicio;
	}

	public void setEjercicio(ejercicio ejercicio) {
		Ejercicio = ejercicio;
	}

	@Override
	public String toString() {
		return "progresoEjercicio [id=" + id + ", completada=" + completada + ", estadoEjercicios=" + estadoEjercicios
				+ ", fechaIntento=" + fechaIntento + ", puntuacion=" + puntuacion + ", tiempoTardado=" + tiempoTardado
				+ "]";
	}
	
}
