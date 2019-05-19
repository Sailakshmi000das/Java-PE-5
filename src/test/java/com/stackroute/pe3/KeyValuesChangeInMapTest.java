import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

    public class KeyValuesChangeInMapTest {
        KeyValuesChangeInMap kv=new KeyValuesChangeInMap();

        @Test
        public void interchangeValues(){
            Map<String,String> map=new HashMap<String,String>();
            map.put("val1","java");
            map.put("val2","c++");
            Map<String,String> resultmap=kv.changeKeyValues(map);
            Map<String,String> mapresult=new HashMap<String,String>();
            mapresult.put("val1"," ");
            mapresult.put("val2","java");
            assertEquals(mapresult,resultmap);



        }
    }
