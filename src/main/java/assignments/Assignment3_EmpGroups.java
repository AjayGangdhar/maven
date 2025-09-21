package assignments;

public class Assignment3_EmpGroups {

	public static void main(String[] args) {
	
		Assignment3_Employees emp = new Assignment3_Employees();
		
		String [] empNames= {emp.empName1,emp.empName2,emp.empName3};
		int [] empIDs= {emp.empId1,emp.empId2,emp.empId3};
		
		for (int i=0; i< empNames.length; i++) {
			System.out.println("Employee Name: " + empNames[i] +", Employee ID: " + empIDs[i]);
		}

	}

}
