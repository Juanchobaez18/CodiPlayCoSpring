package com.codiPlayCo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "miembrosGrupos")
public class miembrosGrupo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Date fechaUnion;
	
	
	@ManyToOne
	private grupoClase grupoclase;
	
	@ManyToOne
	private usuario usuario;

	public miembrosGrupo() {
	
	}

	public miembrosGrupo(Integer id, Date fechaUnion, grupoClase grupoclase, usuario usuario) {
		super();
		this.id = id;
		this.fechaUnion = fechaUnion;
		this.grupoclase = grupoclase;
		this.usuario = usuario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFechaUnion() {
		return fechaUnion;
	}

	public void setFechaUnion(Date fechaUnion) {
		this.fechaUnion = fechaUnion;
	}

	public grupoClase getGrupoclase() {
		return grupoclase;
	}

	public void setGrupoclase(grupoClase grupoclase) {
		this.grupoclase = grupoclase;
	}

	public usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "miembrosGrupo [id=" + id + ", fechaUnion=" + fechaUnion + "]";
	}
	
	
}
