import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap {
	public static void main(String[] args) {

		java.util.HashMap<Integer, String> hm = 
				new java.util.HashMap<Integer, String>();
		hm.put(1, null);
		hm.put(2, "ganesh");
		hm.put(3, "gaurav");
		hm.put(5, "moksh");
		System.out.println(hm);
		System.out.println(hm.size());
        Set<Integer> keySet = hm.keySet();
        System.err.println(keySet);
        Collection<String> values = hm.values();
        System.err.println(values);
        
        Set<Entry<Integer, String>> entrySet = hm.entrySet();
        System.out.println(entrySet);
        boolean containsKey = hm.containsKey(100);
        System.err.println(containsKey);
}
}
