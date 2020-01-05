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
@Table(name="tpm")
public class tpm implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long id;
	private String tpm;
	@NotEmpty(message = "no puede estar vacio")
	private String ter;
	@NotEmpty(message = "no puede estar vacio")
	private String te;
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date date;
	
	

	public String getTpm() {
		return tpm;
	}



	public void setTpm(String tpm) {
		this.tpm = tpm;
	}



	public String getTer() {
		return ter;
	}



	public void setTer(String ter) {
		this.ter = ter;
	}



	public String getTe() {
		return te;
	}



	public void setTe(String te) {
		this.te = te;
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
