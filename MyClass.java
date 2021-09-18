package hashmapImplementation;
import java.util.HashMap;
public class MyClass {

	public static void main(String[] args) 
	{
		System.out.println("Rashi Sandeep Chudiwal");
		System.out.println("Date 31/5/2021");
		System.out.println("HashMap Implementation :");
		HashMapImp h=new HashMapImp();
		h.add(90,"Nintey");
		h.add(65,"Sixty Five");
		h.add(88,"Eighty Eight");
		h.add(71,"Seventy One");
		h.add(9,"Nine");
		h.add(28,"Twenty Eight");
		h.add(35,"Thirty Five");
		h.add(11,"Eleven");
		h.add(5,"Five");
		h.add(9,"Nine");
		h.print();
		System.out.println();
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(90, "Nintey");
		map.put(65, "Sixty Five");
	    map.put(88, "Eighty Eight");
		map.put(71, "Seventy One");
		map.put(9, "Nine");
		map.put(28, "Twenty Eight");
		map.put(35, "Thirty Five");
		map.put(11, "Eleven");
		map.put(5, "Five");
		map.put(9, "Nine");
		System.out.println(map);

	}

}
