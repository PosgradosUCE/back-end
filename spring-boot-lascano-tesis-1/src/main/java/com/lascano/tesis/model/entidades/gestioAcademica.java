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
@Table(name="gestioacademica")
public class gestioAcademica implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long id;
	private String promedioGestionAcademica;
	@NotEmpty(message = "no puede estar vacio")
	private String gestionAcademica1;
	@NotEmpty(message = "no puede estar vacio")
	private String gestionAcademica2;
	@NotEmpty(message = "no puede estar vacio")
	private String gestionAcademica3;
	@NotEmpty(message = "no puede estar vacio")
	private String gestionAcademica4;
	@NotEmpty(message = "no puede estar vacio")
	private String gestionAcademica5;
	@NotEmpty(message = "no puede estar vacio")
	private String gestionAcademica6;
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date date;

	public String getPromedioGestionAcademica() {
		return promedioGestionAcademica;
	}

	public void setPromedioGestionAcademica(String promedioGestionAcademica) {
		this.promedioGestionAcademica = promedioGestionAcademica;
	}

	public String getGestionAcademica1() {
		return gestionAcademica1;
	}

	public void setGestionAcademica1(String gestionAcademica1) {
		this.gestionAcademica1 = gestionAcademica1;
	}

	public String getGestionAcademica2() {
		return gestionAcademica2;
	}

	public void setGestionAcademica2(String gestionAcademica2) {
		this.gestionAcademica2 = gestionAcademica2;
	}

	public String getGestionAcademica3() {
		return gestionAcademica3;
	}

	public void setGestionAcademica3(String gestionAcademica3) {
		this.gestionAcademica3 = gestionAcademica3;
	}

	public String getGestionAcademica4() {
		return gestionAcademica4;
	}

	public void setGestionAcademica4(String gestionAcademica4) {
		this.gestionAcademica4 = gestionAcademica4;
	}

	public String getGestionAcademica5() {
		return gestionAcademica5;
	}

	public void setGestionAcademica5(String gestionAcademica5) {
		this.gestionAcademica5 = gestionAcademica5;
	}

	public String getGestionAcademica6() {
		return gestionAcademica6;
	}

	public void setGestionAcademica6(String gestionAcademica6) {
		this.gestionAcademica6 = gestionAcademica6;
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
