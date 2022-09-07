import java.util.Scanner;

public class Tabuada2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um numero");
		int numero = entrada.nextInt();
		int contador;
		
		contador = 1;
		do {
			System.out.println(numero + "x" + contador + "=" + (numero*contador) );
			contador++;
		}while(contador <= 10);
	
		entrada.close();

	}

}
