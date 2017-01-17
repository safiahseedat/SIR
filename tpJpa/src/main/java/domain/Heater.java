package domain;
import javax.persistence.*;


@Entity
public class Heater {
	@Id @GeneratedValue
	private long id;
	private Home home;
	
	public Heater(){}
	
	public Heater(Home home) {
		super();
		this.home = home;
	}



	public long getId() {
		return id;
	}
	
	@ManyToOne
	public Home getHome(){
		return home;
	}
	
	



	
}
