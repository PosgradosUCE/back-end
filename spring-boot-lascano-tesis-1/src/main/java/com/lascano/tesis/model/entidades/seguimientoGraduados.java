package com.lascano.tesis.model.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="seguimientograduados")
public class seguimientoGraduados implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long id;
	private String promedioSeguimientoGraduados;
	@NotEmpty(message = "no puede estar vacio")
	private String seguimientoGraduados1;
	@NotEmpty(message = "no puede estar vacio")
	private String seguimientoGraduados2;
	@NotEmpty(message = "no puede estar vacio")
	private String seguimientoGraduados3;
	@NotEmpty(message = "no puede estar vacio")
	private String seguimientoGraduados4;
	@NotEmpty(message = "no puede estar vacio")
	private String seguimientoGraduados5;
	@NotEmpty(message = "no puede estar vacio")
	private String seguimientoGraduados6;
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date date;

	public String getPromedioSeguimientoGraduados() {
		return promedioSeguimientoGraduados;
	}

	public void setPromedioSeguimientoGraduados(String promedioSeguimientoGraduados) {
		this.promedioSeguimientoGraduados = promedioSeguimientoGraduados;
	}

	public String getSeguimientoGraduados1() {
		return seguimientoGraduados1;
	}

	public void setSeguimientoGraduados1(String seguimientoGraduados1) {
		this.seguimientoGraduados1 = seguimientoGraduados1;
	}

	public String getSeguimientoGraduados2() {
		return seguimientoGraduados2;
	}

	public void setSeguimientoGraduados2(String seguimientoGraduados2) {
		this.seguimientoGraduados2 = seguimientoGraduados2;
	}

	public String getSeguimientoGraduados3() {
		return seguimientoGraduados3;
	}

	public void setSeguimientoGraduados3(String seguimientoGraduados3) {
		this.seguimientoGraduados3 = seguimientoGraduados3;
	}

	public String getSeguimientoGraduados4() {
		return seguimientoGraduados4;
	}

	public void setSeguimientoGraduados4(String seguimientoGraduados4) {
		this.seguimientoGraduados4 = seguimientoGraduados4;
	}

	public String getSeguimientoGraduados5() {
		return seguimientoGraduados5;
	}

	public void setSeguimientoGraduados5(String seguimientoGraduados5) {
		this.seguimientoGraduados5 = seguimientoGraduados5;
	}

	public String getSeguimientoGraduados6() {
		return seguimientoGraduados6;
	}

	public void setSeguimientoGraduados6(String seguimientoGraduados6) {
		this.seguimientoGraduados6 = seguimientoGraduados6;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
