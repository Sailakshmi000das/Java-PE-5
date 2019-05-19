
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

public class CountOccurences{

    public Map<String, Integer> countingOccurances(String str) {
        String[] list= str.split("[\\W_]+");
        Map<String,Integer> count = new HashMap<String,Integer>();
        for (String s : list) {
            if (count.containsKey(s)) {
                count.replace(s, count.get(s) + 1);
            } else {
                count.put(s, 1);
            }
        }
        return count;
    }

}
