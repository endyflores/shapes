package shapes.strategy;

public class BounceNoWay implements BounceBehavior {
	public void bounce() {
		System.out.println("I can't bounce!!!!");
	}
}
