package entities;

import java.util.Scanner;

import view.ViewCaixa;


public class Main {
	
	private static ViewCaixa viewCaixa = new ViewCaixa();
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Banco bancoDio = new Banco("Banco Dio", 1);
		
		boolean continuar = true;
	
		
		while (continuar) {
			
			System.out.println("===================================");
			System.out.println("=            BANCO DIO            =");
			System.out.println("===================================");			
			System.out.println("| 001 - Funcionario               |");
			System.out.println("| 002 - Caixa                     |");
			System.out.println("| 100 - Sair                      |");			
			System.out.println("|-------------------------------- |");
			System.out.printf("|Digite a opção que deseja:");
			int opcao = in.nextInt();
			
			switch (opcao) {
			case 100:
				viewCaixa.caixaMainView(bancoDio, in);
				break;
			case 2:
				viewCaixa.caixaMainView(bancoDio, in);
				break;
			case 99:
				continuar = false;
				break;
			default:
				break;
			}
			
		}

	}

}
