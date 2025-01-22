
public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ractangle r1 = new Ractangle();
		System.out.println(r1.showData());
		Spacing() ;
		System.out.println("Display data using toString() method");
		System.out.println(r1);
		Spacing();
		Ractangle r2 = new Ractangle(1.2f, 3.4f);
		System.out.println(r2);
		
		r1.setlength(5.6f);
		r1.setwidth(7.8f);
		System.out.println(r1);
		System.out.println("length is "+ r1.getlength());
		System.out.println("width is "+ r1.getwidth());
		
		Spacing();
		System.out.printf("area is %.2f%n", r1.getArea());
		System.out.printf("perimeter is %.2f",r1.getPerimeter());
		
		System.out.printf("area is %.2f%n", r2.getArea());
		System.out.printf("perimeter is %.2f",r2.getPerimeter());
		

	}
public static void Spacing() {
	System.out.println();
}
}
