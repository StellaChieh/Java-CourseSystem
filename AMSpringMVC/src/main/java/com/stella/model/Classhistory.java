package com.stella.model;
// Generated May 18, 2017 2:04:49 PM by Hibernate Tools 5.2.3.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Classhistory generated by hbm2java
 */
@Entity
@Table(name = "classhistory", catalog = "fitsignalsvc")
public class Classhistory implements java.io.Serializable {

	private Integer seqId;
	private int custId;
	private int companyId;
	private String classId;
	private String className;
	private Date startdate;
	private Date enddate;
	private Date joindate;
	private Date leavedate;
	private String status;

	public Classhistory() {
	}

	public Classhistory(int custId, int companyId, String classId, String className, Date startdate, Date enddate,
			String status) {
		this.custId = custId;
		this.companyId = companyId;
		this.classId = classId;
		this.className = className;
		this.startdate = startdate;
		this.enddate = enddate;
		this.status = status;
	}

	public Classhistory(int custId, int companyId, String classId, String className, Date startdate, Date enddate,
			Date joindate, Date leavedate, String status) {
		this.custId = custId;
		this.companyId = companyId;
		this.classId = classId;
		this.className = className;
		this.startdate = startdate;
		this.enddate = enddate;
		this.joindate = joindate;
		this.leavedate = leavedate;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "seq_id", unique = true, nullable = false)
	public Integer getSeqId() {
		return this.seqId;
	}

	public void setSeqId(Integer seqId) {
		this.seqId = seqId;
	}

	@Column(name = "cust_id", nullable = false)
	public int getCustId() {
		return this.custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	@Column(name = "company_id", nullable = false)
	public int getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	@Column(name = "class_id", nullable = false, length = 10)
	public String getClassId() {
		return this.classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	@Column(name = "class_name", nullable = false, length = 50)
	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "startdate", nullable = false, length = 19)
	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "enddate", nullable = false, length = 19)
	public Date getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "joindate", length = 19)
	public Date getJoindate() {
		return this.joindate;
	}

	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "leavedate", length = 19)
	public Date getLeavedate() {
		return this.leavedate;
	}

	public void setLeavedate(Date leavedate) {
		this.leavedate = leavedate;
	}

	@Column(name = "status", nullable = false, length = 2)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}