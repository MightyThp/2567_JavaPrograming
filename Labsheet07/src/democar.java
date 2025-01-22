public class democar {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("Chevrolet", "Cruze", 2009, 150000.0);
		Car car2 = new Car();
		Car car3 = new Car();
		
		System.out.println(car);
		System.out.println();
		
		System.out.println("Updated car Details:");
		car2.setCompanyName("Toyota");
		car2.setModelName("Corolla");
		car2.setYear(2015);
		
		System.out.println(car2.showData());
		
		car3.setYear(1200);
		car3.setCompanyName(null);
 
	}
 
}
