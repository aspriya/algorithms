class SingleObject{
	
	//create an private static object of this class
	private static SingleObject instance = new SingleObject();

	//make the constructor of the class private so it cannoth be instantiated from out
	private SingleObject(){}

	//get the only object available (which was created in above)
	public static SingleObject getInstance(){
		return instance;
	}

	//non static method (which are methods run on the object)
	public void someMethod(){
		System.out.println("Som method being run on the single object");
	}
}

public class SingletonPatternDemo {
	public static void main(String[] args){
		SingleObject object = SingleObject.getInstance();
		object.someMethod();
	}
}