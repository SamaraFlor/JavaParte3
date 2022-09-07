import java.util.Scanner;

/*
    Voc� deve fazer um programa que leia um valor qualquer e apresente 
    uma mensagem dizendo em qual dos seguintes intervalos 
    ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. 
    Obviamente se o valor n�o estiver em nenhum destes intervalos, dever� ser impressa a mensagem
     �Fora de intervalo�.
    O s�mbolo ( representa "maior que". Por exemplo:
    [0,25]  indica valores entre 0 e 25.0000, inclusive eles.
     (25,50] indica valores maiores que 25 Ex: 25.00001 at� o valor 50.0000000
 */
public class Intervalo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double valor;
		valor = entrada.nextDouble();

		if (valor >= 0 && valor <= 25.0) {
			System.out.println(" intervalo [0,25] ");
		} else if (valor > 25.0 && valor <= 50.0) {
			System.out.println(" intervalo (25,50] ");
		} else if (valor > 50.0 && valor <= 75.0) {
			System.out.println(" intervalo (50,75] ");
		} else if (valor > 75.0 && valor <= 100.0) {
			System.out.println(" intervalo (75,100] ");
		} else {
			System.out.println(" Fora do intervalo solicitado ");
		}

		entrada.close();
	}

}
