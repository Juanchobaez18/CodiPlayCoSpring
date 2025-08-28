package com.codiPlayCo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "juegos")
public class Juego {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titulo;
	private String descripcion;
	private String tipoJuego;
	private Integer puntosCompletados;
	private String dificultad;

	@ManyToOne
	private Docente Docente;

	public Juego() {

	}

	public Juego(Integer id, String titulo, String descripcion, String tipoJuego, Integer puntosCompletados,
			String dificultad, com.codiPlayCo.model.Docente docente) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.tipoJuego = tipoJuego;
		this.puntosCompletados = puntosCompletados;
		this.dificultad = dificultad;
		Docente = docente;
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

	public String getTipoJuego() {
		return tipoJuego;
	}

	public void setTipoJuego(String tipoJuego) {
		this.tipoJuego = tipoJuego;
	}

	public Integer getPuntosCompletados() {
		return puntosCompletados;
	}

	public void setPuntosCompletados(Integer puntosCompletados) {
		this.puntosCompletados = puntosCompletados;
	}

	public String getDificultad() {
		return dificultad;
	}

	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}

	public Docente getDocente() {
		return Docente;
	}

	public void setDocente(Docente docente) {
		Docente = docente;
	}

	@Override
	public String toString() {
		return "juego [id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + ", tipoJuego=" + tipoJuego
				+ ", puntosCompletados=" + puntosCompletados + ", dificultad=" + dificultad + "]";
	}

}
