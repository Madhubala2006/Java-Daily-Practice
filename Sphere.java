package Interface;

public class Sphere implements Shape1, Shape2 {
		double radius = 5.6;
		public void calculate_volume() {
			double result = ((4/3)*pi*radius*radius*radius);
			System.out.println("Volume of Sphere=" + result);
		}
		@Override
		public void calculate_area() {
			double result = (4*pi*radius*radius);
			System.out.println("Surface area of Sphere=" + result);
			
		}

}
