package entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private String nome;
	private int numero;
	private List<Conta> contas = new ArrayList<Conta>();
	
	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public Conta save(final Conta conta) {
		Conta contaExistente = this.findByNumero(conta.getNumero());
		
		if(contaExistente.equals(null)) {
			contas.add(conta);
			return conta;
		}
		
		return contaExistente;
		
	}

	public List<Conta> listAll(){
		return this.contas;
	}
	
	public Conta findByNumero(final int numero) {
		return this.contas.stream().filter(c -> c.getNumero() == numero).findFirst().orElse(null);
	}
	
	public void deleteByNumero(final int numero) {
		Conta conta = this.findByNumero(numero);
		
		if(conta != null) {
			contas.remove(conta);
		}
	}


}
