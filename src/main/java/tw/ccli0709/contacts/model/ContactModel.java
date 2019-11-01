package tw.ccli0709.contacts.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;

import tw.ccli0709.contacts.entity.Tbdu01;

public class ContactModel {

	private String cid;
	private String uid;
	private String dept;
	private String name;
	private String telephone;
	private String address;
	private Date birthday;
	private int age;

	@SuppressWarnings("deprecation")
	public ContactModel(Tbdu01 vo) {

		this.setCid(vo.getId().getCompno());
		this.setUid(vo.getId().getUserno());
		this.setDept(vo.getDepno());
		this.setName(vo.getCname());
		this.setAddress(vo.getAddress());
		this.setTelephone(vo.getPhone1());

		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		Date birthday = new Date();
		try {
			birthday = format.parse(vo.getBirthday());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.setBirthday(birthday);
		this.setAge(DateTime.now().getYear() - birthday.getYear() - 1900);

	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
