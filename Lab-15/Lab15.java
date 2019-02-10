import java.util.Scanner;
public class Lab15{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number if character positions to shift:");
	int k = sc.nextInt();
	sc.nextLine();
	System.out.print("Enter a message:");
	System.out.println(encodeCaesarChipher(sc.nextLine(),k));
	//Part 2
	String key = "";
	while(key.length() != 26){
	    System.out.print("Enter a 26-letter key :");
	    key = sc.nextLine();
	}
	System.out.print("Enter a message :");
	System.out.println(swapString(sc.nextLine(),key));
	System.out.println("Inverted key:"+invertKey(key));
	System.out.println(findDNAMatch("TGC","TAACGGTACGTC"));
	System.out.println(findDNAMatch("TGC","TAACGGTACGTC",3));
    }
    public static String swapString(String str, String key){
	String res = "";
	for(int j = 0; j < str.length(); j++){
	    char m = key.charAt((int) (str.charAt(j)-((Character.isUpperCase(str.charAt(j)))? 65: 97)));
	    res += (Character.isUpperCase(str.charAt(j)))? (char) (m-32): m; 
	}
	return res;
    }
    public static String invertKey(String key){
	return swapString(key,"ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    }
    public static String encodeCaesarChipher(String str, int shift){
	String ret = "";
	String alphabet = "abcdefghijklmnopqrstuvwxyz";
	for(char i:str.toCharArray()){
	    if(Character.isLetter(i)){
		int index = alphabet.indexOf(Character.toLowerCase(i))+shift;
		char add = alphabet.charAt(((index >= 0)?index:26-(Math.abs(index)%26))% 26);
		ret += (Character.isUpperCase(i))? Character.toUpperCase(add):add;
	    }else{
		ret+=i;
	    }
	}
	return ret;
    }
    public static int findDNAMatch(String s1,String s2){
	String comp = "";
	if(s1.length() > s2.length()) return -1;
	for(int i = 0; i < s1.length();i++){
	    switch(s1.charAt(i)){
	    case 'A':
		comp += "T";
		break;
	    case 'T':
		comp += "A";
		break;
	    case 'G':
		comp += "C";
		break;
	    default:
		comp += "G";
	    }
		    
	}
	return s2.indexOf(comp);
    }
    public static int findDNAMatch(String s1,String s2,int start){
	return findDNAMatch(s1,s2.substring(start)) + start;
    }
}
