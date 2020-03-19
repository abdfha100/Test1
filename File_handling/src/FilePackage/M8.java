package FilePackage;

import java.io.File;

public class M8 
{
	public static void main(String[] args)
	{
		File f1 = new File("F:\\aug-8th\\FileHandling");
		File[] files = f1.listFiles();
		for (File file : files)
		{
			System.out.println(file.getName());
		}
	}
}
