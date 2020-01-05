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
@Table(name="politicastitulacion")
public class politicasTitulacion implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long id;
	private String promedioPoliticasTitulacion;
	@NotEmpty(message = "no puede estar vacio")
	private String politicasTitulacion1;
	@NotEmpty(message = "no puede estar vacio")
	private String politicasTitulacion2;
	@NotEmpty(message = "no puede estar vacio")
	private String politicasTitulacion3;
	@NotEmpty(message = "no puede estar vacio")
	private String politicasTitulacion4;
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date date;

	public String getPromedioPoliticasTitulacion() {
		return promedioPoliticasTitulacion;
	}

	public void setPromedioPoliticasTitulacion(String promedioPoliticasTitulacion) {
		this.promedioPoliticasTitulacion = promedioPoliticasTitulacion;
	}

	public String getPoliticasTitulacion1() {
		return politicasTitulacion1;
	}

	public void setPoliticasTitulacion1(String politicasTitulacion1) {
		this.politicasTitulacion1 = politicasTitulacion1;
	}

	public String getPoliticasTitulacion2() {
		return politicasTitulacion2;
	}

	public void setPoliticasTitulacion2(String politicasTitulacion2) {
		this.politicasTitulacion2 = politicasTitulacion2;
	}

	public String getPoliticasTitulacion3() {
		return politicasTitulacion3;
	}

	public void setPoliticasTitulacion3(String politicasTitulacion3) {
		this.politicasTitulacion3 = politicasTitulacion3;
	}

	public String getPoliticasTitulacion4() {
		return politicasTitulacion4;
	}

	public void setPoliticasTitulacion4(String politicasTitulacion4) {
		this.politicasTitulacion4 = politicasTitulacion4;
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
