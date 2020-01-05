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
@Table(name="participacionredes")
public class participacionRedes implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long id;
	private String promedioParticipacionRedes;
	@NotEmpty(message = "no puede estar vacio")
	private String participacionRedes1;
	@NotEmpty(message = "no puede estar vacio")
	private String participacionRedes2;
	@NotEmpty(message = "no puede estar vacio")
	private String participacionRedes3;
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date date;

	public String getPromedioParticipacionRedes() {
		return promedioParticipacionRedes;
	}

	public void setPromedioParticipacionRedes(String promedioParticipacionRedes) {
		this.promedioParticipacionRedes = promedioParticipacionRedes;
	}

	public String getParticipacionRedes1() {
		return participacionRedes1;
	}

	public void setParticipacionRedes1(String participacionRedes1) {
		this.participacionRedes1 = participacionRedes1;
	}

	public String getParticipacionRedes2() {
		return participacionRedes2;
	}

	public void setParticipacionRedes2(String participacionRedes2) {
		this.participacionRedes2 = participacionRedes2;
	}

	public String getParticipacionRedes3() {
		return participacionRedes3;
	}

	public void setParticipacionRedes3(String participacionRedes3) {
		this.participacionRedes3 = participacionRedes3;
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
