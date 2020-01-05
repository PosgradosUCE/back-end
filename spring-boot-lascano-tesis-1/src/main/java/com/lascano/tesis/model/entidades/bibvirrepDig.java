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
@Table(name="bibvirrepdig")
public class bibvirrepDig implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long id;
	private String promedioBibvirrepDig;
	@NotEmpty(message = "no puede estar vacio")
	private String bibvirrepDig1;
	@NotEmpty(message = "no puede estar vacio")
	private String bibvirrepDig2;
	@NotEmpty(message = "no puede estar vacio")
	private String bibvirrepDig3;
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date date;

	public String getPromedioBibvirrepDig() {
		return promedioBibvirrepDig;
	}

	public void setPromedioBibvirrepDig(String promedioBibvirrepDig) {
		this.promedioBibvirrepDig = promedioBibvirrepDig;
	}

	public String getBibvirrepDig1() {
		return bibvirrepDig1;
	}

	public void setBibvirrepDig1(String bibvirrepDig1) {
		this.bibvirrepDig1 = bibvirrepDig1;
	}

	public String getBibvirrepDig2() {
		return bibvirrepDig2;
	}

	public void setBibvirrepDig2(String bibvirrepDig2) {
		this.bibvirrepDig2 = bibvirrepDig2;
	}

	public String getBibvirrepDig3() {
		return bibvirrepDig3;
	}

	public void setBibvirrepDig3(String bibvirrepDig3) {
		this.bibvirrepDig3 = bibvirrepDig3;
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
