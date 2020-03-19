package FilePackage;

import java.io.File;
import java.io.IOException;

public class M2 {
	public static void main(String[] args)
			throws IOException
			{
				File f1 = new File("test5.txt");
				System.out.println(f1.exists());
				try
				{
					System.out.println(f1.createNewFile());					
				}
				catch(IOException ex)
				{
					ex.printStackTrace();
				}
				System.out.println(f1.exists());
			}
}
