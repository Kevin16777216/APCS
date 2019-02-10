public class MaxArg{
    public static void main(String[] args){
	int max = Integer.MIN_VALUE;
	for(String i : args){
	    if(Integer.parseInt(i) > max) max = Integer.parseInt(i);
        }
	if(args.length > 0){
	    System.out.println("Max arg: "+ max);
	}else{
	    System.out.println("No input");
	}
    }
}
