package fall.lesson04;
import java.util.*;
public class AddThreeReals{
    public static void main(String[] args){
	new AddThreeReals().run();
    }
    public void run(){
	Scanner sc = new Scanner(System.in);
	double sum = 0;
	for(int i = 0;i<3;i++){
	    System.out.print("Give me a number:");
	    sum+= sc.nextDouble();
	}
	System.out.println("sum:"+sum);
    }

}
