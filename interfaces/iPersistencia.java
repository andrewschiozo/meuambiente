package interfaces;

abstract public interface iPersistencia {
	
	abstract public boolean salvar();
	
	abstract iPersistencia ler();
	
	abstract iPersistencia editar();
	
	abstract iPersistencia apagar();
	
}
