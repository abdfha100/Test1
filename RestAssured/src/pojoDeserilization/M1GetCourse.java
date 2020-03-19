package pojoDeserilization;

public class M1GetCourse {
	
	private String services;
	private String expertise;
	private M2Courses courses;
	private String instructor;
	private String likedIn;
	private String url;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getServices() {
		return services;
	}
	public void setServices(String services) {
		this.services = services;
	}
	public String getExpertise() {
		return expertise;
	}
	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}
	public M2Courses getCourses() {
		return courses;
	}
	public void setCourses(M2Courses courses) {
		this.courses = courses;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public String getLikedIn() {
		return likedIn;
	}
	public void setLikedIn(String likedIn) {
		this.likedIn = likedIn;
	}
}
