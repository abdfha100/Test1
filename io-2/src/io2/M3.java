package io2;

import java.io.FileWriter;
import java.io.IOException;

public class M3 {
	public static void main(String[] args) throws IOException {
		FileWriter out  = new FileWriter("test3.txt", true);
		out.write("Hello4434344");
		out.write("test");
		out.write("abc454353q");
		out.write("\n");
		out.write("xyz");
		out.write("end");
		out.flush(); //while write flush() and close()
		out.close();
		System.out.println("done");
	}
}
