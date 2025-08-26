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
public class estudiante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	private usuario usuario;
	@ManyToOne
	private grupoClase grupoClase;

	public estudiante() {

	}

	public estudiante(Integer id, usuario usuario, List<com.codiPlayCo.model.grupoClase> grupoClase) {
		super();
		this.id = id;
		this.usuario = usuario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "estudiante [id=" + id + "]";
	}

}
