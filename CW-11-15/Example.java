import java.io.*;
import java.util.Scanner;
public class Example{
    public static void main(String[] args){
	new Example().run();
    }
public void run(){
    BufferedReader rd = openFileReader(new Scanner(System.in), "Enter a file:");
    showLine(rd,"hello");
}
private BufferedReader openFileReader(Scanner sysin,String prompt){
    BufferedReader rd = null;
    while (rd == null){
	try{
	    System.out.print(prompt);
	    String name = sysin.nextLine();
	    rd = new BufferedReader(new FileReader(name));
	}catch(IOException e){
	    System.out.println("can't open file");
	}
    }
    return rd;
}
    private void showCharByChar(BufferedReader rd){
	try{
	    while(true){
		int ch = rd.read();
		if(ch == -1) break;
		System.out.println((char) ch); 
	    }
	}catch(IOException e){
	    throw new RuntimeException(e.toString());
	}
    }
    private void showLine(BufferedReader rd,String m){
	try{
	    int i = 0;
	    int p = 0;
	    while(true){
		String str = rd.readLine();
		if(str == null) break;
		p = str.indexOf(m);
		if(p != -1) break;
		i++;
	    }
	    if(i+p == -1) {
		System.out.println("not found");
		return;
	    }
	    System.out.println(i+":"+p);
	    
	}catch(IOException e){
	    throw new RuntimeException(e.toString());
	}
    }
}
