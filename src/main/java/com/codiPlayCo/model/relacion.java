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
public class relacion {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer idCliente;
	private Date fechaRelacion;
	
	@ManyToOne
	private usuario usuario;

	public relacion() {
	
	}

	public relacion(Integer id, Integer idCliente, Date fechaRelacion, usuario usuario) {
		super();
		this.id = id;
		this.idCliente = idCliente;
		this.fechaRelacion = fechaRelacion;
		this.usuario = usuario;
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

	public usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "relacion [id=" + id + ", idCliente=" + idCliente + ", fechaRelacion=" + fechaRelacion + "]";
	}
	
}
