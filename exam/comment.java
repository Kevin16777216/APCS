import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class comment{
    public static void main(String[] args){
	new comment().run(args[0], args[1]);
    }

    private void run(String reader, String writer){
	try{
	    BufferedReader rd = new BufferedReader(new FileReader(reader));
	    PrintWriter wr = new PrintWriter(new BufferedWriter(new FileWriter(writer)));
	    removeComments(rd, wr);
	} catch(IOException ex){
	    throw new RuntimeException(ex.toString());
	}
    }

    private void removeComments(BufferedReader rd, PrintWriter wr){
	try{
	    boolean inComment = false;
	    while (true){
		String line = rd.readLine();
		if (line == null) break;
		boolean canPass = false;
		String res = "";
		while (!canPass && line != ""){
		    int a = line.indexOf("//");
		    int b = line.indexOf("*/");
		    int c = line.indexOf("/*");
		    if(inComment){
			if(b > -1){
			    line = line.substring(b+2);
			    inComment = false;
			    continue;
			}
			break;
		    }else{
			if(c > -1){
			    if(c < a || a == -1){
				res+= line.substring(0,c);
				line = line.substring(c+2);
				inComment = true;
				continue;
			    }
			    if(a > -1){
				res+= line.substring(0,a);
				line = res;
				canPass = true;
				break;
			    }	    
			}
			if(a > -1){
			    res+= line.substring(0,a);
			    break;
			}
			res+= line;
			break;
		    }
		}
            
		wr.println(res);
	    }
	    rd.close();
	    wr.close();
	} catch(IOException ex){
	    throw new RuntimeException(ex.toString());
	}
    }
    }
