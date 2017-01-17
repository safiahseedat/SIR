package domain;

import java.util.Collection;

import javax.persistence.*;


@Entity
public class Person {
	@Id @GeneratedValue
	long id;
	String nom, prenom, mail;
	@Transient
	Collection<Home> home;
	@Transient
	Collection<ElectronicDevice> equipement; 
	@Transient
	Collection<Person> amis;
	
	public Person(){}
	
	
	

	public Person(String nom, String prenom, String mail, Collection<Home> home,
			Collection<ElectronicDevice> equipement, Collection<Person> amis) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.home = home;
		this.equipement = equipement;
		this.amis = amis;
	}




	public long getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@OneToMany(mappedBy = "proprio", cascade = CascadeType.PERSIST)
	public Collection<Home> getHome() {
		return home;
	}

	public void setHome(Collection<Home> home) {
		this.home = home;
	}

	@OneToMany(mappedBy = "proprio", cascade = CascadeType.PERSIST)
	public Collection<ElectronicDevice> getEquipement() {
		return equipement;
	}

	
	public void setEquipement(Collection<ElectronicDevice> equipement) {
		this.equipement = equipement;
	}

	@ManyToMany 
	public Collection<Person> getAmis() {
		return amis;
	}

	public void setAmis(Collection<Person> amis) {
		this.amis = amis;
	}
	
	

}
