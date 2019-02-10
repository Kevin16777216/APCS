public class Client{
    public static void
	main(String[] args){
	SkiJumper bob = new SkiJumper("first","last");
	SkiJumper joe = new SkiJumper("fidsfgsdt","dfsglast");
	SkiJumper ian = new SkiJumper("ffdirst","lasst");
	System.out.println(bob);
	bob.fly();
	System.out.println(bob);
	bob.train(6.7);
	System.out.println(bob);
	System.out.println(bob.compareTo(joe));
	joe.fly();
	System.out.println(bob.compareTo(joe));
	joe.fly();
	System.out.println(bob.compareTo(joe));
    }
}
