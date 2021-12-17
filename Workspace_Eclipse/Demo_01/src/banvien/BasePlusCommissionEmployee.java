package banvien;

public class BasePlusCommissionEmployee extends CommissionEmployee {

	private double baseSalary; // base salary per week

	public BasePlusCommissionEmployee(String first, String last, String ssn, int sales, double rate, double salary) {
		super( first, last, ssn, sales, rate );
		setBaseSalary( salary ); // validate and store base salary
	}
	public void setBaseSalary( double salary )
	{
		if ( salary >= 0.0 )
			baseSalary = salary;
		else
			throw new IllegalArgumentException(
					"Base salary must be >= 0.0" );
	}

	public double getBaseSalary()
	{
		return baseSalary;
	} // end method getBaseSalary
	@Override // indicates that this method overrides a superclass method
	public double earnings()
	{
		return getBaseSalary() + super.earnings();
	} // end method earnings
	@Override // indicates that this method overrides a superclass method
	public String toString()
	{
		return String.format( "%s %s\n%s: %.2f", "base-salaried",
				super.toString(), "base salary", getBaseSalary() );
	} // end method toString
} // end class BasePlusCommissionEmployee

