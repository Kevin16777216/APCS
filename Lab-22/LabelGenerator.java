public class LabelGenerator{
    private String prefix;
    private int index;
    public LabelGenerator(String prefix, int index){
	this.prefix = prefix;
	this.index = index;
    }
    public String nextLabel(){
	return prefix + index++;
    }
}
