package domain;



import javax.persistence.*;


@Entity
public class ElectronicDevice {

	@Id @GeneratedValue
	long id;
	String nom;
	double consoMoy;
	Person proprio;
	
	public ElectronicDevice(){}

	public ElectronicDevice(String nom, double consoMoy, Person proprio) {
		super();
		this.nom = nom;
		this.consoMoy = consoMoy;
		this.proprio = proprio;
	}


	@ManyToOne
	public Person getProprio() {
		return proprio;
	}


	public void setProprio(Person proprio) {
		this.proprio = proprio;
	}


	public void setId(long id) {
		this.id = id;
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


	public double getConsoMoy() {
		return consoMoy;
	}

	public void setConsoMoy(double consoMoy) {
		this.consoMoy = consoMoy;
	}
	
	
}
