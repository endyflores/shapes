package shapes.strategy;

public class MiniShapeSimulator {
 
	public static void main(String[] args) {
 
		Ball	ball = new Ball();

		ball.performBounce();
		ball.setBounceBehavior(new BouncePowered());
		ball.performBounce();
	}
}
