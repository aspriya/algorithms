class Animal{
	private String name;
	private int age;

	public setAge(int ag){
		if(ag > 0){
			age = ag;
		}
	}

	public static void run(){
		System.out.println("ANimal is running");
	}
}

class Tree{
	String color;
	int height;

}

public class Game{
	public static void main(String args[]){
		Animal cat = new Animal();
		cat.age = -2;

		System.out.println("name of cat is : " + cat.name);
	}

}