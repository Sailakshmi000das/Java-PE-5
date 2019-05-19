import java.util.HashMap;
import java.util.Map;

    public class StringArrayMapBoolean  {
        public Map<String,Boolean> StringArrayMap(String[] str) {
            Map<String, Boolean> map = new HashMap<>();
            for (String word : str) {
                if (map.containsKey(word)) {
                    map.replace(word, true);
                } else {
                    map.put(word, false);
                }
            }
            return map;
        }
    }
