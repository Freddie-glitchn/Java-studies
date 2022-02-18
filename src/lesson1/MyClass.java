package lesson1;
import java.util.ArrayList;
public class MyClass {

	public static void main(String[] args) {
		int simple_array[] = new int[5];
		
		ArrayList<Integer> myList= new ArrayList<Integer>(5);
		myList.add(1);
		myList.add(3);
		myList.add(2);
		myList.add(8);
		myList.add(4);
		
		for(Integer x: myList)
			System.out.println(x);
		
		System.out.println("Size = " + myList.size());
		
		myList.remove(2);
		myList.set(0, 100);
		
		for (Integer x: myList)
			System.out.println(x);
		System.out.println("Size = " + myList.size());
		myList.set(0, 100);
	}

}
