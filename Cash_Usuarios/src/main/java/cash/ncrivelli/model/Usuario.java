package cash.ncrivelli.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Usuario {

	@Id
	private int id;
	@Column
	private String email;
	@Column
	private String firstName;
	@Column
	private String lastName;
	
	@OneToMany(mappedBy = "userId", fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	private Set<Loans> loans;
	 
	
	public Usuario() {
		super();
	}

	public Usuario(int id, String email, String firstName, String lastName) {
		super();
		this.id = id;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Set<Loans> getLoans() {
		return loans;
	}

	public void setLoans(Set<Loans> loans) {
		this.loans = loans;
	}
	
}
