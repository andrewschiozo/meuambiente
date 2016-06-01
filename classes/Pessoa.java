package classes;

public class Pessoa {

	private int 	id;
	private String 	nome;
	private Data	dataNascimento;
	private String	cpf;
	
	public Pessoa(String nome, Data dataNascimento, String cpf){
		this.setNome(nome);
		this.setDataNascimento(dataNascimento);
		try {
			this.setCpf(cpf);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Data getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Data dataNascimento) {
		this.dataNascimento = dataNascimento;
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
		return "Pessoa [\n\tNome: " + getNome() + "\n\tData Nasc.: " + getDataNascimento() + "\n\tCPF: " + getCpf() + "\n\t]";
	}
	
}
