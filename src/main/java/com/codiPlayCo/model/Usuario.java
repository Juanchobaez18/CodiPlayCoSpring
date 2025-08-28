package com.codiPlayCo.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String apellido;
	private String email;
	private String password;
	private Date fechaNacimiento;
	private Date fecharegistro;
	private Date ultimoAcceso;
	private Boolean activo;
	private String avatar;

	public Usuario() {

	}

	public Usuario(Integer id, String nombre, String apellido, String email, String password, Date fechaNacimiento,
			Date fecharegistro, Date ultimoAcceso, Boolean activo, String avatar) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.password = password;
		this.fechaNacimiento = fechaNacimiento;
		this.fecharegistro = fecharegistro;
		this.ultimoAcceso = ultimoAcceso;
		this.activo = activo;
		this.avatar = avatar;
	}

	// relaciones basedatos

	@OneToMany(mappedBy = "usuario")
	private List<Relacion> relaciones;

	@OneToMany(mappedBy = "usuario")
	private List<ProgresoEjercicio> ProgresoEjercicios;

	@OneToMany(mappedBy = "usuario")
	private List<MiembrosGrupo> miembroGrupos;

	@OneToMany(mappedBy = "usuario")
	private List<Estudiante> Estudiantes;

	@OneToMany(mappedBy = "usuario")
	private List<Docente> Docentes;

	@ManyToOne
	private Rol Rol;

	@OneToMany(mappedBy = "usuario")
	private List<ProcesoLeccion> procesoLecciones;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getFecharegistro() {
		return fecharegistro;
	}

	public void setFecharegistro(Date fecharegistro) {
		this.fecharegistro = fecharegistro;
	}

	public Date getUltimoAcceso() {
		return ultimoAcceso;
	}

	public void setUltimoAcceso(Date ultimoAcceso) {
		this.ultimoAcceso = ultimoAcceso;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", password=" + password + ", fechaNacimiento=" + fechaNacimiento + ", fecharegistro=" + fecharegistro
				+ ", ultimoAcceso=" + ultimoAcceso + ", activo=" + activo + ", avatar=" + avatar + "]";
	}

}
