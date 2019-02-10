public class BiasedCoin extends Coin{
    private double prob;
    public BiasedCoin(){
	this(0.5);
    }
    public BiasedCoin(double p){
	prob = p;
    }
    @Override
    public String flip(){
	return (Math.random() < prob)?"H":"T";
    }
}
