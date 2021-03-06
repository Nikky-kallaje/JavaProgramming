/**
 * The Employee check class
 */
public class EmpCheckUC2{

	private static final int IS_FULL_TIME=1;
	private static final int IS_PART_TIME=2;

	public static void main(String [] args){
		// Calling function
		final double isPresent = empCheck();
		if(isPresent == 1.0){
			final double wage = calulateWage(20, 8);
			System.out.println("Employee is Present");
			System.out.println("Total Employee wage is : "+ wage);
		}else{
			System.out.println("Employee is absent");
			System.out.println("Total Employee wage is : 0.0");
		}
	}

	/**
	 * Check employee
	 * @return true if employee present otherwise false.
	 */
	public static double empCheck(){

		double pr = Math.floor(Math.random() * 10) % 2;
		return pr;
	}

	/**
	 * Calculate employee wage based on params.
	 * @param ratePerHrs the employee rate per hours.
	 * @param totalHrs total employee hours.
	 * @return total employee wage.
	 */
	public static double calulateWage(final int ratePerHrs, final int totalHrs){
		return ratePerHrs*totalHrs;
	}
}
