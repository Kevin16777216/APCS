import java.util.ArrayList;
public class IntegerList extends ArrayList<Integer>{
    public IntegerList(int ... values){
	for(int i: values){
	    this.add(i);
	}
    }
}
