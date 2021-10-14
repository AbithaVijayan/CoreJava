package Lab;

abstract class Shape {
	 public abstract void draw();
	 public abstract void erase();
	 
	 public static void main(String[] args) {
		 Shape c=new Circle();
		 c.draw();
		 c.erase();
		 
		 Shape r=new Rectangle();
		 r.draw();
		 r.erase();
		 
		 Shape t=new Triangle();
		 t.draw();
		 t.erase();
		 
	 }
    
}

class Circle extends Shape{
	 public void draw() {
		 System.out.println("Draw circle");
	 }
	 public void erase() {
		 System.out.println("Erase Circle");
	 }
}

class Rectangle extends Shape{
	 public void draw() {
		 System.out.println("Draw Rectangle");
	 }
	 public void erase() {
		 System.out.println("Erase Rectangle");
	 }
}

class Triangle extends Shape{
	 public void draw() {
		 System.out.println("Draw Triangle");
	 }
	 public void erase() {
		 System.out.println("Erase Triangle");
	 }
}

