package classAndObjects;

public class EmpGroups {

	public static void main(String[] args) {
		

		Employees obj = new Employees();
		String [] empNames  = {obj.employeName1, obj.employeName2, obj.employeName3 };
		String [] empIds = {obj.id[0] ,obj.id[1], obj.id[2]};
		System.out.println("Employee Name:"+ obj.employeName1);
		System.out.println("EmployeeID:" +obj.id[0]);
		
		//and finally print each employee's
		//name along with their corresponding ID.
		
		
	}

}
