import java.util.Map;

public class KeyValuesChangeInMap {
    public Map<String,String> changeKeyValues(Map<String,String> map)
    {
        String value = map.get("val1");
        map.replace("val2", value);
        map.replace("val1", " ");
        return map;
    }
}