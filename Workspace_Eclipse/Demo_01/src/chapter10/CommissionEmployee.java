package chapter10;

public class CommissionEmployee extends Employee{

	private double grossSales;
	private double commissionRate;

	public CommissionEmployee(String first, String last, String ssn, double sales,double rate) {
		super(first, last, ssn);
		getGrossSales(sales);
		getCommissionRate();

	}
	public void getGrossSales(double sales)
	{
		if ( sales >= 0.0 )
			grossSales = sales;
		else
			throw new IllegalArgumentException(
					"Gross sales must be >= 0.0" );
	}
	public double getGrossSales()
	{
		return grossSales;
	} // end method getGrossSales

	public void setCommissionRate( double rate )
	{
		if ( rate > 0.0 && rate < 1.0 )
			commissionRate = rate;
		else
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0" );
	} // end method setCommissionRate

	// return commission rate
	public double getCommissionRate()
	{
		return commissionRate;
	} // end method getCommissionRate

	// set gross sales amount

	// calculate earnings; override abstract method earnings in Employee
	@Override
	public double earnings()
	{
		return getCommissionRate() * getGrossSales();
	} // end method earnings

	@Override
	public String toString()
	{
	return String.format( "%s: %s\n%s: $%,.2f; %s: %.2f",
	"commission employee", super.toString(),
	"gross sales", getGrossSales(),
	"commission rate", getCommissionRate() );
	} // end method toString
}
