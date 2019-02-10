public class Factors{
    public static void main(String[] args){
	long n = Long.parseLong(args[0]);
	double runtime = System.currentTimeMillis();
	while(n%2 == 0){
	    System.out.print("2 ");
	    n /= 2;
	}
	while(n%3 == 0){
	    System.out.print("3 ");
	    n /= 3;
	}
	int inc = 2;
	for(long i = 5; i <= Math.sqrt(n); i += inc){
	    while(n % i == 0){
		System.out.print(i + " ");
		n /= i;
	    }
	    inc = 6 - inc;
	}
	if(n > 2){
	    System.out.print(n);
	}
	runtime = System.currentTimeMillis();
	System.out.println("\n" + runtime);
    }
}
