
public class Variables
{
	public static void main(String[] args)
	{
		//int, float, double
		
		long l = 500000001; // 8 bytes
		int i = 4; // 4 bytes -> 32 bytes
		short s =5; //2 bytes -> 16 bits -> 32768 to 32767
		byte b=5; // 1 byte -> 8 bits -> -128 yo 127
		float f = 5.5f;
		double d = 5.5;
		
		char c  = 'A';
		c = 66; // B is ASCII value of 66
		System.out.println(c);
		
		double d1 =5; // implicit conversion
		int k= (int)5.6;
		System.out.println(k);
		
	}

}
