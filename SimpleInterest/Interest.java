package SimpleInterest;

public class Interest {
	public double simpleinterest(int principal,int rate,int years)
	{
		return (principal*rate*years/100);
	}
	
	public double compoundinterest(double principal,double rate,int years)
	{
		double c=(1+(rate)/100);
		double y=Math.pow(c, years)*principal;
		return y;
	}
}
