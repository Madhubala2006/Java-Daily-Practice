package Interface;

public class MainShapeResult {

	public static void main(String[] args) {
		Square sq = new Square();
		sq.calculate_area();
		
		Sphere sp = new Sphere();
		sp.calculate_area();
		sp.calculate_volume();

	}

}
