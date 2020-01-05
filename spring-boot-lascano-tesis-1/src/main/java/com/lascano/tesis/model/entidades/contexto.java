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
@Table(name="contexto")
public class contexto implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long id;
	private String promedioContext;
	@NotEmpty(message = "no puede estar vacio")
	private String context1;
	@NotEmpty(message = "no puede estar vacio")
	private String context2;
	@NotEmpty(message = "no puede estar vacio")
	private String context3;
	@NotEmpty(message = "no puede estar vacio")
	private String context4;
	@NotEmpty(message = "no puede estar vacio")
	private String context5;
	@NotEmpty(message = "no puede estar vacio")
	private String context6;
	@NotEmpty(message = "no puede estar vacio")
	private String context7;
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date date;

	public String getPromedioContext() {
		return promedioContext;
	}

	public void setPromedioContext(String promedioContext) {
		this.promedioContext = promedioContext;
	}

	public String getContext1() {
		return context1;
	}

	public void setContext1(String context1) {
		this.context1 = context1;
	}

	public String getContext2() {
		return context2;
	}

	public void setContext2(String context2) {
		this.context2 = context2;
	}

	public String getContext3() {
		return context3;
	}

	public void setContext3(String context3) {
		this.context3 = context3;
	}

	public String getContext4() {
		return context4;
	}

	public void setContext4(String context4) {
		this.context4 = context4;
	}

	public String getContext5() {
		return context5;
	}

	public void setContext5(String context5) {
		this.context5 = context5;
	}

	public String getContext6() {
		return context6;
	}

	public void setContext6(String context6) {
		this.context6 = context6;
	}

	public String getContext7() {
		return context7;
	}

	public void setContext7(String context7) {
		this.context7 = context7;
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
