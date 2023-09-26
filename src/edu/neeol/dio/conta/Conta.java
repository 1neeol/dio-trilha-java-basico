package edu.neeol.dio.conta;

import java.util.Scanner;

public class Conta {

	double saldo = 237.48;
	String agencia = "067-8";
	int numero = 1021;
	String nomeCliente = "";
	String cpf = "";

	public void criarConta() {
		System.out.println("Informe o nome completo");
		Scanner inputNome = new Scanner(System.in);
		nomeCliente = String.valueOf(inputNome);
		System.out.println("Informe o cpf");
		Scanner inputCpf = new Scanner(System.in);
		cpf = String.valueOf(inputCpf);

		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
				+ agencia + ", conta número " + numero + " e seu saldo " + saldo + " já está disponível para saque");

	}

	public void sacar(double valorSaque) {

		if (valorSaque < saldo && valorSaque > 0.0) {
			System.out.println("Saldo Insuficiente");
		} else {
			saldo = saldo - valorSaque;

			System.out.println("Saque efetuado com sucesso. \n\n Saldo restante: " + saldo);
		}

	}

	public void depositar(double valorDeposito) {
		saldo = saldo + valorDeposito;
		
		System.out.println("Deposito Efetuado com Sucesso. \n\n Saldo Restante: "+saldo);

	}

}
