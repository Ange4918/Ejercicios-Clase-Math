package ClaseMath;

public class Ejercicio4Sol {
	
	public static void main(String args[]) {
		
		double numero1 = (Math.random()*50);
		
		double numero2 = (Math.random()*50);
		
		int numero1redondeado = (int) Math.ceil(numero1);
		
		int numero2redondeado = (int) Math.round(numero2);
		
		System.out.println("Número 1: " + numero1redondeado);
		
		System.out.println("Número 2: " + numero2redondeado);
		
		System.out.println("Número mayor: " + Math.max(numero1, numero2));	
	}

}
