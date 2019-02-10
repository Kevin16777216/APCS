import java.io.*;
import java.util.Scanner;
public class Lab16{
	public static void main(String[] args){
		new Lab16().processFile();	
	}
	public void processFile(){
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("Enter a file:");
			try{
				readData(new BufferedReader(new FileReader(sc.nextLine())));
				break;
			}catch(IOException e){
				System.out.println(e.toString());
			}
		}
	}
	public void readData(BufferedReader br){
		boolean pre,cur;
		int lines,chars,words;
		lines = chars = words = 0;
		while(true){
		    try{
			    String b = br.readLine();
			    if (b!= null) lines++;else break;
			    pre = true;
			    for(int i = 0; i< b.length();i++){
				    cur = Character.isWhitespace(b.charAt(i));
				    if(pre&&!cur)words++;
				    pre = cur;
				    chars++;
			    }
			    chars++;//newline
		    }catch(IOException e){
		        System.out.println(e.toString());
		    }
			
		}
		System.out.printf("%-4s%4d%n","Chars:",chars);
		System.out.printf("%-4s%4d%n","Words:",words);
		System.out.printf("%-4s%4d%n","Lines:",lines);
	}
}
