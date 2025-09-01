package com.codiPlayCo.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "asignacionDocentes")
public class AsignacionDocente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer id;
	private Date año;
	private String cursoAsirgnado;
	private Integer idCurso;

	@OneToMany(mappedBy = "asignacionDocente")
	private List<Curso> curso;

	@ManyToOne
	private Usuario usuario;

	public AsignacionDocente() {

	}

	public AsignacionDocente(Integer id, Date año, String cursoAsirgnado, Integer idCurso, List<Curso> curso,
			Usuario usuario) {
		super();
		this.id = id;
		this.año = año;
		this.cursoAsirgnado = cursoAsirgnado;
		this.idCurso = idCurso;
		this.curso = curso;
		this.usuario = usuario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getAño() {
		return año;
	}

	public void setAño(Date año) {
		this.año = año;
	}

	public String getCursoAsirgnado() {
		return cursoAsirgnado;
	}

	public void setCursoAsirgnado(String cursoAsirgnado) {
		this.cursoAsirgnado = cursoAsirgnado;
	}

	public Integer getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}

	public List<Curso> getCurso() {
		return curso;
	}

	public void setCurso(List<Curso> curso) {
		this.curso = curso;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "AsignacionDocente [id=" + id + ", año=" + año + ", cursoAsirgnado=" + cursoAsirgnado + ", idCurso="
				+ idCurso + "]";
	}

}
