package Employee;

public class employee {
	private String Id;
	private String name;
	private int monthlyBasic;
	private double hra=monthlyBasic/2;
	private static final int MEDICALALLOWANCE=1250;
	private  static final int CONVEYANCEALLOWANCE=800;
	private double pf;
	private double ESIC;
	private double PTax;
	
	//CONSTRUCTOR
	public employee() {
		if(monthlyBasic<6500) {
			pf=.1*monthlyBasic;
		}
		else {
			pf=0;
		}
		if(monthlyBasic<=5000){
			ESIC=.0475*monthlyBasic;
		}
		else {
			ESIC=0;
		}
		if(getMonthlyGrossSalary()<6500) {
			PTax=50;
		}
		else {
			PTax=100;
		}
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		this.Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMonthlyBasic() {
		return monthlyBasic;
	}
	public void setMonthlyBasic(int monthlyBasic) {
		this.monthlyBasic = monthlyBasic;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	//Annual Basic
	int getAnnualBAsic() {
		return 12*monthlyBasic;
	}
	//MonthlyGrossSalary
	double getMonthlyGrossSalary() {
		return monthlyBasic+hra+MEDICALALLOWANCE+CONVEYANCEALLOWANCE;
	}
	//AnnualGrossSalary
	double getAnnualGrossSalary() {
		return 12*getMonthlyGrossSalary();
	}
	//MonthlyDeductions
	double getMonthlyDeductions() {
		return pf+ESIC+PTax ;
	}
	//MonthlyTakeHome
	double getMonthlyTakeHome() {
		return getMonthlyGrossSalary()-getMonthlyDeductions();
	}
	//AnualTakeHome
	double getAnualTakeHome() {
		return getMonthlyTakeHome()*12;
	}
}
