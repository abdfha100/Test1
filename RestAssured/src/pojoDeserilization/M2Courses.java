package pojoDeserilization;

import java.util.List;

public class M2Courses {
	
	private List<M3WebAutomation> webAutomation;
	private List<M4API> api;
	private List<M5Mobile> mobile;
	
	public List<M3WebAutomation> getWebAutomation() {
		return webAutomation;
	}
	public void setWebAutomation(List<M3WebAutomation> webAutomation) {
		this.webAutomation = webAutomation;
	}
	public List<M4API> getApi() {
		return api;
	}
	public void setApi(List<M4API> api) {
		this.api = api;
	}
	public List<M5Mobile> getMobile() {
		return mobile;
	}
	public void setMobile(List<M5Mobile> mobile) {
		this.mobile = mobile;
	}
}