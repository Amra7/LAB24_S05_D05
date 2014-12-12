package Vjezbe;

public class TestToy {
public static void main(String[] args) {
	
	Toy igracka1= new Toy ("Mangup", "medo", 34.50);
	System.out.println(igracka1.toString());
	
	Toy igracka2= new Toy ("Edib", "ptica", 5.99, 2012);
	System.out.println(igracka2.toString());
	
	Toy igracka3= new Toy ("Necko", "actionman", 99.90, 2014, 3);
	System.out.println(igracka3.toString());
	
	igracka1.compare(igracka2);
	System.out.println( igracka2.equals(igracka3));
}
	
	
}
