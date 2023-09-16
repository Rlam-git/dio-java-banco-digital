package entities;

import Enumereds.TipoConta;

public abstract class Conta {
	
	protected int numero;
	protected double saldo;
	protected Pessoa titular;
	protected TipoConta tipo;
	
	public abstract boolean sacar(double valor);
	
	public abstract void depositar(double valor);
	
	public abstract void extrato();
	
	public int getNumero() {
		return this.numero;
	}
	
    public boolean transferir(Conta destino, double valor) {
	boolean saqueRealizado = this.sacar(valor);
		
		if(saqueRealizado == true) {
			destino.depositar(valor);
			return true;
		}		
		return false;	
    }
	
    public TipoConta getTipoConta() {
    	return this.tipo;
    }
}
