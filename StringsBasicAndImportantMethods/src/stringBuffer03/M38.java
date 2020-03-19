package stringBuffer03;

public class M38 {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("hellotoall");
		System.out.println(sb);
	}
}

/*
OP
---
hellotoall

notes:
******
StringBuffer is a synchronize whereas 
StringBuilder is a non synchronize. 

**question)
what is difference between String and StringBuffer ?

 String()                     StringBuffer()
 ******                       **************     
 immutable 					   mutable

 equals() and					equals() & hashCode()						
 hashCode method                are not over rided
 are over rided

 note:
 *****
 In StringBuffer as equals() and hashCode() are not over rided,
 it can't compare content of the objects.
 
 it is implementing 			whereas here it is not implementing
 comparable interface.          comparable interface.

 as we can compare with         In StringBuffer() sorting is not possible
 the comparable interface,      as comparer interface is not available 
 it is possible to sorting      and unable to compare the object's content
 based on the content.
 
 It can create a new object    Here, it is not possible to create a new object 
 without a new operator.       without a new operator.(It need new operator).
 
  + operator got over rided     + operator is not got over rided 
  only in the String().			in the StringBuffer().	 
 
 To add, it use concat().       here, it use append() to add.
 
 There is no reverse() in       Whereas in the StringBuffer() class, reverse() 
 the String() class.			is available.
 
 There is no delete() in       In BufferString() class, delete()  
 the String class.             is available.      
 
 There is no concept of        Capacity() is available here, as it mutable 
 capacity() in the String(). 
 
 SIMILARITIES
 ************
 ************
 1. Both are used to managing the multiple characters..
 2. In the both the class toString() method is got over rided.
 3. Both the classes are implementing the serilaizable interface..
 4. 
 
 
 */