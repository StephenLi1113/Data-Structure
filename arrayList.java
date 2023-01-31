import java.util.*;

public class arrayList{
    public static void main(String[] args) 
    {
        
        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.remove("hello");

        listPrinter(list);
    }

    public static void listPrinter(ArrayList<String> list)
    {
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i) + " ");
        }
    }
}