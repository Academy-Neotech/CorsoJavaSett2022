package srl.neotech.maven2;

import com.diogonunes.jcolor.Ansi;
import com.diogonunes.jcolor.Attribute;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Attribute bkgColor = Attribute.BACK_COLOR(56, 78, 120);
	     System.out.println(Ansi.colorize("Testo Colorato", bkgColor));
	}

}
