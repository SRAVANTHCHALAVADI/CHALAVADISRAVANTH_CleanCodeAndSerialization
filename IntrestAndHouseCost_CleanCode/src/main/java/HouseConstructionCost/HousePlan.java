package HouseConstructionCost;

	abstract class HousePlan {
	    protected double rate;  
	    abstract void getRate();  

	    public double calculateBill(double Sqrfoot){  
	         return(Sqrfoot*rate);  
	     }  
	}

