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
@Table(name="estructuraprograma")
public class estructuraPrograma implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long id;
	private String promedioEstructuraPrograma;
	@NotEmpty(message = "no puede estar vacio")
	private String estructuraPrograma1;
	@NotEmpty(message = "no puede estar vacio")
	private String estructuraPrograma2;
	@NotEmpty(message = "no puede estar vacio")
	private String estructuraPrograma3;
	@NotEmpty(message = "no puede estar vacio")
	private String estructuraPrograma4;
	@NotEmpty(message = "no puede estar vacio")
	private String estructuraPrograma5;
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date date;

	public String getPromedioEstructuraPrograma() {
		return promedioEstructuraPrograma;
	}

	public void setPromedioEstructuraPrograma(String promedioEstructuraPrograma) {
		this.promedioEstructuraPrograma = promedioEstructuraPrograma;
	}

	public String getEstructuraPrograma1() {
		return estructuraPrograma1;
	}

	public void setEstructuraPrograma1(String estructuraPrograma1) {
		this.estructuraPrograma1 = estructuraPrograma1;
	}

	public String getEstructuraPrograma2() {
		return estructuraPrograma2;
	}

	public void setEstructuraPrograma2(String estructuraPrograma2) {
		this.estructuraPrograma2 = estructuraPrograma2;
	}

	public String getEstructuraPrograma3() {
		return estructuraPrograma3;
	}

	public void setEstructuraPrograma3(String estructuraPrograma3) {
		this.estructuraPrograma3 = estructuraPrograma3;
	}

	public String getEstructuraPrograma4() {
		return estructuraPrograma4;
	}

	public void setEstructuraPrograma4(String estructuraPrograma4) {
		this.estructuraPrograma4 = estructuraPrograma4;
	}

	public String getEstructuraPrograma5() {
		return estructuraPrograma5;
	}

	public void setEstructuraPrograma5(String estructuraPrograma5) {
		this.estructuraPrograma5 = estructuraPrograma5;
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
