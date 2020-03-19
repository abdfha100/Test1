package interface1_06;

//Interface: It is client agreement between methods and class implementation..
// ex: payCreditCard(), transfereBalance(), checkingBalance()
// class can implement the methods present in the interface...

public class M1Development implements BankingClient, DomainClient {
	
	public static void main(String[] args) {
	
	// now this class is responsible to implement ALL the methods available in the interface BankingClient
	
	M1Development m1dev = new M1Development();
	m1dev.checkingBalance();
	m1dev.payCreditCard();
	m1dev.transferBalance();
	m1dev.login();
	m1dev.investment();
	
	BankingClient bc = new M1Development();  //Run time polyporphism
	bc.checkingBalance();
	bc.payCreditCard();
	bc.transferBalance();
	
	DomainClient dc = new M1Development();  //Run time polyporphism
	dc.investment();
	
	}

	@Override
	public void payCreditCard() {
		// TODO Auto-generated method stub
		System.out.println("payCreditCard implemented");
		
	}

	@Override
	public void transferBalance() {
		// TODO Auto-generated method stub
		System.out.println("transferBalance implemented");
		
	}

	@Override
	public void checkingBalance() {
		// TODO Auto-generated method stub
		System.out.println("checkingBalance implemented");
		
	}
	
	public void login() {
		System.out.println("loggedin");
	}

	@Override
	public void investment() {
		// TODO Auto-generated method stub
		System.out.println("investment implemented");
	}
	
}
