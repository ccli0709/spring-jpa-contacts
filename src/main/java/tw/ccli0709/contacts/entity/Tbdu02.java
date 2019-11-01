package tw.ccli0709.contacts.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbdu02 database table.
 * 
 */
@Entity
@NamedQuery(name="Tbdu02.findAll", query="SELECT t FROM Tbdu02 t")
public class Tbdu02 implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private Tbdu02PK id;

	private String cryptopw;

	private String ip;

	private String lastdate;

	private String randomkey;

	public Tbdu02() {
	}

	public Tbdu02PK getId() {
		return this.id;
	}

	public void setId(Tbdu02PK id) {
		this.id = id;
	}

	public String getCryptopw() {
		return this.cryptopw;
	}

	public void setCryptopw(String cryptopw) {
		this.cryptopw = cryptopw;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getLastdate() {
		return this.lastdate;
	}

	public void setLastdate(String lastdate) {
		this.lastdate = lastdate;
	}

	public String getRandomkey() {
		return this.randomkey;
	}

	public void setRandomkey(String randomkey) {
		this.randomkey = randomkey;
	}

}