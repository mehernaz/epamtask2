package housecost_calculator;

public class cost {
	public float estimate(String standard,float area)
	{
		float cost=0;
		if (standard.equals("standard"))
			cost=1200*area;
		else if (standard.equals("abovestandard"))
			cost=1500*area;
		else if (standard.equals("highstandard"))
			cost=1800*area;
		else 
			cost=area*2500;
		return cost;
	}

}
