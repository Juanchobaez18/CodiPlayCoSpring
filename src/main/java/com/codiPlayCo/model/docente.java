package com.codiPlayCo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "docentes")
public class docente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String listaestudiantes;
	private String listanotas;
	
	@ManyToOne
	private Usuario usuario;
	
	@ManyToOne
	private List<grupoClase> grupoClase;
	
	public docente() {

	}


	public docente(Integer id, String listaestudiantes, String listanotas, Usuario usuario,
			List<com.codiPlayCo.model.grupoClase> grupoClase) {
		super();
		this.id = id;
		this.listaestudiantes = listaestudiantes;
		this.listanotas = listanotas;
		this.usuario = usuario;
		this.grupoClase = grupoClase;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getListaestudiantes() {
		return listaestudiantes;
	}


	public void setListaestudiantes(String listaestudiantes) {
		this.listaestudiantes = listaestudiantes;
	}


	public String getListanotas() {
		return listanotas;
	}


	public void setListanotas(String listanotas) {
		this.listanotas = listanotas;
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
		return "docente [id=" + id + ", listaestudiantes=" + listaestudiantes + ", listanotas=" + listanotas + "]";
	}
	
	
	
	
	
	

}
