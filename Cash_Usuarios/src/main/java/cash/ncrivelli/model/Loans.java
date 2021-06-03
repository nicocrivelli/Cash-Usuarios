package cash.ncrivelli.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Loans {

	@Id
	private int id;
	@Column
	private int total;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "userId", nullable = false)
	private Usuario userId;

	
	public Loans() {
		super();
	}
	
	public Loans(int id, int total, Usuario user) {
		super();
		this.id = id;
		this.total = total;
		this.userId = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Usuario getUserId() {
		return userId;
	}

	public void setUserId(Usuario user) {
		this.userId = user;
	}
	
}
