package ClaseMath;

public class Ejercicio3 {
	
	public static void main(String args[]) {
				
		double nota1 = (int) (Math.random()*10);
		
		double nota2 = (int) (Math.random()*10);
		
		double nota3 = (int) (Math.random()*10);
		
		double nota4 = (int) (Math.random()*10);
		
		double nota5 = (int) (Math.random()*10);
		
		double promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
		
		System.out.println("Nota 1: " + nota1);
		
		System.out.println("Nota 2: " + nota2);
		
		System.out.println("Nota 3: " + nota3);
		
		System.out.println("Nota 4: " + nota4);
		
		System.out.println("Nota 5: " + nota5);
		
		System.out.println("Promedio: " + promedio);
		
	}

}
