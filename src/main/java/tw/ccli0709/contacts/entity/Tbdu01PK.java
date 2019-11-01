package tw.ccli0709.contacts.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tbdu01 database table.
 * 
 */
@Embeddable
public class Tbdu01PK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String compno;

	private String userno;

	public Tbdu01PK() {
	}
	public String getCompno() {
		return this.compno;
	}
	public void setCompno(String compno) {
		this.compno = compno;
	}
	public String getUserno() {
		return this.userno;
	}
	public void setUserno(String userno) {
		this.userno = userno;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Tbdu01PK)) {
			return false;
		}
		Tbdu01PK castOther = (Tbdu01PK)other;
		return 
			this.compno.equals(castOther.compno)
			&& this.userno.equals(castOther.userno);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.compno.hashCode();
		hash = hash * prime + this.userno.hashCode();
		
		return hash;
	}
}