
public class CalculateSimpleAndCompoundIntrest {
	public double SimpleIntrest(double PrincipleAmount,double Time,double RateOfIntrest) {
		return (((PrincipleAmount*Time*RateOfIntrest)/100)+PrincipleAmount);
		
	}
	public double CompoundIntrest(double PrincipleAmount,double Time,double RateOfIntrest) {
		double d=(1+RateOfIntrest/100);
		
		double Temporary=Math.pow(d, Time);
		return (PrincipleAmount*(Temporary-1)+PrincipleAmount);
	}
}
