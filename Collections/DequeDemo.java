package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
	 public static void main(String[] args) {
	     // Creating Deque and adding elements
	     Deque<String> deque1 = new ArrayDeque<String>();
	     deque1.add("element1");
	     deque1.add("element2");
	     deque1.add("element3");
	     // Traversing elements
	     for (String str : deque1) {
	        System.out.println(str);
	     }
	   
	 Deque <String> deque = new ArrayDeque < String > ();
     deque.offer("element1");
     deque.offer("element2");
     deque.add("element3");
     deque.offerFirst("element4");
     System.out.println("After offerFirst Traversal...");
     for (String s: deque) {
         System.out.println(s);
     }
     // deque.poll();
     // deque.pollFirst();//it is same as poll()
     deque.pollLast();
     System.out.println("After pollLast() Traversal...");
     for (String s: deque) {
         System.out.println(s);
     }

}
}




