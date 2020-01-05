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
@Table(name="planestudios")
public class planEstudios implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long id;
	private String promedioPlanEstudios;
	@NotEmpty(message = "no puede estar vacio")
	private String planEstudios1;
	@NotEmpty(message = "no puede estar vacio")
	private String planEstudios2;
	@NotEmpty(message = "no puede estar vacio")
	private String planEstudios3;
	@NotEmpty(message = "no puede estar vacio")
	private String planEstudios4;
	@NotEmpty(message = "no puede estar vacio")
	private String planEstudios5;
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date date;

	public String getPromedioPlanEstudios() {
		return promedioPlanEstudios;
	}

	public void setPromedioPlanEstudios(String promedioPlanEstudios) {
		this.promedioPlanEstudios = promedioPlanEstudios;
	}

	public String getPlanEstudios1() {
		return planEstudios1;
	}

	public void setPlanEstudios1(String planEstudios1) {
		this.planEstudios1 = planEstudios1;
	}

	public String getPlanEstudios2() {
		return planEstudios2;
	}

	public void setPlanEstudios2(String planEstudios2) {
		this.planEstudios2 = planEstudios2;
	}

	public String getPlanEstudios3() {
		return planEstudios3;
	}

	public void setPlanEstudios3(String planEstudios3) {
		this.planEstudios3 = planEstudios3;
	}

	public String getPlanEstudios4() {
		return planEstudios4;
	}

	public void setPlanEstudios4(String planEstudios4) {
		this.planEstudios4 = planEstudios4;
	}

	public String getPlanEstudios5() {
		return planEstudios5;
	}

	public void setPlanEstudios5(String planEstudios5) {
		this.planEstudios5 = planEstudios5;
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
