package com.lara.pack1;

class G implements Runnable
{
	public void run()
	{
		for(int i=0; i<= 1000; i++)
		{
			System.out.println("%%%%%% :" + i);
		}
	}
}
public class M8 {
	public static void main(String[] args) {
		G g1 = new G();
		
		Thread t1 = new Thread(g1);
		t1.start();
		
		Thread t2 = new Thread(g1);
		t2.start();
		
		for(int j=1500; j<=2500; j++)
		{
			System.out.println("######### :" + j);
		}
	}
}
