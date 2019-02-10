import java.util.Scanner;
public class Lab1{
    /*
      1.  g(n) = 2nlogn + 3n^2 + n + 1 is O(n^2).
          n^2 > nlogn > n > 1 in terms of complexity, so it is n^2.
      2. |                                                                                             
	 |                                 
	 |                                 
	 4                ..                  
         3        ........                       
	 2    ....                            
	 1  .                                
	 0 .                                 
	 X0123456789ABCDEF_
     
*/
    public static void Main(String[] args){
	int n = Integer.parseInt(args[0]);
	int N = (int) Math.pow(2,n);
	System.out.print("Think of a number: ");
	System.out.println("between 0 and " + (N - 1));
	int v = search(0,N);
	System.out.println("Your number is " + v);
    }
    public static int search(int l,int h){
	Scanner Scan = new Scanner(System.in);
	if(h == 2)return l;
	int m = l + (h-l)/2;
	System.out.println("Is it lower than "+m+"?");
	if(Scan.nextBoolean()){
	    search(l,m);
	}
	search(m,h);
    }
}
