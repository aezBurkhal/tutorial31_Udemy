import java.util.ArrayList;
import java.util.HashMap;


public class App {

	public static void main(String[] args) {
		
		////////////////////////Before java 5 ////////////////////////
		
		ArrayList list = new ArrayList();
		
		list.add("apple");
		list.add("orange");
		list.add("banana");
		
		String fruit = (String)list.get(1);
		System.out.println(fruit);
		
		
		///////////////Modern style/////////////////
		
		ArrayList<String> strings = new ArrayList<String>();
		
		strings.add("cat");
		strings.add("dog");
		strings.add("alagator");
		
		String animal = strings.get(1);
		
		System.out.println(animal);
		
		//////////////////there can be more than one type arguement/////
		
	HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		/////////////Java 7 style/////////////
		
		
		ArrayList<Integer> someList = new ArrayList();
		
		
	}

}
