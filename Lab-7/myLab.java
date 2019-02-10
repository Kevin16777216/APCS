public class myLab{
    public static void main(String[] args){
	for(int i = 1; i < 9999; i++){
	    if (isPerfect(i)) System.out.println(i);
	}
	System.out.println("PRIMES (1-100):");
	for(int i = 2; i < 100; i++){
	    if (isPrime(i)) System.out.println(i);
	}
	System.out.println("Roots: 1-100:");
	for(int i = 1; i < 100; i++){
	    System.out.println("sqrt("+i+") ="+getRoot(i));
	}
    }
    public static double getRoot(double j){
	double g = j/2;
	while((g+j/g)/2 != g){
	    g += j/g;
	    g /= 2;
	}
	return g;
    }
    public static double getRootR(double k){
	return getRootHelp(k/2,k);
    }
    public static double getRootHelp(double g,double j){
	if ((g+j/g)/2 != g){
	    g += j/g;
	    g /= 2;
	    return getRootHelp(g,j);
        }else{
	    return g;
        }
    }
	public static boolean isPrime(int i){
	    if(i == 2 || i == 3)return true;
	    if(i%2 == 0) return false;
	    if(i%3 == 0) return false;
	    int inc = 4;
	    for(int j = 5; j < Math.sqrt(i);j+= inc){//Special formula
		if(i%j == 0)return false;
		inc = 6 - inc;
	    }
	    return true;
	}
	public static boolean isPerfect(int k){
	    int p = getSum(k);
	    return p == k;
	}
	public static int getSum(int input){
	    int n = input;
	    int sum = 0;
	    int inc = 2;
	    for(int i = input - 1 ; i > 0; i--){
		if(n % i == 0){
		    sum += i;
		}
	    }
	    return sum;

	}
    }
