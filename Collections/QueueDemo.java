package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	 public static void main(String[] args) {
	        // Create and initialize a Queue using a LinkedList
	        Queue<String> elementQueue = new LinkedList<>();

	        // Adding new elements to the Queue (The Enqueue operation)
	        elementQueue.add("element1");
	        elementQueue.add("element2");
	        elementQueue.add("element3");
	        elementQueue.add("element4");

	        System.out.println("WaitingQueue : " + elementQueue);

	        // Removing an element from the Queue using remove() (The Dequeue operation)
	        // The remove() method throws NoSuchElementException if the Queue is empty
	        String name = elementQueue.remove();
	        System.out.println("Removed from WaitingQueue : " + name + " | New WaitingQueue : " + elementQueue);

	        // Removing an element from the Queue using poll()
	        // The poll() method is similar to remove() except that it returns null if the Queue is empty.
	        name = elementQueue.poll();
	        System.out.println("Removed from WaitingQueue : " + name + " | New WaitingQueue : " + elementQueue);
	        
	        // Check is a Queue is empty
	        System.out.println("is waitingQueue empty? : " + elementQueue.isEmpty());

	        // Find the size of the Queue
	        System.out.println("Size of waitingQueue : " + elementQueue.size());

	        // Check if the Queue contains an element
	        String name1 = "Johnny";
	        if(elementQueue.contains(name1)) {
	            System.out.println("WaitingQueue contains " + name1);
	        } else {
	            System.out.println("Waiting Queue doesn't contain " + name1);
	        }

	        // Get the element at the front of the Queue without removing it using element()
	        // The element() method throws NoSuchElementException if the Queue is empty
	        String firstElementInTheWaitingQueue =  elementQueue.element();
	        System.out.println("Waiting Queue (element()) : " + firstElementInTheWaitingQueue);

	        // Get the element at the front of the Queue without removing it using peek()
	        // The peek() method is similar to element() except that it returns null if the Queue is empty
	        firstElementInTheWaitingQueue = elementQueue.peek();
	        System.out.println("Waiting Queue : " + firstElementInTheWaitingQueue);

	    }

}
