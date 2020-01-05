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
@Table(name="gruposinvestigacion")
public class gruposInvestigacion implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long id;
	private String promedioGruposInvestigacion;
	@NotEmpty(message = "no puede estar vacio")
	private String gruposInvestigacion1;
	@NotEmpty(message = "no puede estar vacio")
	private String gruposInvestigacion2;
	@NotEmpty(message = "no puede estar vacio")
	private String gruposInvestigacion3;
	@NotEmpty(message = "no puede estar vacio")
	private String gruposInvestigacion4;
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date date;

	public String getPromedioGruposInvestigacion() {
		return promedioGruposInvestigacion;
	}

	public void setPromedioGruposInvestigacion(String promedioGruposInvestigacion) {
		this.promedioGruposInvestigacion = promedioGruposInvestigacion;
	}

	public String getGruposInvestigacion1() {
		return gruposInvestigacion1;
	}

	public void setGruposInvestigacion1(String gruposInvestigacion1) {
		this.gruposInvestigacion1 = gruposInvestigacion1;
	}

	public String getGruposInvestigacion2() {
		return gruposInvestigacion2;
	}

	public void setGruposInvestigacion2(String gruposInvestigacion2) {
		this.gruposInvestigacion2 = gruposInvestigacion2;
	}

	public String getGruposInvestigacion3() {
		return gruposInvestigacion3;
	}

	public void setGruposInvestigacion3(String gruposInvestigacion3) {
		this.gruposInvestigacion3 = gruposInvestigacion3;
	}

	public String getGruposInvestigacion4() {
		return gruposInvestigacion4;
	}

	public void setGruposInvestigacion4(String gruposInvestigacion4) {
		this.gruposInvestigacion4 = gruposInvestigacion4;
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
