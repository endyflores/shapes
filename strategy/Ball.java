package shapes.strategy;

public class Ball extends Shape {
 
	public Ball() {
 
		bounceBehavior = new Bounce();

	}
 
	public void display() {
		System.out.println("I'm a real Ball!!!");
	}
}
