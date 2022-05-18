package Model;

public class LoginService {
	public boolean authenticate(String UserID, String Pass) {
		if (Pass == null || Pass.trim() == "") {
			return false;
		} 
		return true;
	}
}
