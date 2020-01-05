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
@Table(name="planmicrocurricular")
public class planMicrocurricular implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long id;
	private String promedioPlanMicrocurricular;
	@NotEmpty(message = "no puede estar vacio")
	private String planMicrocurricular1;
	@NotEmpty(message = "no puede estar vacio")
	private String planMicrocurricular2;
	@NotEmpty(message = "no puede estar vacio")
	private String planMicrocurricular3;
	@NotEmpty(message = "no puede estar vacio")
	private String planMicrocurricular4;
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date date;

	public String getPromedioPlanMicrocurricular() {
		return promedioPlanMicrocurricular;
	}

	public void setPromedioPlanMicrocurricular(String promedioPlanMicrocurricular) {
		this.promedioPlanMicrocurricular = promedioPlanMicrocurricular;
	}

	public String getPlanMicrocurricular1() {
		return planMicrocurricular1;
	}

	public void setPlanMicrocurricular1(String planMicrocurricular1) {
		this.planMicrocurricular1 = planMicrocurricular1;
	}

	public String getPlanMicrocurricular2() {
		return planMicrocurricular2;
	}

	public void setPlanMicrocurricular2(String planMicrocurricular2) {
		this.planMicrocurricular2 = planMicrocurricular2;
	}

	public String getPlanMicrocurricular3() {
		return planMicrocurricular3;
	}

	public void setPlanMicrocurricular3(String planMicrocurricular3) {
		this.planMicrocurricular3 = planMicrocurricular3;
	}

	public String getPlanMicrocurricular4() {
		return planMicrocurricular4;
	}

	public void setPlanMicrocurricular4(String planMicrocurricular4) {
		this.planMicrocurricular4 = planMicrocurricular4;
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
