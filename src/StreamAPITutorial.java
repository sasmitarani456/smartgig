import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPITutorial {
	public static void main(String[] args) {
		List<Integer> listInt = Arrays.asList(40,55,77,10,10);
		List<String> listStr = Arrays.asList("swastik","mama","Kali","mama","papu","sasmita","swastik");
		List<Integer> lst = listInt.stream().filter(i-> i%2==0).collect(Collectors.toList());
	    List<Integer> lstMap = listInt.stream().map(i->i*i).collect(Collectors.toList());
	    List<Integer> sortList = 
	    		listInt.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
	    List<String> sortStrList = 
	    		listStr.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());

	    System.out.println(sortStrList);
	    //[Kali, mama, mama, papu, sasmita, swastik, swastik]
		
	}

}
