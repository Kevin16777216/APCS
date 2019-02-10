public class TokenScanner{
    
    // private instance variables
    private String input;      // String to scan
    private int cp;            // current position
    private boolean ignoreWhitespaceFlag;
    public static void main(String[] args){
	TokenScanner test = new TokenScanner("hey. thi i* s a te ssst");
    }

    // default constructor
    public TokenScanner(){
	this("");
    }
    
    // constructor
    public TokenScanner(String input){
        setInput(input);
	System.out.println(input.length());
	while(hasMoreTokens()){
	    System.out.println(nextToken());
	    cp++;
	}
	      
    }


    // resets the input and cp
    public void setInput(String input){
	this.input = input;
	cp = 0;
    }

    // returns true when input contains unprocessed tokens
    public boolean hasMoreTokens(){
	return cp < input.length();
    }

     
     public void ignoreWhitespace(){
     	   ignoreWhitespaceFlag = true;
     }

    // Skips over any whitespace characters before the next token.
    private void skipWhitespace(){
	if(ignoreWhitespaceFlag){
	    while(Character.isWhitespace(input.charAt(cp)))cp++;
	}
    }

    // Assumes string does not contain a floating point number.
    // Returns the nextToken() if there is no next token then return
    // an empty string.
    public String nextToken(){
        if(!hasMoreTokens())return "";
	String out = "";
	int type = 0;
	while(hasMoreTokens()){
	    skipWhitespace();
	    char read = input.charAt(cp);
	    if(Character.isDigit(read) && type > 1){
		if(Character.isLetter(read) && type%2 != 0){
		    return out;
		}else{
		    out += read;
		    type = 2;
		}
		return out;
	    }else{
		out += read;
		type = 1;
	    }
	    if(type == 0)return read + "";
	    cp++;
	}
	return "";
    }
}
