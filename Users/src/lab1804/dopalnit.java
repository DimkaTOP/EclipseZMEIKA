package lab1804;

public class dopalnit {
	 public static class LoginValidationException extends Exception { 
	        public LoginValidationException(String message) { 
	            super(message); 
	        } 
	    } 
	    public static void validateLogin(String login) throws LoginValidationException { 
	        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[_])[A-Za-z\\d_]{1,20}$"; 
	        if (!login.matches(regex)) { 
	            throw new LoginValidationException("Некорректный логин"); 
	        } 
	    } 
	    public static boolean isLoginValid(String login) { 
	        try { 
	            validateLogin(login); 
	            return true; 
	        } catch (LoginValidationException e) { 
	            return false; 
	        } 
	    } 
	    public static void main(String[] args) { 
	        String login1 = "uSeR_123"; 
	        String login2 = "USeR_123"; 
	        String login3 = "user123"; 
	        System.out.println(isLoginValid(login1)); 
	        System.out.println(isLoginValid(login2)); 
	        System.out.println(isLoginValid(login3));  
	    } 
	}


