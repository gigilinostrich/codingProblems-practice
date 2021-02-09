import java.util.*;
import java.util.Map.Entry;
public class jimAndTheOrders {

	public static void main(String[] args) {
		
	//	8 1
	//	4 2
	//	5 6
	//	3 1
	//	4 3
		//4 2 5 1 3
		
		int [][] orders = {{8,3},{5,6},{6,2},{2,3},{4,3}};
		int row = orders.length;
		int col = orders[0].length;
		HashMap<Integer,Integer> customerServeTime = new HashMap <Integer,Integer>();
		for (int i = 0; i < row; i++) {
			for (int j = 1; j < col; j++) {
			int order = orders[i][0];
			int prep =  orders[i][1];
			int person = i+1;
			int serveTime = order + prep;
			System.out.println("customer " + person + " order " + order + " prep " + prep + " servetime " + serveTime);

			customerServeTime.put(person, serveTime);
			}
		}
	      LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
		List <Integer> mapValuesList = new ArrayList<Integer>(customerServeTime.values());
		System.out.println(customerServeTime);
		// sort the values in ascending order
		Collections.sort(mapValuesList, new Comparator<Integer>() {
	         public int compare(Integer str, Integer str1) {
	            return (str).compareTo(str1);
	         }
	      });
	      for (Integer i : mapValuesList) {
	         for (Entry<Integer, Integer> entry : customerServeTime.entrySet()) {
	            if (entry.getValue().equals(i)) {
	               sortedMap.put(entry.getKey(), i);
	            }
	         }
	      }
	      System.out.println("customers to serve " + sortedMap.keySet());
	
		
	}

}
