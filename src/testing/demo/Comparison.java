package testing.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Comparison {

	public static void main(String[] args) {
		
		
		
		List<Laptops> ls = new ArrayList<>();
		
		ls.add(new Laptops("ACER", "4gb", "250gb",300000.00 ));
		ls.add(new Laptops("DELL", "6gb", "500gb",550000.00));
		ls.add(new Laptops("LENOVO", "8gb", "1TB", 450000.00));
		ls.add(new Laptops("SONY", "16gb", "2TB",  3200000.00 ));
		ls.add(new Laptops("APPLE", "32gb", "3TB", 250000.00 ));

		ls.stream().filter((i)->i.getName().contains("A")).forEach(System.out::println);
		List<String> collect = ls.stream().filter((i)->i.getName().contains("A")).map(Laptops::getName).collect(Collectors.toList());

		System.out.println();
		
		System.out.println(collect);
		
		System.out.println();
		
		Comparator<Laptops> com = new Comparator<Laptops>() {
			
			@Override
			public int compare(Laptops lap1, Laptops lap2) {
				
				return (lap1.getPrize()<lap2.getPrize())? 2:-1;
			}
		};
		
//		ls.sort(com);

		ls.forEach(System.out::println);
		System.out.println();
		Collections.sort(ls);
	}
}

class Laptops implements Comparable<Laptops>{
	
	private String name=null;
	private String ram=null;
	private String hdd=null;
	private Double prize=0.0;
	
	public Laptops(String name, String ram, String hdd, Double prize) {
		this.name = name;
		this.ram = ram;
		this.hdd = hdd;
		this.prize = prize;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getHDD() {
		return hdd;
	}
	public void setHDD(String hDD) {
		hdd = hDD;
	}
	public Double getPrize() {
		return prize;
	}
	public void setPrize(Double prize) {
		this.prize = prize;
	}

	@Override
	public String toString() {
		return "Laptops [name=" + name + ", ram=" + ram + ", hdd=" + hdd + ", prize=" + prize + "]";
	}

	@Override
	public int compareTo(Laptops laps) {
		
		return (laps.getPrize()<this.prize)?  2 :  -1;
		
	}
	
}
