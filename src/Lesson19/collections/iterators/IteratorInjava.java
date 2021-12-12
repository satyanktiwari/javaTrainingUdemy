package Lesson19.collections.iterators;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorInjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LinkedList<String> animals = new LinkedList<String>();
			animals.add("fox");
			animals.add("cat");
			animals.add("dog");
			animals.add("mouse");
			
			Iterator<String> it = animals.iterator();
			while(it.hasNext()) {
			String janwarType = it.next();
			System.out.println("Janwar ka kism: "+janwarType);
//			item can be removed when using Iterator
			if(janwarType.equals("cat")) {
				it.remove();
			}
			
			}
			System.out.println("--------\n");
			//Modern method
			try {
				for(String janwar: animals) {
					System.out.println("janwar: "+ janwar);
					
//					animals.remove(2);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				System.out.println("Should not iterate and remove using for loop.");
			}
	}

}
