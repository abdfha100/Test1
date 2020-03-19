package io2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class M7 {
		public static void main(String[] args) {
			File f1 = new File("test3.txt");  
			FileReader fin = null;
			try
			{
				File f1 = new FileReader(f1);
				char[] chars = new char[110];
				fin.read(chars);
				String s1 = new String(chars);
				System.out.println(s1);
			}
			catch(IOException ex)
			{
				ex.printStackTrace();
			}
			
			finally
			{
				if(fin != null)
				{
					try
					{
						fin.close();
					}
					catch(IOException ex)
					{
						ex.printStackTrace();
					}
				}
			}
			
			
				}
			
		
			
		}

}
