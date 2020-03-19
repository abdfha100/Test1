package FilePackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class M10 
	{
		public static void main(String[] args)
		throws IOException
		{
			//File f1 = new File("data.txt");
			FileWriter fout = new FileWriter("data1.txt", true);
			fout.write("Hello to all");
			fout.write("Hello to all\n");
			fout.write("Hello to all");
			fout.write("Hello \n to all");
			fout.flush();
			fout.close();
			System.out.println("done");
			}
     }
/*
 there is no builtin mthd to produece new line, we can use '/n' 
 if file is not there, it will create the new file
 FileWriter fout = new FileWriter("data1.txt", true);
 once write is complete, we have to use flush();
 and then close();
 
*/
