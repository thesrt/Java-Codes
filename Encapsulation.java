package CipherSchoolCourse;

public class Encapsulation {
	public static void main(String[] args) {
		
		Amazon customer = new Amazon();
		
		float payableAmount = customer.Transaction(1000);
	}
}
class Amazon {
	
	float Transaction(float amt) {
		
		GPay gpayObj = new GPay();
		
		
		float totalAmount = amt + (amt* gpayObj.getTxnCharge());
		return totalAmount;
	}
}
class GPay{
	private float txnCharge=0.05f;
	public float getTxnCharge() {
		return txnCharge;
	}
}
