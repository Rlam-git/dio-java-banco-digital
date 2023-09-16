package view;

import java.util.Scanner;

import entities.Banco;
import entities.Conta;

public class ViewContaCorrente {
	
	public void mainView(Banco banco, Conta conta, Scanner in) {

		boolean continuar = true;
		
		while (continuar) {
			
			System.out.println("==================================");
			System.out.println("=         CONTA CORRENTE         =");
			System.out.println("==================================");			
			System.out.println("| 101 - Sacar                    |");
			System.out.println("| 102 - Depositar                |");
			System.out.println("| 103 - Transferencia            |");
			System.out.println("| 104 - Extrato                  |");
			System.out.println("| 100 - Voltar                   |");			
			System.out.println("|--------------------------------|");
			System.out.printf("|Digite a opção que deseja:");
			int opcao = in.nextInt();
			
			switch (opcao) {
			case 101:
				sacar(conta,in);
				break;
			case 102:
				depositar(conta, in);
				break;
			case 103:
				transferir(banco, conta, in);
				break;
			case 104:
				extrato(conta, in);
				break;
			case 100:
				continuar = false;
				break;
			default:
				System.out.println("Opção digitada inválida.");
				System.out.println("Aperte enter para continuar...");
				in.next();
				in.next();
				break;
			}
		}
	
	}
	
	private void sacar(Conta conta, Scanner in) {
		System.out.println("==================================");
		System.out.println("=       SAQUE CONTA CORRENTE     =");
		System.out.println("==================================");
		
		System.out.printf("Digite o valor desejado: ");
		double valor = in.nextDouble();
		
		boolean efetuado =  conta.sacar(valor);
		
		System.out.println(efetuado == true ? "Realizado com sucesso." : "Saldo insuficiente.");
		System.out.println("Aperte enter para continuar...");
		in.next();
		in.next();
		
	}

	private void depositar(Conta conta, Scanner in) {
		System.out.println("==================================");
		System.out.println("=      DEPOSITO CONTA CORRENTE   =");
		System.out.println("==================================");
		
		System.out.printf("Digite o valor desejado: ");
		double valor = in.nextDouble();
		
		conta.depositar(valor);
		System.out.println("Aperte enter para continuar...");
		in.next();
		in.next();
	}
	
	private void transferir(Banco banco, Conta conta, Scanner in) {
		
		System.out.println("==================================");
		System.out.println("=  TRANSFERENCIA CONTA CORRENTE  =");
		System.out.println("==================================");
		
		System.out.printf("Digite o número da conta de destino: ");
		int numeroDestino = in.nextInt();
		
		Conta contaDestino = banco.findByNumero(numeroDestino);
		
		if(contaDestino.equals(null)) {
			System.out.println("Conta destino inválida.");
			System.out.println("Aperte enter para continuar...");
			in.next();
			in.next();
		}
		
		
		System.out.printf("Digite o valor desejado: ");
		double valor = in.nextDouble();
		conta.transferir(contaDestino, valor);
		
		System.out.println("Transferencia realizada com sucesso.");
		System.out.println("Aperte enter para continuar...");
		in.next();
		in.next();

	}

	private void extrato(Conta conta, Scanner in) {
		System.out.println("==================================");
		System.out.println("=     EXTRATO CONTA CORRENTE     =");
		System.out.println("==================================");
		
		conta.extrato();
		System.out.println("Aperte enter para continuar...");
		in.next();
		in.next();
	}
}
