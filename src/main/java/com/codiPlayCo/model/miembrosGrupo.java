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
public class MiembrosGrupo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Date fechaUnion;
	
	
	@ManyToOne
	private GrupoClase grupoclase;
	
	@ManyToOne
	private Usuario Usuario;

	public MiembrosGrupo() {
	
	}

	public MiembrosGrupo(Integer id, Date fechaUnion, GrupoClase grupoclase, Usuario Usuario) {
		super();
		this.id = id;
		this.fechaUnion = fechaUnion;
		this.grupoclase = grupoclase;
		this.Usuario = Usuario;
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

	public GrupoClase getGrupoclase() {
		return grupoclase;
	}

	public void setGrupoclase(GrupoClase grupoclase) {
		this.grupoclase = grupoclase;
	}

	public Usuario getUsuario() {
		return Usuario;
	}

	public void setUsuario(Usuario Usuario) {
		this.Usuario = Usuario;
	}

	@Override
	public String toString() {
		return "miembrosGrupo [id=" + id + ", fechaUnion=" + fechaUnion + "]";
	}
	
	
}
