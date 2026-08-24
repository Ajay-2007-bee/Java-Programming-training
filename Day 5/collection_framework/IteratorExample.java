package collection_framework;
import java.util.Iterator;
import java.util.LinkedList;
public class IteratorExample {

	public static void main(String[] args) {
		LinkedList<String>names = new LinkedList<>();
		names.add("suresh");
		names.add ("ramesh");
		names.add ("rajesh") ;
		names.add ("vignesh") ;
		 
		Iterator<String> itr = names.iterator();
		while(itr.hasNext() ){
			System.out.println(itr.next());
		}

	}

}
