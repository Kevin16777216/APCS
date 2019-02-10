public class Hailstone{
    public static void main(String[] args){
	int n = Integer.parseInt(args[0]);
	while(n != 1){
	    System.out.println(n);
	    n = (n%2 == 0)? n/2 : 3*n + 1 ;
	}
	System.out.println(1);
    }
}
