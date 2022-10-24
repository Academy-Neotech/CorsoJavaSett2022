package srl.neotech.corsojava.test02;

public class Startup {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
    System.out.println("aaaa");
    int a=1; //16byte
    char c='c';//1byte
    double d=3.46; //16byte
    boolean e=true; //1byte
    System.out.println(a);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    
    Moka  mokaDiMatteo=null;
    mokaDiMatteo=new Moka();
    mokaDiMatteo.anni=34;
    
	}

}
