package com.lara;

import java.io.File;

public class M12 {
	public static void main(String[] args) {
		File f1 = new File("dir1");  // not required try-catch or throws
		f1.mkdir();
	    System.out.println("done");
	}
}


/*
done
it created a new directory(dir1) in the project folder

 */