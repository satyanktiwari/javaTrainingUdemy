package Lesson08.generics;

import java.util.ArrayList;

class Machine{
//Generate a toString Method
	@Override
	public String toString() {
		return "I'm a Machine...";
	}
	
}

class Camera extends Machine{
	@Override
	public String toString() {
		return "I'm a Camera...";
	}
}

public class GenericsAndWildCards {
public static void main(String[] args) {

	ArrayList<Machine> list1 = new ArrayList<Machine>();
	list1.add(new Machine());
	list1.add(new Machine());
	
	ArrayList<Camera> list2 = new ArrayList<Camera>();
	list2.add(new Camera());
	list2.add(new Camera());
	
	showList1(list1);
	showList2(list2);
}

// ? is the wildcard used to denote unknown

public static void showList1(ArrayList<? extends Machine>list) {
	for(Machine value:list) {
		System.out.println(value);
	}
}

public static void showList2(ArrayList<? super Camera>list) {
	for(Object value:list) {
		System.out.println(value);
	}
}

public static void showList3(ArrayList<?>list) {
	for(Object value:list) {
		System.out.println(value);
	}
}
}
