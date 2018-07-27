import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmplyeeVo {

	int empid;
	String empname;
	double annualincome;
	double incometax;

	// .................................................................getters&setters
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getAnnualincome() {
		return annualincome;
	}

	public void setAnnualincome(double annualincome) {
		this.annualincome = annualincome;
	}

	public double getIncometax() {
		return incometax;
	}

	public void setIncometax(double incometax) {
		this.incometax = incometax;
	}

	// ......................................................................constructor
	public EmplyeeVo(int empid, String empname, double annualincome) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.annualincome = annualincome;

	}

	@Override
	public String toString() {

		return this.empid + " " + this.empname + " " + this.annualincome + " " + this.incometax + " ";
	}
}
// ................................................................................

class EmplyeeBo {

	public void calincomeTax(EmplyeeVo evo) {
		double incometax = evo.getAnnualincome() *0.3;
		evo.setIncometax(incometax);
	}
}

// ................................................................................
class employeeSort implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub

		// ..........convert object type to
		// evo...............................................
		// type cast
		EmplyeeVo evo1 = (EmplyeeVo) o1;
		EmplyeeVo evo2 = (EmplyeeVo) o2;
		return Double.compare(evo2.getAnnualincome(),evo1.getAnnualincome());
	}

}

// ...................................................................................

class EmployeeMain {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("No of employee:");
		int n = Integer.parseInt(br.readLine()); // ....number of employees=n

		EmplyeeVo evo[] = new EmplyeeVo[n]; // ...array created with the size n(no of employees)

		for (int i = 0; i < n; i++) {
			System.out.println("Employee ID:");
			int empid = Integer.parseInt(br.readLine());
			System.out.println("Name of the employee:");
			String empname = (br.readLine());
			System.out.println("Annual income");
			double annualincome = Double.parseDouble(br.readLine());
			EmplyeeVo ee = new EmplyeeVo(empid, empname, annualincome);
			
			evo[i] = ee;
		}

		// calculate income tax for all the employees

		EmplyeeBo ebo = new EmplyeeBo();
		for (int i = 0; i < evo.length; i++) {
			ebo.calincomeTax(evo[i]);
			System.out.println(evo[i].getIncometax());
		}

		// Convert this array into arraylist
		System.out.println("before sorting");
		System.out.println(Arrays.toString(evo));
		Arrays.sort(evo, new employeeSort());

		System.out.println("After sorting");
		System.out.println(Arrays.toString(evo));

	}
}
