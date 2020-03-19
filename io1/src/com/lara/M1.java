package com.lara;

import java.io.File;

public class M1 {
	public static void main(String[] args) throws Exception {
		File f1 = new File("hello1.txt");
		f1.createNewFile();
		System.out.println("done");
	}
}

/*
done
by deflt new hellt txt is created...
 */