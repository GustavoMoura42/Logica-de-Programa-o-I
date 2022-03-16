package Cliente;
import java.util.Date;
import Carros.Carro;

public class main {

	public static void main(String[] args) {
		Date hoje = new Date();
		Cliente c1= new Cliente ( "jao","23256578941","emailbrabo@gg.com","80028922",hoje,true);
	
		Cliente c2= new Cliente ("ana","45213265498","emailantigo@gg.com","22982008",hoje,false);
		 
		c1.list(c2);

	}

}
