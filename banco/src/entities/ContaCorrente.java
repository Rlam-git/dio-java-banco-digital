package entities;

import java.time.LocalDateTime;

import Enumereds.TipoConta;

public class ContaCorrente extends Conta{

	private double limite;
	
	public ContaCorrente(double saldo, double limite) {
		this.limite = limite;
		this.saldo = saldo;
		this.tipo = TipoConta.CORRENTE;
	}

	@Override
	public void extrato() {
		LocalDateTime data = LocalDateTime.now();
		System.out.println("Data:"+data);
		System.out.println("Conta:"+ this.numero);
		System.out.println("Saldo:"+ this.saldo);
		System.out.println("Limite:"+ this.limite);
	}

	@Override
	public boolean sacar(double valor) {
		
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		
		if(this.saldo + this.limite >= valor) {
			this.saldo -= valor;
			return true;
		}
		
		return false;
		
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}

 	public double getLimite() {
		return this.limite;
	}
	
	public boolean alterarLimite(double valor) {		
		if(this.saldo < 0 && this.limite - this.saldo < valor ) {
			return false;
		}
		this.limite -= valor;
		return true;
	}

	@Override
	public String toString() {
		return "Conta Corrente : [numero=" + numero + ", saldo=" + saldo + ", limite=" + limite + "]";
	}
	
}
