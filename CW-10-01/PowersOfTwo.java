public class PowersOfTwo{
    public static void main(String[] args){
	int input = Integer.parseInt(args[0]);
	int output = 1;
	for(int i = 0; i <= input; i++){
	    System.out.println(i +" "+ output);
	    output *= 2;
	}
    }
}
