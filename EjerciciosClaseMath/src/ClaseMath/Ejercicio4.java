package ClaseMath;

public class Ejercicio4 {
	
	public static void main(String args[]) {
		
		double numero1 = (Math.random()*50);
		
		double numero2 = (Math.random()*50);
		
		System.out.println("Número 1: " + numero1);
		
		System.out.println("Número 1 redondeado (round): " + Math.round(numero1));
		
		System.out.println("Número 1 redondeado (floor): " + Math.floor(numero1));
		
		System.out.println("Número 1 redondeado (ceil): " + Math.ceil(numero1));
		
		System.out.println("Número 2: " + numero2);
		
		System.out.println("Número 2 redondeado (round): " + Math.round(numero2));
		
		System.out.println("Número 2 redondeado (floor): " + Math.floor(numero2));
		
		System.out.println("Número 2 redondeado (ceil): " + Math.ceil(numero2));
		
		System.out.println("Número mayor: " + Math.max(numero1, numero2));	
	}

}
