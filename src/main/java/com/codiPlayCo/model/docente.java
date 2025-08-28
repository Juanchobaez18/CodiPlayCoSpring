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
public class Docente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String listaestudiantes;
	private String listanotas;

	@ManyToOne
	private Usuario Usuario;

	@ManyToOne
	private GrupoClase GrupoClase;

	public Docente() {

	}

	public Docente(Integer id, String listaestudiantes, String listanotas, Usuario Usuario,
			List<com.codiPlayCo.model.GrupoClase> GrupoClase) {
		super();
		this.id = id;
		this.listaestudiantes = listaestudiantes;
		this.listanotas = listanotas;
		this.Usuario = Usuario;

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
		return Usuario;
	}

	public void setUsuario(Usuario Usuario) {
		this.Usuario = Usuario;
	}

	@Override
	public String toString() {
		return "docente [id=" + id + ", listaestudiantes=" + listaestudiantes + ", listanotas=" + listanotas + "]";
	}

}
