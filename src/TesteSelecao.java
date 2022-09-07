import java.util.Scanner;

/*
 * 
	    Leia 4 valores inteiros A, B, C e D. 
	    A seguir, 
	    se B for maior do que C -
	    e se D for maior do que A, -
	    e a soma de C com D for maior que a soma de A e B e se C e D, 
	    ambos, forem positivos 
	    e se a variável A for par 
	    escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".
		
		
 */
public class TesteSelecao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int A,B,C,D;
		 
		System.out.println("Entre com o valor");
		A = entrada.nextInt();
		B = entrada.nextInt();
		C = entrada.nextInt();
		D = entrada.nextInt();
		
		if ((B>C) && (D>A) && (C+D) > (A+B) && (C > 0) && (D>0) && (A %2 ==0)) {
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores Não aceitos");
		}

		entrada.close();
	} 

}
