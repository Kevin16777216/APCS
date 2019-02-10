import java.util.Scanner;
public class DigitToEng{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int input = 12;
	String ans = "";
	while(!(input >= 0 && input < 10)){
	    System.out.print("Give me a single digit:");
	    input = sc.nextInt();
	    if(!(input >= 0 && input < 10)){
		System.out.println("that is not a single digit");
	    }
	}
	switch(input){
	case 0:
	    ans = "zero";
	    break;
	case 1:
	    ans = "one";
	    break;
	case 2:
	    ans = "two";
	    break;
	case 3:
	    ans = "three";
	    break;
	case 4:
	    ans = "four";
	    break;
	case 5:
	    ans = "five";
	    break;
	case 6:
	    ans = "six";
	    break;
	case 7:
	    ans = "seven";
	    break;
	case 8:
	    ans = "eight";
	    break;
	case 9:
	    ans = "nine";
	    break;
	default:
	    ans =  "error";
	}
	System.out.println(ans);
    }
}
