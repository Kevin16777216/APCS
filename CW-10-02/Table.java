public class Table{
    public static void main(String[] args){
	for(int i = 1001; i <= 2000; i++)
	    System.out.print( i +( (i % 5 == 0) ? "\n" : "  "));  
    }
}
