package testing.demo;

public class LambdaExp {

	public static void main(String[] args) {
		lambdaInterface l=(i)-> System.out.println("Hello---- "+i);
		l.show("Vivek");
	}
	
	
}

interface lambdaInterface{
	void show(Object i);
}



