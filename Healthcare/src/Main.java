public class Main {
	public static void main(String[] args) {
	
		Doctor d1= new Doctor();
		Doctor d2= new Doctor();
		
		d1.name = "sathees";
		d1.age = 36.6F;
		
		d2.name = "kumar";
		d2.age = 38.5F;
		
		System.out.println("Doctor1 name is "+d1.name);
		System.out.println("Doctor2 name is "+d2.name);
		
		d1.examinePatient();

	}

}
