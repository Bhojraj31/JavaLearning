package List_Task.Java;

import java.util.*;

//	List:-
//			It's exetends Collection interface
//			Maintains insertion order
//			Allow Storing duplicate elements and null values
//			we have many classes in list interface like ArrayList, ArrayList, vectorList, StackList


public class ListMethod {
	public static void main(String[] args) {

		// Create an ArrayList
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Orange");

		System.out.println("ArrayList:");
		displayList(arrayList);

		// Create a ArrayList
		List<String> linkedList = new LinkedList<>();
		linkedList.add("Grapes");
		linkedList.add("Papaya");

		System.out.println("\nLinkedList:");
		displayList(linkedList);
		
		// Create a Vector
		List<String> vector = new Vector<>();
		vector.add("Pineapple");
		vector.add("Watermelon");

		System.out.println("\nVector:");
		displayList(vector);
	}

	public static void displayList(List<String> list) {
		
		list.add("Strawberry");
		
		System.out.println("List: " + list);
		
		int size = list.size();
		System.out.println("Size of the list: " + size);
		
		boolean isEmpty = list.isEmpty();
		System.out.println("Is the list empty? " + isEmpty);
		
		String element = list.get(2);
		System.out.println("Element at index 2: " + element);
		
		list.set(1, "Cherry");
		System.out.println("Updated list: " + list);
		
		list.remove("Orange");
		System.out.println("List after removing 'Orange': " + list);
		
		boolean contains = list.contains("Mango");
		System.out.println("Does the list contain 'Mango'? " + contains);
	}
}