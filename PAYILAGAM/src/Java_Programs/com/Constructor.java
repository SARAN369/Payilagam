package Java_Programs.com;

public class Constructor {
	
	private static final String customerName = null;

	int aadharno, DOB, Rno;
	
	String name;
	
	// Constructor will have the same name of your class
	// No return datat type (NO VOID)
	// No method is needed for call object
	// class is initialized
	
	public Constructor(String customerName, int dob) {
		// TODO Auto-generated constructor stub
		
		name = customerName;
		
		aadharno = dob;
		
		
	}

	public Constructor(int no) {
		// TODO Auto-generated constructor stub
		
		Rno = no;
		
	}

	public static void main(String[] args) {
		
		Constructor saran = new Constructor("saran", 1234);
				
		Constructor raj = new Constructor(1234567);
		
		saran.applyLoan();
		
		// raj.applyLoan();
		
				
	}
	
	private void applyLoan() {
		// TODO Auto-generated method stub
		
		System.out.println("customerName"+name);

	}

}
