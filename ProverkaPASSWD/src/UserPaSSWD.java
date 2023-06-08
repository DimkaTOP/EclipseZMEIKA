import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserPaSSWD {

	public static void main(String[] args){
		
		 String login = "User";
		 
	        String password = "qwerty1234";
	        
	        String confirmPassword = "qwerty1234";
	        
	        
	        
	        System.out.println(check(login, password,confirmPassword));

	}
	public static boolean included(String str) {
        String alp = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890_";
	
    Pattern pattern = Pattern.compile("^[a-zA-Z0-9_+]*");
    
    Matcher matcher = pattern.matcher(str);
    
    return !!matcher.matches();

	}
}
