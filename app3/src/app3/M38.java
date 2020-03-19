package app3;

public class M38 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("hellotoall");
		System.out.println(sb);
	}
}

/*
hellotoall

StringBuilder, what ever the StringBuffer has, the same having in the stringbuilder..

but there is one change..
stringBuffer is synchrornised, 
wehereas 
stingbuilder is nonsynchornise.


differnc bet string and stingbuffer

1) string is immmuatble in string and in  stingbff the strring is mutabl

2) hashcode() and equals are overided and but here these two are not overided.

3) String cls implementing comparalbe interface, and string buff cls is  incmparble interface..
   so that we can do the sorting...                  we cant acihfve sorted here based on the contne
   more dlts abt sortoing during clling API 

4) we can creat stirng objce wihtout new operatr      but in sting buffer we have to use new operot to crete sting obj.



5) + operarot is overloaddo only for the string objce , but we cant use + for the stinrg buffer cls.


6) concat() mehtd in the sting clss                        but stirngBuffr we hve to use append() mthd.

7) there is no revrse mthod in strin clss                   butr stinrBuff, there is a reverse() mthd..

8) inside the sting no delte() mtd                          in strngBuff, there is delete() is there..

9)in string there is no conctt of capaity                 but stinBuff, we have capasity becus of mutalb
  as it is immutlbe




smillarty
---------

1) both are used to manange mlultipl charecters...

2) in bth the classes the toString() mehd got over rided.

3) both the clases are implenting serilablsle interfaces..
   more ditls on sirliation during file hanling... 


 
 
 
 
 
 
 




 */