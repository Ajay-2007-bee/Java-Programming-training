package collection_framework;
 import java.util.*;
public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<Integer> nodes = new LinkedList<>();
		
		nodes.add(12);
		nodes.add(34);
		nodes.add(40);
		nodes.add(30);
		nodes.add(0,5);
		nodes.addFirst(44);
		nodes.add(nodes.size()/2 , 45); //middle add 
		
		System.out.println(nodes);
	}

}
