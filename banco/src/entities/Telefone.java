package entities;

import Enumereds.Ddd;
import Enumereds.TipoTelefone;

public class Telefone {
	
	private Long id;
	private Ddd ddd;
	private String numero;
	private TipoTelefone tipo;
	
	public Telefone() {
		
	}
	
	public Telefone(Long id, Ddd ddd, String numero, TipoTelefone tipo) {
		super();
		this.id = id;
		this.ddd = ddd;
		this.numero = numero;
		this.tipo = tipo;
	}
	
	public Ddd getDdd() {
		return ddd;
	}
	public void setDdd(Ddd ddd) {
		this.ddd = ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public TipoTelefone getTipo() {
		return tipo;
	}
	public void setTipo(TipoTelefone tipo) {
		this.tipo = tipo;
	}
	public Long getId() {
		return id;
	}
	
	

}
