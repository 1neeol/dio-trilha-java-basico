package edu.neeol.dio.conta;

import java.util.Scanner;

public class Executavel {

	public static void main(String[] args) {

		System.out.println("kekw");
		Scanner scn = new Scanner(System.in);
		int scnInt = scn.nextInt();
		System.out.println(scnInt);
		
		System.out.println("Bem-vindo ao banco do povo !!");

		boolean showMenu = true;

		while (showMenu) {
			Conta contaMananger = new Conta();

			System.out.println(
					"Selecione uma das opcoes abaixo: \n\n 1 - Criar conta; \n 2 - Sacar; \n 3 - Depositar; \n");
			Scanner opt = new Scanner(System.in);	

			switch (opt.next()) {
			case "1":
				contaMananger.criarConta();
				break;
			case "2":
				System.out.println("Informe o valor que deseja sacar");
				Scanner valorSaque = new Scanner(System.in);
				contaMananger.sacar(valorSaque.nextDouble());
				break;
			case "3":
				System.out.println("Informe o valor que deseja sacar");
				Scanner valorDeposito = new Scanner(System.in);
				contaMananger.depositar(valorDeposito.nextDouble());
				break;
			default:
				System.out.println("Opção não encontrada");

			}

			System.out.println("Deseja fazer uma nova operação? \n\n 1 - Sim; \n 2 - Não;");
			Scanner optShowMenu = new Scanner(System.in);

			if (optShowMenu.next().equals("1")) {
				showMenu = true;
			} else {
				showMenu = false;
			}
		}
	}

}
