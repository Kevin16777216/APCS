import java.util.Scanner;
public class ReverseDigits{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Give me a number:");
	int input = sc.nextInt();
	int result = 0;
	while (true){
	    result += input % 10;
	    input /= 10;
	    if(input == 0) break;
	    result *= 10;
	}
	System.out.println("Result:" + result);
    }
}
