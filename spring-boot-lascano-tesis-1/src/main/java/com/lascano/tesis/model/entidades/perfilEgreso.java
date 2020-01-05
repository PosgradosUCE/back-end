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
@Table(name="perfilegreso")
public class perfilEgreso implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long id;
	private String promedioPerfilEgreso;
	@NotEmpty(message = "no puede estar vacio")
	private String perfilEgreso1;
	@NotEmpty(message = "no puede estar vacio")
	private String perfilEgreso2;
	@NotEmpty(message = "no puede estar vacio")
	private String perfilEgreso3;
	@NotEmpty(message = "no puede estar vacio")
	private String perfilEgreso4;
	@NotEmpty(message = "no puede estar vacio")
	private String perfilEgreso5;
	@NotEmpty(message = "no puede estar vacio")
	private String perfilEgreso6;
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date date;

	public String getPromedioPerfilEgreso() {
		return promedioPerfilEgreso;
	}

	public void setPromedioPerfilEgreso(String promedioPerfilEgreso) {
		this.promedioPerfilEgreso = promedioPerfilEgreso;
	}

	public String getPerfilEgreso1() {
		return perfilEgreso1;
	}

	public void setPerfilEgreso1(String perfilEgreso1) {
		this.perfilEgreso1 = perfilEgreso1;
	}

	public String getPerfilEgreso2() {
		return perfilEgreso2;
	}

	public void setPerfilEgreso2(String perfilEgreso2) {
		this.perfilEgreso2 = perfilEgreso2;
	}

	public String getPerfilEgreso3() {
		return perfilEgreso3;
	}

	public void setPerfilEgreso3(String perfilEgreso3) {
		this.perfilEgreso3 = perfilEgreso3;
	}

	public String getPerfilEgreso4() {
		return perfilEgreso4;
	}

	public void setPerfilEgreso4(String perfilEgreso4) {
		this.perfilEgreso4 = perfilEgreso4;
	}

	public String getPerfilEgreso5() {
		return perfilEgreso5;
	}

	public void setPerfilEgreso5(String perfilEgreso5) {
		this.perfilEgreso5 = perfilEgreso5;
	}

	public String getPerfilEgreso6() {
		return perfilEgreso6;
	}

	public void setPerfilEgreso6(String perfilEgreso6) {
		this.perfilEgreso6 = perfilEgreso6;
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
