import java.io.*;
import java.util.Scanner;
public class Tabify{
    public static void main(String[] args){
	new Tabify().run();
    }
    public void run(){
	BufferedReader br = askFile();
	try{
	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Tabified.txt")));
	    while(true){
		String read = br.readLine();
		if(read == null)break;
		String[] res = read.split("\t");
		
		for(int l = 0, i = 0;i< read.length()-1;l = i++){
		    char output = read.charAt(i);
		    char next = read.charAt(i+1);
		    if(output = '\t'&&){
			
			continue;
		    }
		    res += output;
		}
		System.out.print(res.length());
		out.println(res);
	    }
	    out.close();
	    br.close();
	}catch(IOException e){
	    System.out.println(e.toString());
	}
	
    }
    public BufferedReader askFile(){
	Scanner sc = new Scanner(System.in);
	while(true){
	    System.out.print("Give me a file:");
	    try{
	        return new BufferedReader(new FileReader(sc.next()));
	    }catch(Exception e){
		System.out.println(e.toString());
	    }
	}
    }
}
