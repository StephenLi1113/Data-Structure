import java.util.LinkedList;

public class create
{

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");

        list.add(list.size(), "this");
        list.add(0, "change");

        for(int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i) + " ->");
        }


    }
}
