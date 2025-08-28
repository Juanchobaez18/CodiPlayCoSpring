package com.codiPlayCo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "estudiantes")
public class Estudiante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	private Usuario Usuario;
	@ManyToOne
	private GrupoClase GrupoClase;

	public Estudiante() {

	}

	public Estudiante(Integer id, Usuario Usuario, List<com.codiPlayCo.model.GrupoClase> GrupoClase) {
		super();
		this.id = id;
		this.Usuario = Usuario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return Usuario;
	}

	public void setUsuario(Usuario Usuario) {
		this.Usuario = Usuario;
	}

	@Override
	public String toString() {
		return "estudiante [id=" + id + "]";
	}

}
