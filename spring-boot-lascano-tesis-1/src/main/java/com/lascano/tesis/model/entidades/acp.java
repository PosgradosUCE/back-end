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
@Table(name="acp")
public class acp implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long id;
	private String acp;
	@NotEmpty(message = "no puede estar vacio")
	private String ndad;
	@NotEmpty(message = "no puede estar vacio")
	private String tp;
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date date;

	public String getAcp() {
		return acp;
	}

	public void setAcp(String acp) {
		this.acp = acp;
	}

	public String getNdad() {
		return ndad;
	}

	public void setNdad(String ndad) {
		this.ndad = ndad;
	}

	public String getTp() {
		return tp;
	}

	public void setTp(String tp) {
		this.tp = tp;
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
