package classes;

public class Endereco {

	private String cep;
	
	public Endereco(String cep){
		this.setCep(cep);
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "Cep da ocorrência: " + getCep();
	}
	
	
}
