
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StringArrayMapBooleanTest {
    StringArrayMapBoolean sa = new StringArrayMapBoolean();

    @Test
    public void array() {
        String[] array = {"a", "b", "c", "d", "a", "c", "c"};
        Map<String, Boolean> res = sa.StringArrayMap(array);
        Map<String, Boolean> result = new HashMap<String, Boolean>();
        result.put("a", true);
        result.put("b", false);
        result.put("c", true);
        result.put("d", false);
        assertEquals(result, res);
    }
}