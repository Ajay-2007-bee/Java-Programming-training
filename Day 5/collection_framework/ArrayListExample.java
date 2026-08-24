package collection_framework;

import java.util. ArrayList;
import java.util.Arrays;
import java.util.List;

	public class ArrayListExample {
	
		public static void main(String[] args) {
			Integer arr[] = { 10,20,30,40,50};
			
			List<Integer> list =new ArrayList<>();
			list.addAll(Arrays.asList(arr));
//			nums.add (10);
//			nums.add (20);
//			nums.add(30);
			System. out.println (list);
			list.remove(2);
			list.remove(Integer.valueOf(10));
			System. out.println (list);
			list.addAll(Arrays.asList(arr));
			System. out.println (list);
			for (int  a : list) {
				System.out.println(a);
			}
			list.clear();
	
	}
}