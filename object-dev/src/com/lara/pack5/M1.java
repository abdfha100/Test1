package com.lara.pack5;
class A
{
	static A obj;
	protected void finalize() throws Throwable {
		obj = this;
		System.out.println("from finalize");		
	}
}
public class M1 {
	public static void main(String[] args) {
		A a1 = new A(); //refecne creare
		System.out.println(1 + ":" + a1);
		System.out.println(2 + ":" + A.obj);
		Util.sleep(1000);
		a1 = null; // refence removing.. so it will become dead 
		System.gc();
		Util.sleep(1000);
		System.out.println(3 + ":" + a1);
		System.out.println(4 + ": " + A.obj);
		A.obj = null;
		Util.sleep(1000);
		System.gc();
		System.out.println(5 + ":" + a1);
		System.out.println(6 + ": " + A.obj);
		System.out.println("end");
	}
}
class Util
{
	static void sleep(long millis)
	{
		try
		{
			Thread.sleep(millis);
		}
		catch(InterruptedException  ex)
		{
			ex.printStackTrace();
		}		
	}
}

/*
OP
-----
end

notes:
------
finalize is a objec clas method..
objec is min one refe, then it si knows live obje..
one obj can hav any no of refererences..

if we remove all the references form the object, then it will become abundant object..
we can also called as dead object..

resruected object (dead obje coming back to live , bocos of new added refererence)


garbage object. it(abundant object) is eligible for garbage collection...

in java, there is garbage collector and it is demon thread(dependent on parent theread)
once in a while it will check in the heap momory and check any abduant obje then it will call finalise to 
check any rferre ara there or not. if not it will be romoved frm  the heap memory.

note: the abundant obje is not immmeidately remved from the obj, but the garabage collectir once in a whil
chek in the heap moomoyr and call the fianlise() then it will be revmore the dead objects......

uncertain - whn obje is remoing from the heap momor, but
ceratin - we can when object is becoming an abdundnat object..

here, fianlaise is not called, bcso the executiion is complted...
here neglible amount of memory usage..
gabage collector will come frequnltly when mombry usage is very high.


requet to G-C (garabageCollector)

System.gc();
Runtime.getRuntime().gc();

demaon therad
it is a background thread..

Main thread
child therd 
all are customer serving thread..
it will be used to run at the forground..
by deflt every child is a user thread...

user thread are high priroty 



***************************************************
OP
---
1:com.lara.pack5.A@1db9742
2:null
from finalize
3:null
4: com.lara.pack5.A@1db9742
5:null
6: null
end


If at all the resurrected object becomes a abundant object, 
it will be removed without calling the finally()
on any object, finally() won't call more than one time...

if the finalize() [System.gc()] is calling from the main(),
will it remove the the abundant object or not.

we can't remove any object explicity from memmory in JAVA.
but we can make eligile to romvee by diong remoing the the references...
 
 three final
 
 1- final is a keyword - restcinting to any specilizaion. 
 2- finllay is block availbe in the try-catch - in oreder to execute mand stm in evry flow no matter rasied expeionto or finally blk will be exuted..
 
  3- finalize() it is method, or identified and availble in the object class.
    and it used to remove the abundant objects from the heap momory...
  
  it can inherit to any cls and incoprate the stsm 
 
 
 */