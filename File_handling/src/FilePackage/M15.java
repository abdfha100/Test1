package FilePackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class M15 {
	public static void main(String[] args) {
		File f1 = new File("data1.txt");
		try(FileReader fin = new FileReader(f1);
				BufferedReader bin = new BufferedReader(fin))
		{
			String s1;
			while((s1 =bin.readLine()) != null)
			{
			System.out.println(s1);
			}
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
}