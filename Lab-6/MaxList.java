import java.util.Scanner;
public class MaxList{
    static final int SENTINEL = 0;
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int largest = Integer.MIN_VALUE;
	while(true){
	    System.out.print("Give me a Int:");
	    int in = sc.nextInt();
	    if(in == SENTINEL) break;
	    if(in > largest) largest = in;
	}
	System.out.println("Largest:"+ largest);
    }

}
