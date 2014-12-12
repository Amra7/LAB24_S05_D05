package Vjezbe;

public class Temperatura {

	private int temp;
	
	private String tempVrsta;

	
	public Temperatura() {
		this.temp = 0;
		this.tempVrsta = null;

	}
	
	public Temperatura( int newTemp){
		this.temp = newTemp;
		this.tempVrsta = "Celzijus";
		this.tempVrsta = "Farenhajt";
		this.tempVrsta = "Kelvin";
	}
	
	public int getTemp (){
		return temp;
	}
	
	public void setTemp (int newTemp){
		this.temp =  temp;
	}
	
	public String getTempVrsta (){
		return tempVrsta;
	}
	
	public void setTempVrsta ( String tempVrsta){
		this.tempVrsta = tempVrsta;
	}
	
	
	public String toString (){
		String temperatura ="";
		temperatura = "Temperatura je : " + temp + tempVrsta;
		
	    return temperatura;
		
	}
	
	public String convertCuF ( int temp , String tempVrsta){
		String rezultat = "";
		
		if (tempVrsta.equalsIgnoreCase(tempVrsta)) {
			if ( tempVrsta.equals("c")){
				double tempF = temp * 1.8 + 32;
				String tFarenhajt = Double.toString(tempF);
				rezultat  += tFarenhajt +"F";
			}				
		}
		return  rezultat;
		
	}
	
	public String convertCuK ( int temp , String tempVrsta){
		String rezultat = "";
	
		if (tempVrsta.equalsIgnoreCase(tempVrsta)) {
			if ( tempVrsta.equals("c")){
				double tempK = temp + 273.15;
				String tKelvin = Double.toString(tempK);
				rezultat  += tKelvin +"K";
			}
		}
		return  rezultat;
	}
	
	public String convertFuC ( int temp , String tempVrsta){
		String rezultat = "";
		
		if (tempVrsta.equalsIgnoreCase(tempVrsta)) {
			if ( tempVrsta.equals("f")){
				double tempC = (temp -32) / 1.8;
		    	String tCelzij = Double.toString(tempC);
				rezultat  += tCelzij +"C";
				
			}
	
		}
		return  rezultat;
	}
	
	public String convertKuC ( int temp , String tempVrsta){
		String rezultat = "";
		
		if (tempVrsta.equalsIgnoreCase(tempVrsta)) {
			if ( tempVrsta.equals("k")){
				double tempC = temp - 273.15;
				String tCelzij = Double.toString(tempC);
				rezultat  += tCelzij +"C";
			}
			
		}
		return  rezultat;
	}
	
	
//	public  String convertCUFarenhajt ( int temp) {
//		double tempF = temp * 1.8 + 32;
//		String rezultat = "";
//		String tFarenhajt = Double.toString(tempF);
//		rezultat  += tFarenhajt +"F";
//		
//		return  rezultat;
//	}
//	
//	public  String convertCUKelvin ( int temp) {
//		double tempK = temp + 273.15;
//		String rezultat = "";
//		String tKelvin = Double.toString(tempK);
//		rezultat  += tKelvin +"K";
//		
//		return  rezultat;
//	}
//	
//	public  String convertFUCelzij ( int temp) {
//		double tempC = (temp -32) / 1.8;
//		String rezultat = "";
//		String tCelzij = Double.toString(tempC);
//		rezultat  += tCelzij +"C";
//		
//		return  rezultat;
//	}
//	
//	public  String convertKUCelzij ( int temp) {
//		double tempC = temp - 273.15;
//		String rezultat = "";
//		String tCelzij = Double.toString(tempC);
//		rezultat  += tCelzij +"C";
//		
//		return  rezultat;
//	}
}
