package com.codiPlayCo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "lecciones")
public class leccion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer id;
	private String titulo;
	private String descripcion;
	private String orden;
	private String contenido;
	private String videoURL;
	private Date duracionEstimada;

	@ManyToOne
	private curso curso;
	@ManyToOne
	private docente docente;

	public leccion() {

	}

	public leccion(Integer id, String titulo, String descripcion, String orden, String contenido, String videoURL,
			Date duracionEstimada, curso curso, docente docente) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.orden = orden;
		this.contenido = contenido;
		this.videoURL = videoURL;
		this.duracionEstimada = duracionEstimada;
		this.curso = curso;
		this.docente = docente;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getOrden() {
		return orden;
	}

	public void setOrden(String orden) {
		this.orden = orden;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getVideoURL() {
		return videoURL;
	}

	public void setVideoURL(String videoURL) {
		this.videoURL = videoURL;
	}

	public Date getDuracionEstimada() {
		return duracionEstimada;
	}

	public void setDuracionEstimada(Date duracionEstimada) {
		this.duracionEstimada = duracionEstimada;
	}

	public curso getCurso() {
		return curso;
	}

	public void setCurso(curso curso) {
		this.curso = curso;
	}

	public docente getDocente() {
		return docente;
	}

	public void setDocente(docente docente) {
		this.docente = docente;
	}

	@Override
	public String toString() {
		return "leccion [id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + ", orden=" + orden
				+ ", contenido=" + contenido + ", videoURL=" + videoURL + ", duracionEstimada=" + duracionEstimada
				+ "]";
	}

}
