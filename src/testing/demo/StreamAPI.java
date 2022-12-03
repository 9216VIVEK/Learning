package testing.demo;

import java.util.ArrayList;
import java.util.List;

import testing.demo.model.EmployeeModel;

public class StreamAPI {

	public static void main(String[] args) {
	
		List<EmployeeModel> empList = new ArrayList<EmployeeModel>();
		
		
		empList.add(new EmployeeModel(1, "vivek",26 , "IT Department",250000.0));
		empList.add(new EmployeeModel(1, "himanshu",24 , "IT Department",190000.0));
		empList.add(new EmployeeModel(1, "rohit",22 , "HR",300000.0));
		empList.add(new EmployeeModel(1, "rohan",28 , "HR",320000.0));
		empList.add(new EmployeeModel(1, "aachal",31 , "SME",300000.0));
		empList.add(new EmployeeModel(1, "ankit",25 , "SME",300000.0));
		
	}

}