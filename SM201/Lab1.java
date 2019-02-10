import java.util.Scanner;
public class Lab1{
    /*
      1.  g(n) = 2nlogn + 3n^2 + n + 1 is O(n^2).
      n^2 > nlogn > n > 1 in terms of complexity, so it is O(n^2).
      2. |                                                                                             
      |                                 
      |                                 
      4                ..                  
      3        ........                       
      2    ....                            
      1  .                                
      0 .                                 
      X0123456789ABCDEF_
      4.
      T(N) = T(N/2) + 1
      T(1) = 1;
	
      Example:
      T(2) = T(1) + 1
      T(4) = T(2) + 1 = T(1) + 1 + 1 = T(1) + log4 = 1 + log4
      - For every multiple of 2, result increases by 1, so the
      log base 2 of the input yields the amount of increase.
      
      T(N) = 1 + log(N)
      
      T(N) = log(N) + 1 is closer log(N) as N goes to infinty, so
      T(N) is O(log(N)). log(N) is a more complex operation than 1.
      
     
    */
    public static void main(String[] args){
	int n = Integer.parseInt(args[0]);
	int N = (int) Math.pow(2,n);
	System.out.print("Think of a number: ");
	System.out.println("between 0 and " + (N - 1));
	int v = search(0,N);
	System.out.println("Your number is " + v);
    }
    public static int search(int l,int h){
	Scanner Scan = new Scanner(System.in);
	if(h - l == 1){
	    return l;
	}
	int m = l + (h-l)/2;
	System.out.println("Is it lower than "+m+"?");
	if(Scan.nextBoolean()){
	    return search(l,m);
	}
	return search(m,h);
    }
}
