package FilePackage;

import java.io.File;


public class M7 {
	public static void main(String[] args)
			{
				File f1 = new File("test1.txt");
				System.out.println(f1.isFile());
				System.out.println(f1.isDirectory());
				String s1 = f1.getName();
				System.out.println(s1);
				System.out.println(f1.getName());
			}

}
