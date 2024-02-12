package readpackage;

import java.io.IOException;

public class MainExcel {

	public static void main(String args[]) throws IOException {
		String s = ReadFile.getStringData(1, 1);
	     System.out.println(s);
		int i = ReadFile.getIntegerData(1, 0);
		 System.out.println(i);
		
	}
}
 