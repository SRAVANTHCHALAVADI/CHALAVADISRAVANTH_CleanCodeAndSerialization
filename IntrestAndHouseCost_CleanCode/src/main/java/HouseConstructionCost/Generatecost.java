package HouseConstructionCost;

public class Generatecost {
		public double Cost(String name,double Sqrfoot)
		{
			ConstructuonPlan planFactory = new ConstructuonPlan();
			HousePlan p = planFactory.getPlan(name);  
			p.getRate();
			double d=p.calculateBill(Sqrfoot);
			return d;
		}

	
}
