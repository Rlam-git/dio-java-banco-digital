package entities;

import java.util.Set;

public abstract class Pessoa {
	
	protected Set<Telefone> telefone;
	protected Endereco endereco;
	
	public Pessoa(Set<Telefone> telefone, Endereco endereco) {
		super();
		this.telefone = telefone;
		this.endereco = endereco;
	}

}
