import java.util.ArrayList;
public class ListDemo{
    static ArrayList<String> stuff = new ArrayList<String>();
    public static void main(String[] args){
	stuff.add("hello");
	stuff.add("elloh");
	stuff.add("llohe");
	System.out.println(stuff);
	System.out.println(stuff.get(0));
	System.out.println(stuff);
	System.out.println(stuff.set(0,"pie"));
	System.out.println(stuff);
	System.out.println(stuff.remove(2));
	System.out.println(stuff);
        System.out.println(stuff.isEmpty());
	System.out.println(stuff.size());
	System.out.println(stuff.indexOf("elloh"));
    }
}
