package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class mapForEach {
	
	public static void main(String[] args)
	{
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(0);
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		arrayList.add(60);
		arrayList.add(70);
		arrayList.add(80);
		arrayList.add(90);
		arrayList.add(100);
		
		System.out.println(arrayList);
		
		List<Integer> list = arrayList.stream().map(i -> i + 10).collect(Collectors.toList());
		
		list.stream().forEach(i -> System.out.println(i + " "));
		
		System.out.println(" ");
		
		list.stream().forEach(System.out::println);
		
		
		
	}
	
	
	
	
}