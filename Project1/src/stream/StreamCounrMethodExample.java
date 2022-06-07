package stream;
import java.util.ArrayList;
import java.util.List;

public class StreamCounrMethodExample {
	
	public static void main(String[] args) {
		List<String>nameList = new ArrayList<>();
		nameList.add("INDIA");
		nameList.add("RUSSIA");
		nameList.add("AMERICA");
		nameList.add("AUSTRALIA");
		nameList.add("ENGLAND");
		Long count = nameList.stream().filter(s -> s.length() > 5).count();
		System.out.println("Total name with more than 5 length is"+count);
		
	}

}
