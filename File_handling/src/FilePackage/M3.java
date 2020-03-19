package FilePackage;

import java.io.File;
import java.io.IOException;

public class M3 {
		public static void main(String[] args)
				throws IOException
				{
					File f1 = new File("F:\\aug-8th\\FileHandling","test8.txt");
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

/*if there is no such path it will throw IO exception */

/*"F:\\aug-8th\\FileHandling","test8.txt this type dec is 
 * also accceptable*/ //
 