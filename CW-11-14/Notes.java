/*
  HOW TO OPEN A FILE:
  1.Open the file
      New FileReader("data.txt");
  2. Read the data.
      -Buffered reader can read line-by-line
      BufferedReader rd = new BufferedReader(new FileReader("data.txt"));
  3. Close the file.
      -after done reading, close the file.
      read() : int //reads 1 character
      readLine() : String //returns lines as string.(Doesn't include end of Line.)
      close()    : void   // closes the String.

      -YOU NEED TO IMPORT java.io.FileReader;
                          java.io.BufferedReader;
Exception Handling:
    -When a file you try to open doesn't exsist, and you don't catch it, your program will terminate.


    try{
    }catch (IOException e){//IOException is an input/output Exception.
        throws e; 
    }
*/
