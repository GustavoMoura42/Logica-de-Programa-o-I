package Cliente;
import java.util.Date;

import Carros.Carro;

	public class Cliente {
		
		private String nome, cpf, email, telefone;
		private Date nasc;
		private boolean alugado;
		
		public Cliente(String nome, String cpf, String email, String telefone,Date nasc, boolean alugado) {
			super();
			this.nome = nome;
			this.cpf = cpf;
			this.email = email;
			this.telefone = telefone;
			this.nasc = nasc;
			this.alugado = alugado;
		}
		
		public void list (Cliente c) {
		System.out.println
		("nome: " + nome + "\n" +
		"cpf: "+ cpf + "\n"+
		"email: "+ email + "\n"+
		"telefone: "+ telefone + "\n"+
		"dia do aluguel: "+ nasc + "\n" +
		"veiculo alugado: " + alugado+ "\n"
		);
		}

}

