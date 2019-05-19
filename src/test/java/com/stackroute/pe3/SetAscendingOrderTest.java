import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

import static org.junit.Assert.*;

    public class SetAscendingOrderTest {

        SetAscendingOrder sao=new SetAscendingOrder();;
        @Test
        public void sortElements(){
            SortedSet<String> sorting=new TreeSet<String>();
            sorting.add("sai");
            sorting.add("vinay");
            sorting.add("lucky");
            sorting.add("duffer");
            sorting.add("dusky");
            ArrayList<String> result=sao.sortList(sorting);
            System.out.println(result);
            ArrayList<String> result1=new ArrayList<>();
            result1.add("duffer");
            result1.add("dusky");
            result1.add("lucky");
            result1.add("sai");
            result1.add("vinay");
            assertEquals(result1,result);
        }
    }

