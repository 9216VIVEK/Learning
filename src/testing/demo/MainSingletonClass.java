package testing.demo;

public class MainSingletonClass {

	public static void main(String[] args) {
		SingletonClass sc  = SingletonClass.getSingleInstance();
		SingletonClass sc2 = SingletonClass.getSingleInstance();
		SingletonClass sc3 = SingletonClass.getSingleInstance();
		SingletonClass sc4 = SingletonClass.getSingleInstance();
		SingletonClass sc5 = SingletonClass.getSingleInstance();

		sc.setName("vivek");
		
		System.out.println(sc.getName());
		System.out.println(sc2.getName());
		System.out.println(sc3.getName());
		sc3.setName("Ravi");
		System.out.println(sc4.getName());
		System.out.println(sc5.getName());

	}
}

class SingletonClass {

	private static SingletonClass singleInstance = null;

	private String name;

	private SingletonClass() {
	}

	public static SingletonClass getSingleInstance() {
		if (singleInstance == null) {
			singleInstance = new SingletonClass();

		}
		return singleInstance;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
