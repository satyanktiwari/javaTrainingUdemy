package collections.queue;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueuesInCollectionsClass {
	public static void main(String[] args) {
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
//		add method will throw exception if length is exceeded
		q1.add(10);
		q1.add(20);
		q1.add(30);
		
		try {
			q1.add(40);
		} catch (IllegalStateException  e) {
			// TODO Auto-generated catch block
			System.out.println("Length of queue exceeded. "
					+ "Trying to add to a queue which is full");
		}
		System.out.println("\nElements in queue are");
		for(Integer elements:q1) {System.out.println(elements);}
		
//		element method - view the element at head
		int value;
		value = q1.element();
		System.out.println("value at head is: "+ value);
		
		
//		Remove method removes element at the head
		int removedValue = q1.remove();
		System.out.println("Removed element is: "+ removedValue);
//		Handling exception in remove method
		q1.remove();
		q1.remove();
		try {
			q1.remove();
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("Element not found. "
					+ "Trying to delete from empty queue");
		}
		
//		Following methods will not throw an error
//		offer, poll and peek - these will either return boolean or null
		
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);
		System.out.println("View element in queue at head: "+ q2.peek());
		q2.offer(11);
		q2.offer(12);
		
		if (q2.offer(13)==false) {
			System.out.println("\noffer failed to add third item");
		}
		System.out.println("View element in queue at head: "+ q2.peek());
		
		System.out.println("\nValues in q2 are:");
		for (Integer value1:q2) {
			System.out.println(value1);
		}
		
		System.out.println("Queue 2 poll: "+ q2.poll());
		System.out.println("Queue 2 poll: "+ q2.poll());
		System.out.println("Queue 2 poll: "+ q2.poll());//This will return null
	}
}
