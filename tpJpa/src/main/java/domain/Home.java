package domain;


import java.util.Collection;

import javax.persistence.*;


@Entity
public class Home {

	@Id @GeneratedValue
	private long id;
	private double taille;
	private int nbPieces;
	private Collection<Heater> chauffage;
	private Person proprio;

	public Home(){}

	
	public Home(double taille, int nbPieces, Collection<Heater> chauffage, Person proprio) {
		super();
		this.taille = taille;
		this.nbPieces = nbPieces;
		this.chauffage = chauffage;
		this.proprio = proprio;
	}
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	@ManyToOne
	public Person getProprio() {
		return proprio;
	}

	
	public void setProprio(Person proprio) {
		this.proprio = proprio;
	}


	public double getTaille() {
		return taille;
	}

	public void setTaille(double taille) {
		this.taille = taille;
	}

	public int getNbPieces() {
		return nbPieces;
	}

	public void setNbPieces(int nbPieces) {
		this.nbPieces = nbPieces;
	}

	@OneToMany(mappedBy = "maison", cascade = CascadeType.PERSIST )
	public Collection<Heater> getChauffage() {
		return chauffage;
	}

	public void setChauffage(Collection<Heater> chauffage) {
		this.chauffage = chauffage;
	}

	
	
}
