//import ASCIILib.Vector*;
public class Display{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String[] colors = {"\u001B[40m","\u001B[41m","\u001B[42m","\u001B[43m","\u001B[44m","\u001B[45m","\u001B[46m","\u001B[47m"};
    int[][] disp;
    // Vector dimensions;
    public static void main(String[] args){
	for(int i = 0; i < 500; i++){
	    for(int j = 0; j < 200;j++){
		int p = (int)(Math.random()*8.0);
		System.out.print(colors[p]+ "  "+ANSI_RESET);
	    }
	    System.out.println();
	}
    }
    /*public Display(Vector d){
	dimensions = d;
	}*/
}
