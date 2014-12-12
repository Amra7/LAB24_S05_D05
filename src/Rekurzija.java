
public class Rekurzija {
public static void main(String[] args) {
	
	System.out.println(" Unesi velicinu matrice: ");
	int broj = TextIO.getlnInt();
	int [][] matrica = napraviMatricu(broj);
	
	upisiUMatricu(matrica);
	printMatrica(matrica);
	
	System.out.println("Unesi koordinate matrice x i y:");
	int x = TextIO.getlnInt();
	int y = TextIO.getlnInt();
	int [][] matricaR = otvoriPolje(matrica, x,y);
	printMatrica(matricaR);
	
	
}

private static int [][] otvoriPolje(int [][] matrica, int x, int y) {	
	char r = 'r';
	
	if ( x < 1 || x >= matrica.length || y < 1 || y >= matrica [x].length){
		return matrica;
	}
	
	if ( matrica[x][y] == 0 && matrica[x][y] !=  'r' ){
		 matrica[x][y] = 'r';
		 otvoriPolje (matrica,x+1,y);
		 otvoriPolje (matrica, x-1,y);
		 otvoriPolje (matrica, x,y+1);
		 otvoriPolje (matrica, x,y -1);
	}
	return matrica;
}

private static void printMatrica(int[][] matrica) {
	for ( int i=0; i < matrica.length; i++){
		for ( int j=0; j < matrica[i].length; j++){
			System.out.print(matrica[i][j]+ " ");
		}System.out.println();
	}
	
}

private static void upisiUMatricu(int [][] matrica) {
	for ( int i=0; i < matrica.length; i++){
		for ( int j=0; j < matrica[i].length; j++){
			System.out.println("Unesi broj 1 ili 0 u matricu: ");
			matrica[i][j] = TextIO.getlnInt();
		}
	}
	
}

private static int[][] napraviMatricu(int broj) {
	 int [][] matrica = new int [broj][broj];
	return matrica;
}
}
