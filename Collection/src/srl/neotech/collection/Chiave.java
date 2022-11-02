package srl.neotech.collection;

public class Chiave implements Comparable<Integer>{
	
	private String targa;
	private Integer numeridiGiorniDisponibili;
	
	public Chiave(String targa, Integer numeroGiorni) {
		this.targa=targa;
		this.numeridiGiorniDisponibili=numeroGiorni;
	}
	
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public Integer getNumeridiGiorniDisponibili() {
		return numeridiGiorniDisponibili;
	}
	public void setNumeridiGiorniDisponibili(Integer numeridiGiorniDisponibili) {
		this.numeridiGiorniDisponibili = numeridiGiorniDisponibili;
	}



	@Override
	public int compareTo(Integer o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
