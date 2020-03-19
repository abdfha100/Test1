package FilePackage;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class M14 {
	public static void main(String[] args) {
		File f1 = new File("data1.txt");
		try(FileReader fin = new FileReader(f1))
		{
			char[] chars = new char[(int) f1.length()];
			fin.read(chars);
			String s1 = new String(chars);
			System.out.println(s1);
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
/*
 in case of writing fiel is not reqirried, it will craet and wirht
 werher as for reading fiel is rquered
 */
 