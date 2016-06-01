package interfaces;

abstract public interface iPersistencia {
	
	abstract public boolean salvar();
	
	abstract public String ler(int id);
	
	abstract public boolean editar();
	
	abstract public boolean apagar(int id);
	
}
