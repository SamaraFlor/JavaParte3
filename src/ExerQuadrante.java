import java.util.Scanner;

/*
 *Escreva um programa que leia um valor inteiro N (1 < N < 1000). 
 *Este N � a quantidade de linhas de sa�da que ser�o apresentadas na execu��o do programa.
 */

public class ExerQuadrante {

	public static void main(String[] args) {
	 Scanner entrada = new Scanner(System.in);
    
	 
	 System.out.println("digite o numero");
	int N = entrada.nextInt();
	
	for(int num = 1; N <= num; N++) {
		System.out.println(num + "  "  + (num*num)+ " "  + (num*num*num));
	}
	 
	}
 
}
