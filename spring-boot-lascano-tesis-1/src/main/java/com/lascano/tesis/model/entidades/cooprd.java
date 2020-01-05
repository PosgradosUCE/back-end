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
@Table(name="cooprd")
public class cooprd implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long id;
	private String cooprd;
	@NotEmpty(message = "no puede estar vacio")
	private String tacl;
	@NotEmpty(message = "no puede estar vacio")
	private String tac;
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date date;

	public String getCooprd() {
		return cooprd;
	}

	public void setCooprd(String cooprd) {
		this.cooprd = cooprd;
	}

	public String getTacl() {
		return tacl;
	}

	public void setTacl(String tacl) {
		this.tacl = tacl;
	}

	public String getTac() {
		return tac;
	}

	public void setTac(String tac) {
		this.tac = tac;
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
