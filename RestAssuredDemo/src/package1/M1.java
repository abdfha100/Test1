package package1;

import io.restassured.RestAssured;
import static io.restassured.given;

public class M1 {
	public static void main(String[] args) {
		RestAssured.baseURI="https://maps.googleapis.com";
		given().
		param("location", -33.8670522,151.1957362).
		param("radius", 500).
		param("key", "AIzaSyAJEXtjGBB9JKgTBANkepdP5yHT_7eUjbI")
		
	}
}
