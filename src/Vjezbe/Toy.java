package Vjezbe;

public class Toy {

	private String naziv;
	private String tip;
	private double cijena;
	private int godina;

	private int dobnoOgranicenje;
	int broj;

	public Toy(String naziv, String tip, double cijena) {
		this.naziv = naziv;
		this.tip = tip;
		this.cijena = cijena;

	}

	public Toy(String naziv, String tip, double cijena, int godina,
			int dobnoOgranicenje) {
		this.naziv = naziv;
		this.tip = tip;
		this.cijena = cijena;
		this.godina = godina;
		this.dobnoOgranicenje = dobnoOgranicenje;
	}

	public Toy(String naziv, String tip, double cijena, int broj) {
		this.naziv = naziv;
		this.tip = tip;
		this.cijena = cijena;
		
		if (broj > 100) {
			this.godina = broj;
		} else {
			this.dobnoOgranicenje = broj;
		}
	}

	public String getNaziv() {
		return naziv;
	}

	public String getTip() {
		return tip;
	}

	public double getCijena() {
		return cijena;
	}

	public int getGodina() {
		return godina;
	}

	public int getDobnoOgranicenje() {
		return dobnoOgranicenje;
	}

	public void setNaziv() {
		this.naziv = naziv;
	}

	public void setTip() {
		this.tip = tip;
	}

	public void setCijena() {
		this.cijena = cijena;
	}

	public void setGodina() {
		if ( godina > 100){
			this.godina = godina;
		} else {
			throw new IllegalArgumentException("Ovo nije godina proizvodnje!");
		}
		
	}

	public void setDobnoOgranicenje() {
		if ( godina < 100){
			this.dobnoOgranicenje = dobnoOgranicenje;
		} else{
			throw new IllegalArgumentException("Ovo nije dobno ogranicenje!");
		}
		
	}

	public String toString() {
		String str = "";
		str = "\nIme igracke: " + naziv + "\nTip igracke: " + tip
				+ "\nCijena igracke: " + cijena + "\nGodina proizvodnje : "
				+ godina + "\nDobno ogranicenje: " + dobnoOgranicenje;
		return str;
	}
	
	public Toy copy ( Toy other ){
		
		this.naziv = other.naziv;
		this.tip = tip;
		this.cijena = cijena;
		this.godina = godina;
		this.dobnoOgranicenje = dobnoOgranicenje;
		
		return this;
	}
	
	public boolean equals ( Toy other ){
		if ( this.naziv == other.naziv && this.tip== other.tip && this.cijena==other.cijena && this.dobnoOgranicenje==other.dobnoOgranicenje){
			return true;
		}
		return false;
	}
	
	
	public  void compare (Toy other){
		if ( this.naziv == other.naziv && this.tip== other.tip && this.cijena==other.cijena && this.godina==other.godina && this.dobnoOgranicenje==other.dobnoOgranicenje) {
			System.out.println("Igracke su iste!");
		} else if (this.naziv == other.naziv && this.tip== other.tip && this.cijena==other.cijena && this.dobnoOgranicenje==other.dobnoOgranicenje) {
			System.out.println("Igracke su iste, ali im nije ista godina proizzvodnje!");
		} else {
			System.out.println("Igracke su razlicite!");
		}
		
	}
	
}
