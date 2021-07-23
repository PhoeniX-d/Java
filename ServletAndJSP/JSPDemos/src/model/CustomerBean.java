package model;

public class CustomerBean {
	private String name;
	private String mail;
	private int cid;

	public CustomerBean(String name, String mail, int cid) {
		super();
		this.name = name;
		this.mail = mail;
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}
}
