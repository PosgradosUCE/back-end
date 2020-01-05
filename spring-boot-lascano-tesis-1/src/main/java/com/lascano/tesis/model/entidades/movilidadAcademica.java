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
@Table(name="movilidadacademica")
public class movilidadAcademica implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long id;
	private String PromedioMovilidadAcademica;
	@NotEmpty(message = "no puede estar vacio")
	private String movilidadAcademica1;
	@NotEmpty(message = "no puede estar vacio")
	private String movilidadAcademica2;
	@NotEmpty(message = "no puede estar vacio")
	private String movilidadAcademica3;
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date date;

	public String getPromedioMovilidadAcademica() {
		return PromedioMovilidadAcademica;
	}

	public void setPromedioMovilidadAcademica(String promedioMovilidadAcademica) {
		PromedioMovilidadAcademica = promedioMovilidadAcademica;
	}

	public String getMovilidadAcademica1() {
		return movilidadAcademica1;
	}

	public void setMovilidadAcademica1(String movilidadAcademica1) {
		this.movilidadAcademica1 = movilidadAcademica1;
	}

	public String getMovilidadAcademica2() {
		return movilidadAcademica2;
	}

	public void setMovilidadAcademica2(String movilidadAcademica2) {
		this.movilidadAcademica2 = movilidadAcademica2;
	}

	public String getMovilidadAcademica3() {
		return movilidadAcademica3;
	}

	public void setMovilidadAcademica3(String movilidadAcademica3) {
		this.movilidadAcademica3 = movilidadAcademica3;
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
