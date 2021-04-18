package geometria;

public class Aree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// chiamata di metodo
		
		System.out.print("L'area del triangolo è: ");
		System.out.println(triangolo(4,5));
		
		
		System.out.print("L'area del quadrato è: ");
		System.out.println(quadrato(3));
		
		System.out.print("L'area del rombo è: ");
		System.out.println(rombo(6,2));

	}
	
	
	public static int triangolo(int base, int altezza) {
	
		return (base * altezza) / 2;
	}
	
	public static int quadrato(int lato) {
		return lato * lato;
	}
	
	public static int rombo(int diagMaggiore, int diagMinore) {
		
		return (diagMaggiore*diagMinore) / 2;
	}

}
