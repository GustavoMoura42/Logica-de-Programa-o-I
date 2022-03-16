package Motos;
public class Moto {

	private String marca;
	private String cor;
	private int ano;
	double preco;
	
	public Moto(String marca,String cor,int ano, double preco) {
		this.marca= marca;
		this.cor=cor;
		this.ano=ano;
		this.preco=preco;
	} 
	
	public void list(Moto m) {
		System.out.println(
				"marca:"+marca+"\n"+
		         "cor:"+cor+"\n"+
				"ano:"+ano+"\n"+
		         "preço:"+ preco+ "\n");
		
	}

}