package FilePackage;

import java.io.FileWriter;
import java.io.IOException;

public class M12 {
	public static void main(String[] args) 
	{
		try(FileWriter fout = new FileWriter("data3.txt", true))
		{
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
		}
         System.out.println("done");
}
}
/*
 2 limiaton while using FileWriter
 1)there in no mthd to bring the cursor next line
 we have to go for explictiy /n.
 
 2) wihtout buffer, very expensive
 performance is very less
 incase file system or websevices or data base
 we have to use to buffer or cash 
 
 */