package classes;

public class Pessoa {

	private String 	nome;
	private String	cpf;
	
	public Pessoa(String nome, String cpf){
		this.setNome(nome);
		try {
			this.setCpf(cpf);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) throws Exception {
		if(cpf.length() == 11){
			this.cpf = cpf;
		} else {
			throw new Exception("CPF inválido");
		}
	}

	
	@Override
	public String toString() {
		return "Nome do cidadão: " + getNome() + "\nCPF: " + getCpf() + "\n";
	}
	
}
