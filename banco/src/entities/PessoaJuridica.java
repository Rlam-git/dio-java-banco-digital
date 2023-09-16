package entities;

public class PessoaJuridica {
	
	private String rasaoSocial;
	private String cnpj;
	
	public PessoaJuridica(String rasaoSocial, String cnpj) {
		super();
		this.rasaoSocial = rasaoSocial;
		this.cnpj = cnpj;
	}
	public String getRasaoSocial() {
		return rasaoSocial;
	}
	public void setRasaoSocial(String rasaoSocial) {
		this.rasaoSocial = rasaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
