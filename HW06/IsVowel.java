public class IsVowel{
    public static void main(String[] args){
	boolean isVowel = false;
	String input = args[0].toUpperCase();
	switch(input){ case "A": case "E": case "I" : case "O": case "U":isVowel = true;
	}
	System.out.println(isVowel);
    }
}
