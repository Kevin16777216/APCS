import java.util.Scanner;
public class Fence{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("# of posts:");
	int input = sc.nextInt();
	String result = "|";
	for(int i = 1; i < input; i++){
	    result += "---|";
	}
	if(input > 0){
	    System.out.println("Result:" + result);
	}else{
	    System.out.println("Input is invalid");
	}
    }
}
