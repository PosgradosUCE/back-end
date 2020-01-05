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
@Table(name="politicasadmision")
public class politicasAdmision implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long id;
	private String promedioPoliticasAdmision;
	@NotEmpty(message = "no puede estar vacio")
	private String politicasAdmision1;
	@NotEmpty(message = "no puede estar vacio")
	private String politicasAdmision2;
	@NotEmpty(message = "no puede estar vacio")
	private String politicasAdmision3;
	@NotEmpty(message = "no puede estar vacio")
	private String politicasAdmision4;
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date date;

	public String getPromedioPoliticasAdmision() {
		return promedioPoliticasAdmision;
	}

	public void setPromedioPoliticasAdmision(String promedioPoliticasAdmision) {
		this.promedioPoliticasAdmision = promedioPoliticasAdmision;
	}

	public String getPoliticasAdmision1() {
		return politicasAdmision1;
	}

	public void setPoliticasAdmision1(String politicasAdmision1) {
		this.politicasAdmision1 = politicasAdmision1;
	}

	public String getPoliticasAdmision2() {
		return politicasAdmision2;
	}

	public void setPoliticasAdmision2(String politicasAdmision2) {
		this.politicasAdmision2 = politicasAdmision2;
	}

	public String getPoliticasAdmision3() {
		return politicasAdmision3;
	}

	public void setPoliticasAdmision3(String politicasAdmision3) {
		this.politicasAdmision3 = politicasAdmision3;
	}

	public String getPoliticasAdmision4() {
		return politicasAdmision4;
	}

	public void setPoliticasAdmision4(String politicasAdmision4) {
		this.politicasAdmision4 = politicasAdmision4;
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
