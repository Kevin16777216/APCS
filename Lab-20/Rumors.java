
//By Kevin Cai && Eric Chen
import java.util.Scanner;
public class Rumors{
    static boolean[] set = new boolean[10];
    static int population = 10;
    static double total = 0;
    static double talks = 0;
    static double attempts = 100;
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Give a population size");
	population = sc.nextInt();
	System.out.println(population);
	for(int j = 0; j < attempts;j++){
	    set = new boolean[population -1];//Exclude Alice
	    add(-1,0);
	    total += talks;
	    System.out.println(talks);
	    talks = 0;
	   
	}
	total /= attempts;
	System.out.println("Avg#:"+(total/population)+"people");
    }
    public static void add(int P,int C){
	if(set[C])return;
	talks++;
	set[C] = true;
	int i = (int) (Math.random()*set.length);
	while(i == P|| i == C){
	    i = (int) (Math.random()*set.length);
	}
	add(C,i);
    }
}
