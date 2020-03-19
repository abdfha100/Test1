package FilePackage;

import java.io.File;


public class M4 {
	 public static void main(String[] args) {
						File f1 = new File("F:\\aug-8th\\File","dir3");
						System.out.println(f1.exists());
						System.out.println(f1.mkdirs());
						System.out.println(f1.exists());
	 }
}
/*
 for dir creation try catch expe is not required..
 File f1 = new File("dir1");
 File f1 = new File("F:\\aug-8th\\\\FileHandling\\dir1");
 File f1 = new File("F:\\aug-8th\\\\FileHandling","dir2");
 File f1 = new File("F:\\aug-8th\\File","dir3");
 even that path is not avaioble for dir it will not throw IO exeption..
 */
