package estacionamento;

import java.util.Scanner;

public class estacionamento {

	public static void main(String[] args) {
		Scanner batman = new Scanner(System.in);
		// inserindo dados as variaveis
		int idoso, defi, gest;
		// exibindo na tela o texto em paratenses
		System.out.println(
				"Reponda para saber se voce pode estacionar em Vaga Especial!\nDigite:\n1 para sim\n2 para n�o!");
		System.out.println("Voce � Idoso?\n1.sim\n2.n�o");
		// atribuindo o valor que o usuario digitou
		idoso = batman.nextInt();
		System.out.println("Voce � uma Pessoa com Defici�ncia?\n1.sim\n2.n�o");
		defi = batman.nextInt();
		System.out.println("Voce � Gestante?\n1.sim\n2.n�o");
		gest = batman.nextInt();
		// encerando o scanner
		batman.close();
		// criando condi��o
		if (idoso == 1 || defi == 1 || gest == 1) {
			System.out.println("Voce pode Estacionar em Vaga Especial!");
		} else {
			System.out.println("Voce n�o pode Estacionar em Vaga Especial!");
		}
	}

}