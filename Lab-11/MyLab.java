public class MyLab{
    public static void main(String [] args){
	System.out.println(endsWith("StuyPulse","Pulse"));
	System.out.println(indexOf("StuyPulse","uyP",0));
	System.out.println(contains("StuyPulse","uyP"));
	System.out.println(indexOf("mississippi", "i")); //1
	    System.out.println(indexOf("mississippi", "i", 2)); // 4
	    System.out.println(indexOf("mississippi", "ip")); // 7
	    System.out.println(indexOf("cat", "A"));//-1
	    for(int i = 0; i < 100;i++){
		System.out.println(i+ ordinal(i));
	    }
    }
    public static boolean endsWith(String in, String substr){
	return in.substring(in.length()-substr.length()).equals(substr);
    }
    public static int indexOf(String in, String str, int ind){
	int j = str.length();
	int i = ind;
	while(i <= in.length()-j-1){
	    if(in.substring(i,i + j).equals(str)){
		return i;
	    }
	    i++;
	}
	return -1; 
    }
    public static int indexOf(String in,String str){
	return indexOf(in,str,1);
    }
    public static boolean contains(String reciever, String sub){
	return indexOf(reciever,sub) != -1;
    }
public static String ordinal(int i) {
    String[] sufixes = new String[] { "th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th" };
    return (i < 20 && i > 10) ? "th" : sufixes[i % 10];
}


}
