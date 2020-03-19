package FilePackage;

import java.io.File;

public class M5 {
	public static void main(String[] args) {
		File f1 = new File("F:\\aug-8th\\FileHandling");
		File f2 = new File(f1, "dir4");
		System.out.println(f2.mkdir());
		System.out.println("done");
}
}