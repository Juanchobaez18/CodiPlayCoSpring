package com.codiPlayCo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity 
@Table(name="estudiantes")
public class estudiante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@ManyToOne
	private Usuario usuario;
	@ManyToOne
	private List<grupoClase>grupoClase;
	
	
	public estudiante() {
	
	}


	public estudiante(Integer id, Usuario usuario, List<com.codiPlayCo.model.grupoClase> grupoClase) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.grupoClase = grupoClase;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public List<grupoClase> getGrupoClase() {
		return grupoClase;
	}


	public void setGrupoClase(List<grupoClase> grupoClase) {
		this.grupoClase = grupoClase;
	}


	@Override
	public String toString() {
		return "estudiante [id=" + id + "]";
	}
	
	
	

}
