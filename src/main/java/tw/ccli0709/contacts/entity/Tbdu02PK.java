package tw.ccli0709.contacts.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tbdu02 database table.
 * 
 */
@Embeddable
public class Tbdu02PK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String compid;

	private String userno;

	public Tbdu02PK() {
	}
	public String getCompid() {
		return this.compid;
	}
	public void setCompid(String compid) {
		this.compid = compid;
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
		if (!(other instanceof Tbdu02PK)) {
			return false;
		}
		Tbdu02PK castOther = (Tbdu02PK)other;
		return 
			this.compid.equals(castOther.compid)
			&& this.userno.equals(castOther.userno);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.compid.hashCode();
		hash = hash * prime + this.userno.hashCode();
		
		return hash;
	}
}