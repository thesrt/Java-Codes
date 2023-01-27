interface olaCustomer {
	void bookCab();
	void findARide();
	void rentCab();
	void rateDriver();
	void scheduleCab();
	void cancelCab();
	void raiseTicket();
	void signUp();
	void sighIn();
}
  interface olaDriver {
	  void acceptBooking();
	  void getCustomerLocation();
	  void callCustomer();
	  void customerFeedback();
	  }
  interface olaOwner {
	  void getDriveRecords();
	  void getTotalRevenue();
	  void getCustomerFeedback();
	  void addDriver();
	  void removeDriver();
	  void changeDriverStatus();
  }

public class Abstraction implements olaOwner,olaDriver,olaCustomer {
	public static void main(String[] args) {
		olaCustomer cust = new Abstraction();
		olaDriver manoj = new Abstraction();
		System.out.println("CAb Booked");
	}

	@Override
	public void bookCab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findARide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rentCab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rateDriver() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scheduleCab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelCab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void raiseTicket() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void signUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sighIn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acceptBooking() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCustomerLocation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void callCustomer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void customerFeedback() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getDriveRecords() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getTotalRevenue() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCustomerFeedback() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addDriver() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeDriver() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeDriverStatus() {
		// TODO Auto-generated method stub
		
	}

}
