package lab1804;

import lab1804.User.Query;

public class za4a {
	private String login;
    private String password;
	public za4a(String login, String password) {
		this.login = login;
        this.password = password;
	class OuterClass {
	    class NestedClass {
	    	
	    }
	}	
	}
	 public void createQuery() {
	        Query query = new Query();
	        query.printToLog();
	    }
	    public class Query {
	        public void printToLog() {
	            System.out.println("Запрос отправлен от пользователя с логином: " + login + " и паролем: " + password);
	        }
	    }
	    public static void main(String[] args) {
	        User user = new User("Name1", "password1");
	        user.createQuery();
	        User.Query query2 = new User("Name2", "password2").new Query();
	        query2.printToLog();
	    }
	}


