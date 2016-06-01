import classes.Data;
import classes.Pessoa;
import classes.Problema;
import classes.Registro;

public class MeuAmbiente {

	public static void main(String[] args) {
		Data andrewsData = new Data(13,01,1993);
		Pessoa andrews = new Pessoa("Andrews", andrewsData, "39075063830");
		Problema problema1 = new Problema("Despejo de esgoto em rio", "Tratamento do esgoto");
		Registro registro = new Registro(andrews, problema1);
		//System.out.println(andrews);
		//System.out.println(problema1);
		System.out.println(registro);
	}

}
