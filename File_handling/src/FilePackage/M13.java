package FilePackage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class M13 {
	public static void main(String[] args) 
	{
		try(FileWriter fout = new FileWriter("data4.txt", true);
				BufferedWriter bout = new BufferedWriter(fout))
				
		{
			bout.write("Hello to all");
			bout.write("Hello to all");
			bout.newLine();
			bout.write("Hello to all");
			bout.write("Hello \n to all");					
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
		}
         System.out.println("done");
}
}