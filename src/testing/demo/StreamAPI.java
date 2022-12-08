package testing.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import testing.demo.model.EmployeeModel;

public class StreamAPI {

	public static void main(String[] args) throws IOException {
	
		List<EmployeeModel> empList = new ArrayList<EmployeeModel>();
		
		
		empList.add(new EmployeeModel(1, "Vivek",26 , "IT Department",250000.0));
		empList.add(new EmployeeModel(2, "himanshu",24 , "IT Department",190000.0));
		empList.add(new EmployeeModel(3, "rohit",22 , "HR",300000.0));
		empList.add(new EmployeeModel(4, "Rohan",28 , "HR",320000.0));
		empList.add(new EmployeeModel(5, "Aachal",31 , "SME",300000.0));
		empList.add(new EmployeeModel(6, "ankit",25 , "SME",300000.0));
		

//		empList.stream().filter((x)->x.getName().toLowerCase().startsWith("r")).forEach(x->System.out.print(x.getName()+" "));
		
//		Stream<String>  lines = Files.lines(Paths.get("D:/data.txt"));
//		
//		lines.map((t -> t.split(","))).filter(t -> t.length>=3).forEach(t -> System.out.println(t[0]+" "+t[1]+" "+t[2]));
//		lines.close();
		
		List<String> collect = empList.stream().map(t -> t.getDepartment())
		.collect(Collectors.toList());
		
		Set<String> collect2 = collect.stream().filter(t -> Collections.frequency(collect, t)>1)
		.collect(Collectors.toSet());
		
		
//		  Map<String, Long> collect = empList.stream().map(t -> t.getDepartment())
//		  .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		 
//		  List<String> collect2 = collect.entrySet().stream().filter(t -> t.getValue()>1).map(t -> t.getKey()).collect(Collectors.toList());
//		
//		Set<String> set = new HashSet<>();
//		
//		List<String> collect = empList.stream().map(t->t.getDepartment()).filter(t -> !set.add(t))
//		.collect(Collectors.toList());
		
		System.out.print(collect2);
		
		
		
		//Predicate functional interface demo
//		Predicate<Integer> pre = (val)-> val<20;
//		System.out.println(pre.test(10));
//		
//		//consumer functional interface demo
//		Consumer<String> con =  (name)->System.out.println(name);
//		con.accept("himanshu");
//		
//		//Function functional interface demo
//		Function<Integer, String> fun = (name)-> name+2+"";
//		System.out.println(fun.apply(20));
//		
//		//Supplier functional interface demo
//		Supplier<String> sup = ()-> "vivek";
//		System.out.println(sup.get());
		
	}
}