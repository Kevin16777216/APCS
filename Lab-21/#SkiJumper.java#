public class SkiJumper extends Athlete implements Flier,Comparable{
    private int jumps = 0;
    public SkiJumper(String first, String last){
	super(first,last);
    }
    public void fly(){
	jumps++;
    }
    public int getJumps(){
	return jumps;
    }
    public int compareTo(Object in){
	if(!(in instanceof SkiJumper)) return -1;
	SkiJumper comp = (SkiJumper) in;
	if(comp.getJumps() > getJumps()) return 1;
	if(comp.getJumps() < getJumps()) return -1;
	return 0;
	
    }
    @Override
    public String toString(){
	return super.toString() + " jumps : " + jumps;
    }
}
