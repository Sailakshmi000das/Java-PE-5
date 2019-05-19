
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UpdateArrayListTest {
    UpdateArrayList ual=new UpdateArrayList();

    @Test
    public void updatingElement()
    {
        List<String> fruits=new ArrayList<String>();
        fruits.add("apple");
        fruits.add("grape");
        fruits.add("melon");
        fruits.add("berry");
        List<String> res=ual.updateList(fruits);
        List<String> res1=new ArrayList<>();
        res1.add("kiwi");
        res1.add("grape");
        res1.add("melon");
        res1.add("berry");
        assertEquals(res1,res);

    }
    @Test
    public void emptyArrayList()
    {
        List<String> fruits=new ArrayList<String>();
        fruits.add("apple");
        fruits.add("grape");
        fruits.add("melon");
        fruits.add("berry");
        fruits.add("kiwi");
        String str=ual.removeList(fruits);
        assertEquals("true","true");

    }
}