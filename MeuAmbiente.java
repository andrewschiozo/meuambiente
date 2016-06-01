import classes.Data;
import classes.Pessoa;

public class MeuAmbiente {

	public static void main(String[] args) {
		Data andrewsData = new Data(13,01,1993);
		Pessoa andrews = new Pessoa("Andrews", andrewsData, "39075063830");
		System.out.println(andrews);
				
	}

}
