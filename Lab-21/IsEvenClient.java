public class IsEvenClient{
    //Test
    public static void main(String[] args){
	IsEvenClient client = new IsEvenClient();
	IntegerList list = new IntegerList(1,2,3,4,5,6,7,8,9,-1,-2);
	System.out.println(list);
	System.out.println("new:");
	System.out.println(client.filter(new IsEven(),list));
	
    }
    // Post: Returns an IntegerList containing all the elements that satisfy
   //       the PredicateFunction. NO SIDE EFFECTS ARE PRODUCED.
   public IntegerList  filter(PredicateFunction f, IntegerList list){
       IntegerList out = new IntegerList();
       for(int i: list){
	   if(f.evaluate(i))out.add(i);
       }
       return out;
   }
}
