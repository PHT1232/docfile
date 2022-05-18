package Controller;

import java.util.Base64;

public class PassProcess {
	public String encodepass(String str) {
		String encodepass = Base64.getEncoder().encodeToString(str.getBytes());
		return encodepass;
	}
}
