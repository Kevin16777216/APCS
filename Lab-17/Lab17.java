import java.io.*;
import java.util.Scanner;
public class Lab17{
    public static void main(String[] args){
	new Lab17().run();
    }
    public void run(){
	try{
	    BufferedReader rd = new BufferedReader(new FileReader("codes.csv"));
	    PrintWriter ps = new PrintWriter(new BufferedWriter(new FileWriter("states.txt")));
	    PrintWriter pa = new PrintWriter(new BufferedWriter(new FileWriter("abbreviations.txt")));
	    PrintWriter pc = new PrintWriter(new BufferedWriter(new FileWriter("code.txt")));
	    String s,a,c;
	    s = a = c = "";
	    while(true){
		String line = rd.readLine();
		if (line == null) break;
		Scanner scanner = new Scanner(line);
		scanner.useDelimiter(",");
		s = scanner.next();
		a = scanner.next();
		c = scanner.next();
		System.out.println(s+"|"+a+"|"+c);
		ps.println(s);
		pa.println(a);
		pc.println(c);
	    }
	    ps.close();
	    pa.close();
	    pc.close();
	    rd.close();
	}catch(IOException ex){
       	    throw new RuntimeException(ex.toString());
	}
    }
}
