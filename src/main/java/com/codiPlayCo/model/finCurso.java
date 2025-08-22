package com.codiPlayCo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "finCursos")
public class finCurso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Date fechaFin;
	private Date tiempoRealizacion;
	private String notaFinal;
	private String finCurso;
	
	@ManyToOne
	private curso Curso;

	public finCurso() {
	
	}

	public finCurso(Integer id, Date fechaFin, Date tiempoRealizacion, String notaFinal, String finCurso, curso curso) {
		super();
		this.id = id;
		this.fechaFin = fechaFin;
		this.tiempoRealizacion = tiempoRealizacion;
		this.notaFinal = notaFinal;
		this.finCurso = finCurso;
		Curso = curso;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Date getTiempoRealizacion() {
		return tiempoRealizacion;
	}

	public void setTiempoRealizacion(Date tiempoRealizacion) {
		this.tiempoRealizacion = tiempoRealizacion;
	}

	public String getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(String notaFinal) {
		this.notaFinal = notaFinal;
	}

	public String getFinCurso() {
		return finCurso;
	}

	public void setFinCurso(String finCurso) {
		this.finCurso = finCurso;
	}

	public curso getCurso() {
		return Curso;
	}

	public void setCurso(curso curso) {
		Curso = curso;
	}

	@Override
	public String toString() {
		return "finCurso [id=" + id + ", fechaFin=" + fechaFin + ", tiempoRealizacion=" + tiempoRealizacion
				+ ", notaFinal=" + notaFinal + ", finCurso=" + finCurso + "]";
	}
	
	
}
