package persistencia;
import interfaces.iPersistencia;

public class pPessoa implements iPersistencia{

	@Override
	public boolean salvar() {

		return true;
	}

	@Override
	public String ler() {

		return "";
	}

	@Override
	public boolean editar() {

		return true;
	}

	@Override
	public boolean apagar() {

		return true;
	}

}
