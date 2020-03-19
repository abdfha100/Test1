package FilePackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class M16 {
		public static void main(String[] args) {
			File f1 = new File("E:\\JDK8.0\\README.html");
			int linesCount = 0;
			int wordsCount = 0;
			int charsCount = (int) f1.length();
			
			try(FileReader fin = new FileReader(f1);
					BufferedReader bin = new BufferedReader(fin))
			{
				String s1;
				while((s1 =bin.readLine()) != null)
				{
					linesCount ++;
					wordsCount += s1.split(" ").length;
				System.out.println(s1);
				}
			}
			catch(IOException ex)
			{
				ex.printStackTrace();
			}
			System.out.println("No of Lines: " + linesCount);
			System.out.println("No of words: " + wordsCount);
			System.out.println("No of chars: " + charsCount);
		}
}