import java.util.ArrayList;
public class Sorted{
    public static void main(String[] args){
	System.out.println(isSorted(new ArrayList<String>()));
	ArrayList<String> j = new ArrayList<String>();
	j.add("a");
	j.add("b");
	j.add("b");
	j.add("ba");
	System.out.println(isSorted(j));
	System.out.println(isSorted(new ArrayList<String>()));
    }
    public static boolean isSorted(ArrayList<String> list){
        String m = "";
	for(String i: list){
		   if(i.compareTo(m) < 0)return false;
		   m = i;
	}
	return true;
    }
}
