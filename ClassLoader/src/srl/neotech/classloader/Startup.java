package srl.neotech.classloader;

import com.diogonunes.jcolor.Ansi;
import com.diogonunes.jcolor.AnsiFormat;
import com.diogonunes.jcolor.Attribute;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Prova di scrittura");
		System.out.println("Prova di blu");
		AnsiFormat af=new AnsiFormat(Attribute.BLUE_BACK());
        System.out.print(Ansi.colorize("Prova Uno", af));
        System.out.println();
        AnsiFormat af2=new AnsiFormat(Attribute.BRIGHT_MAGENTA_BACK());
        System.out.print(Ansi.colorize("Prova Due", af2));
        System.out.println("");
        
	}

}
