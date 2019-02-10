import java.util.ArrayList;
public class SchoolBus extends ArrayList<Student>{
    private int total;
    public SchoolBus(int size){
	total = size;
    }
    public boolean isFull(){
	return size()>=total;
    }
    @Override
    public boolean add(Student s){
	if(isFull())return false;
	return super.add(s);
    }
    @Override
    public void add(int ind, Student s){
	if(isFull())super.add(ind,s);
    }
}
