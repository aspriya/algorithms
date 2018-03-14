interface Shape {
	void draw();
}

class Rectangle implements Shape {
	@Override
	public void draw(){
		System.out.println("drawing a rectangle...");
	}
}

class Circle implements Shape {
	@Override
	public void draw(){
		System.out.println("Drawing a Circle ...");
	}
}

class Square implements Shape{
	@Override
	public void draw(){
		System.out.println("Drawing a Square ...");
	}
}

class ShapeFactory{
	public Shape getShape(String shapeType){
		if(shapeType == null)
			return null;
		if(shapeType.equalsIgnoreCase("CIRCLE"))
			return new Circle();
		else if(shapeType.equalsIgnoreCase("Rectangle"))
			return new Rectangle();
		else if(shapeType.equalsIgnoreCase("Square"))
			return new Square();
		else
			return null;
	}
}

public class FactoryPatternDemo{
	public static void main(String[] args){
		ShapeFactory shapeFac = new ShapeFactory();

		Shape shape1 = shapeFac.getShape("circle");
		Shape shape2 = shapeFac.getShape("rectangle");

		shape1.draw();
		shape2.draw();
	}
}