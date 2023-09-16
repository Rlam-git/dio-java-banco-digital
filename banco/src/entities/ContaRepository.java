package entities;

import java.util.ArrayList;
import java.util.List;

public class ContaRepository {
	
	private static List<Conta> contas = new ArrayList<Conta>();
	
	public List<Conta> findAll(){
		return contas;
	}
	
	public Conta findByNumero(final int numero) {		
		return contas.stream().filter(c -> c.numero == numero).findFirst().orElse(null);
	}
	
	public void save(Conta conta) {	
		contas.add(conta);
	}
	
	public void deleteByNumero(int numero) {
		
		Conta conta = findByNumero(numero);
		 if(conta != null) {
			 contas.remove(conta);
		 }
	}
		
}
