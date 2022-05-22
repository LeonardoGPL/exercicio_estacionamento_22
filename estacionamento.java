package estacionamento;

import java.util.Scanner;

public class estacionamento {

	public static void main(String[] args) {
		Scanner batman = new Scanner(System.in);
		// inserindo dados as variaveis
		int idoso, defi, gest;
		// exibindo na tela o texto em paratenses
		System.out.println(
				"Reponda para saber se voce pode estacionar em Vaga Especial!\nDigite:\n1 para sim\n2 para não!");
		System.out.println("Voce é Idoso?\n1.sim\n2.não");
		// atribuindo o valor que o usuario digitou
		idoso = batman.nextInt();
		System.out.println("Voce é uma Pessoa com Deficiência?\n1.sim\n2.não");
		defi = batman.nextInt();
		System.out.println("Voce é Gestante?\n1.sim\n2.não");
		gest = batman.nextInt();
		// encerando o scanner
		batman.close();
		// criando condição
		if (idoso == 1 || defi == 1 || gest == 1) {
			System.out.println("Voce pode Estacionar em Vaga Especial!");
		} else {
			System.out.println("Voce não pode Estacionar em Vaga Especial!");
		}
	}

}