package com.stella.model;
// Generated May 18, 2017 2:04:49 PM by Hibernate Tools 5.2.3.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Accountvalidaty generated by hbm2java
 */
@Entity
@Table(name = "accountvalidaty", catalog = "fitsignalsvc")
public class Accountvalidaty implements java.io.Serializable {

	private Integer id;
	private String custId;
	private Date validaty;

	public Accountvalidaty() {
	}

	public Accountvalidaty(String custId, Date validaty) {
		this.custId = custId;
		this.validaty = validaty;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	@Column(name = "cust_id", nullable = false, length = 45)
	public String getCustId() {
		return this.custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "validaty", nullable = false, length = 19)
	public Date getValidaty() {
		return this.validaty;
	}

	public void setValidaty(Date validaty) {
		this.validaty = validaty;
	}

}
