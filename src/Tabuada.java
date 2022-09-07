import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um numero");
		int numero = entrada.nextInt();
		int contador;
		
		contador = 1;
		while(contador <= 10) {
			System.out.println(numero + "x" + contador + "=" + (numero*contador) );
			contador++;
		}
		
		
		entrada.close();

	}

}
