import static org.junit.Assert.*;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

    public class CountOccurencesTest {
        CountOccurences co=new CountOccurences();

        @Test
        public void occurrance(){
            String str="one one -one___two,,three,one @three*one?two";
            Map<String,Integer> result=co.countingOccurances(str);
            Map<String,Integer> map=new HashMap<>();
            map.put("one",5);
            map.put("two",2);
            map.put("three",2);
            assertEquals(map,result);
        }
        @Test
        public void occurranceCount(){
            String str="1 ? 1 .,2";
            Map<String,Integer> result=co.countingOccurances(str);
            Map<String,Integer> map=new HashMap<>();
            map.put("1",2);
            map.put("2",1);
            assertEquals(map,result);


        }
    }
