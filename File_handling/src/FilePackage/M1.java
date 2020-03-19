package FilePackage;

import java.io.File;
import java.io.IOException;

public class M1 
{
	public static void main(String[] args)
	throws IOException
	{
		File f1 = new File("test4.lara");
		System.out.println(f1.exists());
		System.out.println(f1.createNewFile());
		System.out.println(f1.exists());
	}
}
