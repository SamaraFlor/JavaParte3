import java.util.Scanner;

/*
 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade 
 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que 
 * ele pertence. O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA
(nesta situação sem escrever mensagem alguma).
 */
public class ExercRepeticao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int x,y;
		System.out.println("digite um numero");
		
		do {
		x = entrada.nextInt();
		y = entrada.nextInt();

		if (x > 0 && y > 0) {
			System.out.println("primeiro");

		} 
		else if (x < 0 && y > 0) {
			System.out.println("segundo");

		} 
		else if (x > 0 && y < 0) {
			System.out.println("terceiro");

		} 
		else if (x > 0 && y < 0) {
			System.out.println("quarto");
		}
		}while(x != 0 && y != 0);
		
		
		
		entrada.close();
	}
		

}
