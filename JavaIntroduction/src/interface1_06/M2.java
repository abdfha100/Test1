package interface1_06;

public class M2 implements BankingClient {
	public static void main(String[] args) {
		
		BankingClient bc = new M2();   //Run time polyporphism
		bc.checkingBalance();
		bc.payCreditCard();
		bc.transferBalance();
		
	}

	@Override
	public void payCreditCard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferBalance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkingBalance() {
		// TODO Auto-generated method stub
		
	}

}
