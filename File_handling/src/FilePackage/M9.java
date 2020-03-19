package FilePackage;

import java.io.File;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class M9 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the path");
		String path = sc.next();
		File f1 = new File(path);
		File[] files = f1.listFiles();
		int fileCount = 0;
		//System.out.println(files.length);
		Map map = new HashMap();
		String fileExtention;
		for (File file : files)
		{
			if(file.isFile())
			{
				fileCount ++;
			}
			fileExtention = extention(file.getName());
			if(map.get(fileExtention)== null)
    {
	map.put(fileExtention, 1);
	}
    else
    {
	map.put(fileExtention, ((Integer)map.get(fileExtention) + 1));
	}
 }
		System.out.println(map);
}
	private static String extention(String fileName)
	{
		return fileName.substring(fileName.indexOf(".") + 1);
	}

}
