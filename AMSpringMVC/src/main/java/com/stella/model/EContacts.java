package com.stella.model;
// Generated May 18, 2017 2:04:49 PM by Hibernate Tools 5.2.3.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * EContacts generated by hbm2java
 */
@Entity
@Table(name = "e_contacts", catalog = "fitsignalsvc")
public class EContacts implements java.io.Serializable {

	private int custId;
	private Integer custTypeId;
	private String custCode;
	private String custName;
	private String custNikename;
	private Integer companySrc;
	private Integer companyId;
	private String gender;
	private Date birthday;
	private Integer marital;
	private Integer childs;
	private Integer education;
	private String custCompany;
	private String custDept;
	private String job;
	private String businessNo1;
	private String businessNo2;
	private String faxNo;
	private String custAddress;
	private String deliverAddress;
	private String invoiceAddress;
	private String contacterEmail;
	private String custWww;
	private String custAddrZip;
	private String deliverAddrZip;
	private String invoiceAddrZip;
	private String custPhone1;
	private String custPhone2;
	private String custPhone3;
	private String custMphone1;
	private String custMphone2;
	private String descript;
	private Integer creater;
	private Date createtime;
	private Integer updater;
	private Date updatetime;
	private String descissue;
	private String contimg;
	private String datacomefrom;
	private String pwd;
	private String productsno;
	private String tid;
	private Date tiddatetime;
	private Integer custMphoneN;
	private String custMphoneP;
	private String mailValid;

	public EContacts() {
	}

	public EContacts(int custId) {
		this.custId = custId;
	}

	public EContacts(int custId, Integer custTypeId, String custCode, String custName, String custNikename,
			Integer companySrc, Integer companyId, String gender, Date birthday, Integer marital, Integer childs,
			Integer education, String custCompany, String custDept, String job, String businessNo1, String businessNo2,
			String faxNo, String custAddress, String deliverAddress, String invoiceAddress, String contacterEmail,
			String custWww, String custAddrZip, String deliverAddrZip, String invoiceAddrZip, String custPhone1,
			String custPhone2, String custPhone3, String custMphone1, String custMphone2, String descript,
			Integer creater, Date createtime, Integer updater, Date updatetime, String descissue, String contimg,
			String datacomefrom, String pwd, String productsno, String tid, Date tiddatetime, Integer custMphoneN,
			String custMphoneP, String mailValid) {
		this.custId = custId;
		this.custTypeId = custTypeId;
		this.custCode = custCode;
		this.custName = custName;
		this.custNikename = custNikename;
		this.companySrc = companySrc;
		this.companyId = companyId;
		this.gender = gender;
		this.birthday = birthday;
		this.marital = marital;
		this.childs = childs;
		this.education = education;
		this.custCompany = custCompany;
		this.custDept = custDept;
		this.job = job;
		this.businessNo1 = businessNo1;
		this.businessNo2 = businessNo2;
		this.faxNo = faxNo;
		this.custAddress = custAddress;
		this.deliverAddress = deliverAddress;
		this.invoiceAddress = invoiceAddress;
		this.contacterEmail = contacterEmail;
		this.custWww = custWww;
		this.custAddrZip = custAddrZip;
		this.deliverAddrZip = deliverAddrZip;
		this.invoiceAddrZip = invoiceAddrZip;
		this.custPhone1 = custPhone1;
		this.custPhone2 = custPhone2;
		this.custPhone3 = custPhone3;
		this.custMphone1 = custMphone1;
		this.custMphone2 = custMphone2;
		this.descript = descript;
		this.creater = creater;
		this.createtime = createtime;
		this.updater = updater;
		this.updatetime = updatetime;
		this.descissue = descissue;
		this.contimg = contimg;
		this.datacomefrom = datacomefrom;
		this.pwd = pwd;
		this.productsno = productsno;
		this.tid = tid;
		this.tiddatetime = tiddatetime;
		this.custMphoneN = custMphoneN;
		this.custMphoneP = custMphoneP;
		this.mailValid = mailValid;
	}

	@Id

	@Column(name = "cust_id", unique = true, nullable = false)
	public int getCustId() {
		return this.custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	@Column(name = "cust_type_id")
	public Integer getCustTypeId() {
		return this.custTypeId;
	}

	public void setCustTypeId(Integer custTypeId) {
		this.custTypeId = custTypeId;
	}

	@Column(name = "cust_code", length = 128)
	public String getCustCode() {
		return this.custCode;
	}

	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}

	@Column(name = "cust_name", length = 64)
	public String getCustName() {
		return this.custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	@Column(name = "cust_nikename", length = 64)
	public String getCustNikename() {
		return this.custNikename;
	}

	public void setCustNikename(String custNikename) {
		this.custNikename = custNikename;
	}

	@Column(name = "company_src")
	public Integer getCompanySrc() {
		return this.companySrc;
	}

	public void setCompanySrc(Integer companySrc) {
		this.companySrc = companySrc;
	}

	@Column(name = "company_id")
	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	@Column(name = "gender", length = 1)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "birthday", length = 19)
	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Column(name = "marital")
	public Integer getMarital() {
		return this.marital;
	}

	public void setMarital(Integer marital) {
		this.marital = marital;
	}

	@Column(name = "childs")
	public Integer getChilds() {
		return this.childs;
	}

	public void setChilds(Integer childs) {
		this.childs = childs;
	}

	@Column(name = "education")
	public Integer getEducation() {
		return this.education;
	}

	public void setEducation(Integer education) {
		this.education = education;
	}

	@Column(name = "cust_company", length = 512)
	public String getCustCompany() {
		return this.custCompany;
	}

	public void setCustCompany(String custCompany) {
		this.custCompany = custCompany;
	}

	@Column(name = "cust_dept", length = 512)
	public String getCustDept() {
		return this.custDept;
	}

	public void setCustDept(String custDept) {
		this.custDept = custDept;
	}

	@Column(name = "job", length = 512)
	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Column(name = "business_no1", length = 30)
	public String getBusinessNo1() {
		return this.businessNo1;
	}

	public void setBusinessNo1(String businessNo1) {
		this.businessNo1 = businessNo1;
	}

	@Column(name = "business_no2", length = 30)
	public String getBusinessNo2() {
		return this.businessNo2;
	}

	public void setBusinessNo2(String businessNo2) {
		this.businessNo2 = businessNo2;
	}

	@Column(name = "fax_no", length = 25)
	public String getFaxNo() {
		return this.faxNo;
	}

	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}

	@Column(name = "cust_address", length = 512)
	public String getCustAddress() {
		return this.custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	@Column(name = "deliver_address", length = 512)
	public String getDeliverAddress() {
		return this.deliverAddress;
	}

	public void setDeliverAddress(String deliverAddress) {
		this.deliverAddress = deliverAddress;
	}

	@Column(name = "invoice_address", length = 512)
	public String getInvoiceAddress() {
		return this.invoiceAddress;
	}

	public void setInvoiceAddress(String invoiceAddress) {
		this.invoiceAddress = invoiceAddress;
	}

	@Column(name = "contacter_email", length = 512)
	public String getContacterEmail() {
		return this.contacterEmail;
	}

	public void setContacterEmail(String contacterEmail) {
		this.contacterEmail = contacterEmail;
	}

	@Column(name = "cust_www", length = 512)
	public String getCustWww() {
		return this.custWww;
	}

	public void setCustWww(String custWww) {
		this.custWww = custWww;
	}

	@Column(name = "cust_addr_zip", length = 8)
	public String getCustAddrZip() {
		return this.custAddrZip;
	}

	public void setCustAddrZip(String custAddrZip) {
		this.custAddrZip = custAddrZip;
	}

	@Column(name = "deliver_addr_zip", length = 8)
	public String getDeliverAddrZip() {
		return this.deliverAddrZip;
	}

	public void setDeliverAddrZip(String deliverAddrZip) {
		this.deliverAddrZip = deliverAddrZip;
	}

	@Column(name = "invoice_addr_zip", length = 8)
	public String getInvoiceAddrZip() {
		return this.invoiceAddrZip;
	}

	public void setInvoiceAddrZip(String invoiceAddrZip) {
		this.invoiceAddrZip = invoiceAddrZip;
	}

	@Column(name = "cust_phone1", length = 25)
	public String getCustPhone1() {
		return this.custPhone1;
	}

	public void setCustPhone1(String custPhone1) {
		this.custPhone1 = custPhone1;
	}

	@Column(name = "cust_phone2", length = 25)
	public String getCustPhone2() {
		return this.custPhone2;
	}

	public void setCustPhone2(String custPhone2) {
		this.custPhone2 = custPhone2;
	}

	@Column(name = "cust_phone3", length = 25)
	public String getCustPhone3() {
		return this.custPhone3;
	}

	public void setCustPhone3(String custPhone3) {
		this.custPhone3 = custPhone3;
	}

	@Column(name = "cust_mphone1", length = 25)
	public String getCustMphone1() {
		return this.custMphone1;
	}

	public void setCustMphone1(String custMphone1) {
		this.custMphone1 = custMphone1;
	}

	@Column(name = "cust_mphone2", length = 25)
	public String getCustMphone2() {
		return this.custMphone2;
	}

	public void setCustMphone2(String custMphone2) {
		this.custMphone2 = custMphone2;
	}

	@Column(name = "descript", length = 1024)
	public String getDescript() {
		return this.descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	@Column(name = "creater")
	public Integer getCreater() {
		return this.creater;
	}

	public void setCreater(Integer creater) {
		this.creater = creater;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createtime", length = 19)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(name = "updater")
	public Integer getUpdater() {
		return this.updater;
	}

	public void setUpdater(Integer updater) {
		this.updater = updater;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updatetime", length = 19)
	public Date getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	@Column(name = "descissue", length = 1024)
	public String getDescissue() {
		return this.descissue;
	}

	public void setDescissue(String descissue) {
		this.descissue = descissue;
	}

	@Column(name = "contimg", length = 512)
	public String getContimg() {
		return this.contimg;
	}

	public void setContimg(String contimg) {
		this.contimg = contimg;
	}

	@Column(name = "datacomefrom", length = 45)
	public String getDatacomefrom() {
		return this.datacomefrom;
	}

	public void setDatacomefrom(String datacomefrom) {
		this.datacomefrom = datacomefrom;
	}

	@Column(name = "pwd", length = 45)
	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Column(name = "productsno", length = 128)
	public String getProductsno() {
		return this.productsno;
	}

	public void setProductsno(String productsno) {
		this.productsno = productsno;
	}

	@Column(name = "tid", length = 128)
	public String getTid() {
		return this.tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "tiddatetime", length = 19)
	public Date getTiddatetime() {
		return this.tiddatetime;
	}

	public void setTiddatetime(Date tiddatetime) {
		this.tiddatetime = tiddatetime;
	}

	@Column(name = "cust_mphone_n")
	public Integer getCustMphoneN() {
		return this.custMphoneN;
	}

	public void setCustMphoneN(Integer custMphoneN) {
		this.custMphoneN = custMphoneN;
	}

	@Column(name = "cust_mphone_p", length = 10)
	public String getCustMphoneP() {
		return this.custMphoneP;
	}

	public void setCustMphoneP(String custMphoneP) {
		this.custMphoneP = custMphoneP;
	}

	@Column(name = "mailValid", length = 1)
	public String getMailValid() {
		return this.mailValid;
	}

	public void setMailValid(String mailValid) {
		this.mailValid = mailValid;
	}

}