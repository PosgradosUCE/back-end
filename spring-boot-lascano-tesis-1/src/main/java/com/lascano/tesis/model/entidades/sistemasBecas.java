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
@Table(name="sistemasbecas")
public class sistemasBecas implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long id;
	private String promedioSistemasBecas;
	@NotEmpty(message = "no puede estar vacio")
	private String sistemasBecas1;
	@NotEmpty(message = "no puede estar vacio")
	private String sistemasBecas2;
	@NotEmpty(message = "no puede estar vacio")
	private String sistemasBecas3;
	@NotEmpty(message = "no puede estar vacio")
	private String sistemasBecas4;
	@NotNull(message="no puede estar vacio")
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date date;

	public String getPromedioSistemasBecas() {
		return promedioSistemasBecas;
	}

	public void setPromedioSistemasBecas(String promedioSistemasBecas) {
		this.promedioSistemasBecas = promedioSistemasBecas;
	}

	public String getSistemasBecas1() {
		return sistemasBecas1;
	}

	public void setSistemasBecas1(String sistemasBecas1) {
		this.sistemasBecas1 = sistemasBecas1;
	}

	public String getSistemasBecas2() {
		return sistemasBecas2;
	}

	public void setSistemasBecas2(String sistemasBecas2) {
		this.sistemasBecas2 = sistemasBecas2;
	}

	public String getSistemasBecas3() {
		return sistemasBecas3;
	}

	public void setSistemasBecas3(String sistemasBecas3) {
		this.sistemasBecas3 = sistemasBecas3;
	}

	public String getSistemasBecas4() {
		return sistemasBecas4;
	}

	public void setSistemasBecas4(String sistemasBecas4) {
		this.sistemasBecas4 = sistemasBecas4;
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
