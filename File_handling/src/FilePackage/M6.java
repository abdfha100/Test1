package FilePackage;

import java.io.File;
import java.io.IOException;

public class M6 {
	public static void main(String[] args)
	throws IOException
	{
		File f1 = new File("F:\\aug-8th\\FileHandling");
		File f2 = new File(f1, "test.doc");
		System.out.println(f2.createNewFile());
		System.out.println("done");
	}	
}
