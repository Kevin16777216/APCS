/*
New loops:

for(:){ //Enhanced for
}

for(;;){
}

Do Now:
public static void main(String[] args){
    int sum = 0;
    int n = Integer.parseInt(args[0]);
    while(n > 0){
        sum += n ;
        n--;
    }
    System.out.println("sum: " + sum);

}
a)what is the scope of sum and n? They belong to the main method
b)What are the values of sum and n after the program
   if n was initialized with 10?
   55
c)What is the explicit formula to calculate the integers from 1 t n?
   (n+1)*(n/2.0)  (Gauss' Summation formula)

   /*******************
   *                  *
   *     IMPORTANT    *
   *                  *
   *******************/

/*  For loops:


Simple for loop:
    int sum = 0;
    for (int i = 1; n = <some value> ; i <= n; i++){
        sum += i;
    }
    you can have two for loops in each other with two differing i's.
    for (int i = ..){
        for(int i = ..){
	   //totally valid
	}
    
    }
    A) while
        init
        ---------
        while(test){
            statements
            step
        }
    B) for
    for(init ; test; step){
    
    }

    for (int i = 1, n = 10, sum = 0; i <=n; i++)
        sum += i;

    System.out.println("sum : " + sum);//ERROR: sum out of scope


------------NICE FOR LOOP-----------------------
    for(variable : iterable object){
       statements
    }

Iterable Objects:
    String[] args 


EXAMPLE:
    javac Demo.java
    java Demo a b c d e f g h i
    public static void main(String[] args){
         for( String i : args) System.out.println(args);
    }
    // prints a
              b
              c
	      d
	      e
	      f
	      g
	      h
	      i
