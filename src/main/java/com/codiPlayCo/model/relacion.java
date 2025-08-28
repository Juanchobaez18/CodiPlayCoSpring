package com.codiPlayCo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="relaciones")
public class Relacion {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer idCliente;
	private Date fechaRelacion;
	
	@ManyToOne
	private Usuario Usuario;

	public Relacion() {
	
	}

	public Relacion(Integer id, Integer idCliente, Date fechaRelacion, Usuario Usuario) {
		super();
		this.id = id;
		this.idCliente = idCliente;
		this.fechaRelacion = fechaRelacion;
		this.Usuario = Usuario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Date getFechaRelacion() {
		return fechaRelacion;
	}

	public void setFechaRelacion(Date fechaRelacion) {
		this.fechaRelacion = fechaRelacion;
	}

	public Usuario getUsuario() {
		return Usuario;
	}

	public void setUsuario(Usuario Usuario) {
		this.Usuario = Usuario;
	}

	@Override
	public String toString() {
		return "relacion [id=" + id + ", idCliente=" + idCliente + ", fechaRelacion=" + fechaRelacion + "]";
	}
	
}
