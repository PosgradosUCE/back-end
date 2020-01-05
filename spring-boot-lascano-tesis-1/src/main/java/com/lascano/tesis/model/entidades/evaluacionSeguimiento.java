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
@Table(name="evaluacionseguimiento")
public class evaluacionSeguimiento implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long id;
	private String promedioEvaluacionSeguimiento;
	@NotEmpty(message = "no puede estar vacio")
	private String evaluacionSeguimiento1;
	@NotEmpty(message = "no puede estar vacio")
	private String evaluacionSeguimiento2;
	@NotEmpty(message = "no puede estar vacio")
	private String evaluacionSeguimiento3;
	@NotEmpty(message = "no puede estar vacio")
	private String evaluacionSeguimiento4;
	@NotEmpty(message = "no puede estar vacio")
	private String evaluacionSeguimiento5;
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date date;

	public String getPromedioEvaluacionSeguimiento() {
		return promedioEvaluacionSeguimiento;
	}

	public void setPromedioEvaluacionSeguimiento(String promedioEvaluacionSeguimiento) {
		this.promedioEvaluacionSeguimiento = promedioEvaluacionSeguimiento;
	}

	public String getEvaluacionSeguimiento1() {
		return evaluacionSeguimiento1;
	}

	public void setEvaluacionSeguimiento1(String evaluacionSeguimiento1) {
		this.evaluacionSeguimiento1 = evaluacionSeguimiento1;
	}

	public String getEvaluacionSeguimiento2() {
		return evaluacionSeguimiento2;
	}

	public void setEvaluacionSeguimiento2(String evaluacionSeguimiento2) {
		this.evaluacionSeguimiento2 = evaluacionSeguimiento2;
	}

	public String getEvaluacionSeguimiento3() {
		return evaluacionSeguimiento3;
	}

	public void setEvaluacionSeguimiento3(String evaluacionSeguimiento3) {
		this.evaluacionSeguimiento3 = evaluacionSeguimiento3;
	}

	public String getEvaluacionSeguimiento4() {
		return evaluacionSeguimiento4;
	}

	public void setEvaluacionSeguimiento4(String evaluacionSeguimiento4) {
		this.evaluacionSeguimiento4 = evaluacionSeguimiento4;
	}

	public String getEvaluacionSeguimiento5() {
		return evaluacionSeguimiento5;
	}

	public void setEvaluacionSeguimiento5(String evaluacionSeguimiento5) {
		this.evaluacionSeguimiento5 = evaluacionSeguimiento5;
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
