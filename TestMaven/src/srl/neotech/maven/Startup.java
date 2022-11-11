package srl.neotech.maven;

import com.diogonunes.jcolor.Ansi;
import com.diogonunes.jcolor.Attribute;
import com.github.javafaker.Faker;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Ciao");
     Attribute bkgColor = Attribute.BACK_COLOR(56, 78, 120);
     
     System.out.println(Ansi.colorize("Testo Colorato", bkgColor));
     Faker faker = new Faker();

     for (int i=0;i<1000;i++) { 
     String name = faker.name().fullName();
     String firstName = faker.name().firstName();
     String lastName = faker.name().lastName();
     System.out.println(name+" "+firstName+" "+lastName);
     }
     
	}

}
