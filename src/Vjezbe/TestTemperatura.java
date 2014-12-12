package Vjezbe;

public class TestTemperatura {
public static void main(String[] args) {
	
	Temperatura trenutna = new Temperatura();
	
	trenutna.setTemp(18);
	
	System.out.println(trenutna.getTemp());
	
	System.out.println(trenutna.convertCuF(23, "c"));
	System.out.println(trenutna.convertCuK(45, "c"));
	
	
}
}
