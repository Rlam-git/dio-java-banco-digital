package entities;

public class Endereco {

	private Long id;
	private String rua;
	private String Cidade;
	private String Estado;
	private String cep;
	private int numero;
	private String complemento;
	
	public Endereco() {
		
	}
	public Endereco(Long id, String rua, String cidade, String estado, String cep, int numero,
			String complemento) {
		super();
		this.id = id;
		this.rua = rua;
		Cidade = cidade;
		Estado = estado;
		this.cep = cep;
		this.numero = numero;
		this.complemento = complemento;
	}
	public Long getId() {
		return id;
	}	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
		
}
