package basics01;

public class M4_Parent {
	public static void main(String[] args) {
		System.out.println("I navigated to home page");
		
		M3_Method m3 = new M3_Method();
		System.out.println(m3.validateHeaders());
		m3.footerVaidaion();
		System.out.println(m3.imageValidation());
	}
}
