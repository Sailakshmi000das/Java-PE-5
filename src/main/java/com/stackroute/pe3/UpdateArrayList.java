import java.util.ArrayList;
import java.util.List;


public class UpdateArrayList{
    public List<String> updateList(List<String> list){
        list.set(0,"kiwi");
        return list;
    }
    public String removeList(List<String> list){
        list.clear();
        String result="";
        if(list.isEmpty())
        {
            result="true";
        }
        else
            result="false";
        return result;

    }
}