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

@Entity
@Table(name="cpa")
public class cpa implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long id;
	private String cpa;
	@NotEmpty(message = "no puede estar vacio")
	private String phdl;
	@NotEmpty(message = "no puede estar vacio")
	private String mscl;
	@NotEmpty(message = "no puede estar vacio")
	private String phd;
	@NotEmpty(message = "no puede estar vacio")
	private String msc;
	@NotEmpty(message = "no puede estar vacio")
	private String tp;
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date date;

	
	public String getCpa() {
		return cpa;
	}

	public void setCpa(String cpa) {
		this.cpa = cpa;
	}

	public String getPhdl() {
		return phdl;
	}

	public void setPhdl(String phdl) {
		this.phdl = phdl;
	}

	public String getMscl() {
		return mscl;
	}

	public void setMscl(String mscl) {
		this.mscl = mscl;
	}

	public String getPhd() {
		return phd;
	}

	public void setPhd(String phd) {
		this.phd = phd;
	}

	public String getMsc() {
		return msc;
	}

	public void setMsc(String msc) {
		this.msc = msc;
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
