package collections.sortinglists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s1.length();
		if (len1 > len2) {
			return 1;
		} else if (len1 < len2) {
			return -1;
		}

		return 0;
	}

}


class AlphabaticalComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s1.length();
		if (len1 > len2) {
			return 1;
		} else if (len1 < len2) {
			return -1;
		}

		return 0;
	}

}
public class SortingLists {
	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();
		animals.add("tiger");
		animals.add("lion");
		animals.add("snake");
		animals.add("moongoose");
		animals.add("elephant");
//	For some reason length does not sort.
		Collections.sort(animals, new StringLengthComparator());

		for (String zanwar : animals) {
			System.out.println(zanwar);
		}

		List<Integer> number = new ArrayList<Integer>();
		number.add(23);
		number.add(12);
		number.add(33);
		number.add(01);
		number.add(59);
		number.add(62);

		Collections.sort(number);

		for (Integer aank : number) {
			System.out.println(aank);
		}
	}
}
