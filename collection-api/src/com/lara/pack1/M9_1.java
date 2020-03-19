package com.lara.pack1;

import java.util.PriorityQueue;

public class M9_1 {
	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue();
		queue.add(900);
		queue.add(90);
		queue.add(0);
		queue.add(9);
		queue.add(800);
		System.out.println(queue);
		System.out.println(queue.poll()); //
		
		System.out.println(queue);
		System.out.println(queue.poll());
		
		System.out.println(queue);
		System.out.println(queue.poll());
		
		System.out.println(queue);
		System.out.println(queue.poll());
		
		System.out.println(queue);
	}
}

/*
OP
---
[0, 9, 90, 900, 800]

now.
----
[0, 9, 90, 900, 800]
0
[9, 800, 90, 900]
9
[90, 800, 900]
90
[800, 900]
800
[900]


priotry queue,
by deflt elemnt are soring in the prioty queue
we can read or remove the head elemnt...

priroty queue..
firts elemnt is sorted and remiang elemen may or may not sorted...

all eelments shd be the same type..

all three conditon shd be satied
- no null
- diff type of ele
- it shd be comparbale type or else we need a saparte comparaor


 */