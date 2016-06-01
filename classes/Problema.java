package classes;

public class Problema {
	
	private int id;
	private String descricao;
	private String sugestaoMelhoria;
	
	public Problema(int id, String descricao ){
		this.setId(id);
		this.setDescricao(descricao);
	}
	
	public Problema(int id, String descricao, String sugestaoMelhoria ){
		this.setId(id);
		this.setDescricao(descricao);
		this.setSugestaoMelhoria(sugestaoMelhoria);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSugestaoMelhoria() {
		return sugestaoMelhoria;
	}

	public void setSugestaoMelhoria(String sugestaoMelhoria) {
		this.sugestaoMelhoria = sugestaoMelhoria;
	}
	
}
