/**
 * Classe Main.java que cria instancias das classes CartaLacaio e CartaMagia
 * e imprime os valores de cada uma das cartas na tela
 */

package Lab2RA248438;

public class Main{
	public static void main(String[] args) {

		CartaLacaio lac1 = new CartaLacaio(1, "Murloc Knight", 3, 4, 4);
		CartaLacaio lac2 = new CartaLacaio(2, "Dr. Boom", 7, 7, 7);
		CartaLacaio lac3 = new CartaLacaio(3, "Alexstrasza", 8, 8, 9);
		CartaMagia mag1 =  new CartaMagia(4, "Fireball", 6, false, 4);
		CartaMagia mag2 =  new CartaMagia(5, "Framestrike", 4, true, 7);
		
		//Questão 1
		//CartaLacaio lac4 = new CartaLacaio(3, "Alexstrasza", 9);
		//System.out.println("Quarto lacaio:\n" + lac4);


		//Questão 2
		//lac1.setAtaque(lac3.getAtaque());
		//System.out.println("Primeiro lacaio:\n" + lac1);

		//Questão 3
		//System.out.println("Primeira magia:\n" + mag1);

		//Questão 4
		//CartaLacaio lac5 = new CartaLacaio(lac2);
		//System.out.println("Segundo Lacaio:\n" + lac2);
		//System.out.println("Quinto Lacaio:\n" + lac5);

		//Questão 5
		//System.out.println(mag1.nome);
		//System.out.println(mag1.getNome());

		//Questão 6
		lac1.buffar(5);
		System.out.println("Primeiro lacaio buffado em 5:\n" + lac1);
		lac2.buffar(5, 10);
		System.out.println("Segundo lacaio buffado em 5 e 10:\n" + lac2);
	}
}
