package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ContaPoupanca extends Conta{
	
	private LocalDate dataAplicacao;

	@Override
	public boolean sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}	
		return false;		
	}
	
	public void aplicar(double valor) {
			this.saldo += valor;
	}
	
	@Override
	public void extrato() {
		LocalDateTime data = LocalDateTime.now();
		System.out.println("Data:"+data);
		System.out.println("Conta:"+ this.numero);
		System.out.println("Saldo:"+ this.saldo);
	}
	
	@Override
	public String toString() {
		return "ContaPoupanca [numero=" + numero + ", dataAplicacao=" + dataAplicacao + ", saldo=" + saldo + "]";
	}

	@Override
	public void depositar(double valor) {

	}

	
}
