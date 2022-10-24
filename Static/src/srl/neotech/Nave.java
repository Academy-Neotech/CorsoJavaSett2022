package srl.neotech;

public class Nave {
	
	private  int lunghezza;
	private  String nome;
	
	
	public static void naviga() {
		System.out.println("Sto navigando");
	}
	
	
	public int getLunghezza() {
		return lunghezza;
	}
	public void setLunghezza(int lunghezza) {
		this.lunghezza = lunghezza;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
