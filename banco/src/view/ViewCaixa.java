package view;

import java.util.Scanner;

import Enumereds.TipoConta;
import entities.Banco;
import entities.Conta;

public class ViewCaixa{
	
	private final ViewContaCorrente viewCorrente = new ViewContaCorrente();
	
	public ViewCaixa() {
		
	}

	public void caixaMainView(Banco banco, Scanner in) {

		boolean continuar = true;
		
		while (continuar) {
			
			System.out.println("==================================");
			System.out.println("=             CAIXA              =");
			System.out.println("==================================");			
			System.out.println("| 001 - Acessar Conta            |");
			System.out.println("| 100 - Sair                     |");			
			System.out.println("|--------------------------------|");
			System.out.printf("|Digite a opção que deseja:");
			int opcao = in.nextInt();
			
			switch (opcao) {
			case 1:
				this.acesso(banco, in);
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
	
	private void acesso(Banco banco, Scanner in) {
		
		System.out.println("==================================");
		System.out.println("=             ACESSO             =");
		System.out.println("==================================");
		
		System.out.printf("Digite o número da conta:");
		int numero = in.nextInt();
		
		Conta conta = banco.findByNumero(numero);
		
		if(conta == null) {
			System.out.println("Conta inválida.");
			System.out.println("Aperte enter para continuar...");
			in.next();
			in.next();
		}
		
		if(conta.getTipoConta().equals(TipoConta.CORRENTE)) {
			viewCorrente.mainView(banco, conta, in);
		}
		
		
		
	}

}
