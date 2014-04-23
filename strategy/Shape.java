package shapes.strategy;

public abstract class Shape {
	BounceBehavior bounceBehavior;
 
	public Shape() {
	}
 
	public void setBounceBehavior (BounceBehavior bb) {
		bounceBehavior = bb;
	}

 
	abstract void display();
 
	public void performBounce() {
		bounceBehavior.bounce();
	}
}
