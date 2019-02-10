public class Children{
    public static void main(String[] args){
	int i = 1;//Doesn't matter what gender
	Coin n = new Coin();
	while(n.flip().equals("H")) i++;
	System.out.println(i+1);
    }
    
}
