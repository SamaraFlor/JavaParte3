
import java.util.Scanner;

public class Tabuada3 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um numero");
		int numero = entrada.nextInt();
		
		for (int c = 0; c <= 10; c++) {
           System.out.println(numero + "x" + c + "=" + (numero*c));
		}
		
		entrada.close();
	}

}
