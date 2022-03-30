package Laboratorio1;

public class Main{
	public static void main(String[] args) {

		CartaLacaio lac1 = new CartaLacaio(1, "Murloc Knight", 3, 4, 4);
		CartaLacaio lac2 = new CartaLacaio(2, "Dr. Boom", 7, 7, 7);
		CartaLacaio lac3 = new CartaLacaio(3, "Alexstrasza", 8, 8, 9);
		CartaMagia mag1 =  new CartaMagia(4, "Fireball", 6, false, 4);
		CartaMagia mag2 =  new CartaMagia(5, "Framestrike", 4, true, 7);
		
		System.out.println("Primeiro lacaio:\n" + lac1);
		System.out.println("Segundo lacaio:\n" + lac2);
		System.out.println("Terceiro lacaio:\n" + lac3);
		System.out.println("Primeira magia:\n" + mag1);
		System.out.println("Segunda magia:\n" + mag2);
	}
}
