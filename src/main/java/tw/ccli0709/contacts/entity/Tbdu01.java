package tw.ccli0709.contacts.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the tbdu01 database table.
 * 
 */
@Entity
@NamedQuery(name="Tbdu01.findAll", query="SELECT t FROM Tbdu01 t")
public class Tbdu01 implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private Tbdu01PK id;

	private String address;

	private String address2;

	private String birthday;

	private String city;

	private String cname;

	private BigInteger createdate;

	private String createuser;

	private String depno;

	private String depno2;

	private String email;

	private String empno;

	private String ename;

	private String idtype;

	private String memo;

	private BigInteger modifydate;

	private String modifyuser;

	private String paytype;

	private String personid;

	private String phone1;

	private String phone2;

	private String phone3;

	private String postno;

	private String postno2;

	private String remitacct1;

	private String remitbank1;

	private String sex;

	private String status;

	private String subcompno;

	private String validdate;

	public Tbdu01() {
	}

	public Tbdu01PK getId() {
		return this.id;
	}

	public void setId(Tbdu01PK id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getBirthday() {
		return this.birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public BigInteger getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(BigInteger createdate) {
		this.createdate = createdate;
	}

	public String getCreateuser() {
		return this.createuser;
	}

	public void setCreateuser(String createuser) {
		this.createuser = createuser;
	}

	public String getDepno() {
		return this.depno;
	}

	public void setDepno(String depno) {
		this.depno = depno;
	}

	public String getDepno2() {
		return this.depno2;
	}

	public void setDepno2(String depno2) {
		this.depno2 = depno2;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmpno() {
		return this.empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getIdtype() {
		return this.idtype;
	}

	public void setIdtype(String idtype) {
		this.idtype = idtype;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public BigInteger getModifydate() {
		return this.modifydate;
	}

	public void setModifydate(BigInteger modifydate) {
		this.modifydate = modifydate;
	}

	public String getModifyuser() {
		return this.modifyuser;
	}

	public void setModifyuser(String modifyuser) {
		this.modifyuser = modifyuser;
	}

	public String getPaytype() {
		return this.paytype;
	}

	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}

	public String getPersonid() {
		return this.personid;
	}

	public void setPersonid(String personid) {
		this.personid = personid;
	}

	public String getPhone1() {
		return this.phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return this.phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getPhone3() {
		return this.phone3;
	}

	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}

	public String getPostno() {
		return this.postno;
	}

	public void setPostno(String postno) {
		this.postno = postno;
	}

	public String getPostno2() {
		return this.postno2;
	}

	public void setPostno2(String postno2) {
		this.postno2 = postno2;
	}

	public String getRemitacct1() {
		return this.remitacct1;
	}

	public void setRemitacct1(String remitacct1) {
		this.remitacct1 = remitacct1;
	}

	public String getRemitbank1() {
		return this.remitbank1;
	}

	public void setRemitbank1(String remitbank1) {
		this.remitbank1 = remitbank1;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubcompno() {
		return this.subcompno;
	}

	public void setSubcompno(String subcompno) {
		this.subcompno = subcompno;
	}

	public String getValiddate() {
		return this.validdate;
	}

	public void setValiddate(String validdate) {
		this.validdate = validdate;
	}

}