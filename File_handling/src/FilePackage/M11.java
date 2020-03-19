package FilePackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class M11 {
	public static void main(String[] args) {

				FileWriter fout = null;;
				try
				{
					fout = new FileWriter("data2.txt", true);
					fout.write("Hello to all");
					fout.write("Hello to all\n");
					fout.write("Hello to all");
					fout.write("Hello \n to all");					
				}
				catch(IOException ex)
				{
					ex.printStackTrace();
				}
				finally
				{
					try
					{
					if(fout != null)
					{
					fout.flush();
					fout.close();
					}
				    }
					catch (IOException ex)
					{
						ex.printStackTrace();
					}
					}
		System.out.println("done");
}
}